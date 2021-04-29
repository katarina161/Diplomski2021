/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.component.table;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ps.domain.Invoice;
import rs.ac.bg.fon.ps.domain.InvoiceItem;
import rs.ac.bg.fon.ps.domain.Product;
import rs.ac.bg.fon.ps.util.InvoiceItemStatus;

/**
 *
 * @author Katarina
 */
public class InvoiceItemTableModel extends AbstractTableModel {

    private final String[] columnNames = new String[]{
        java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle").getString("FrmInvoice.table.ORDER_NUMBER"),
        java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle").getString("FrmInvoice.table.PRODUCT"),
        java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle").getString("FrmInvoice.table.SIZE"),
        java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle").getString("FrmInvoice.table.PRICE"),
        java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle").getString("FrmInvoice.table.QUANTITY")};

    private final Class[] columnClasses = new Class[]{Integer.class, Product.class, Integer.class, BigDecimal.class, Integer.class};
    private Invoice invoice;
    private List<InvoiceItem> itemsToShow;

    public InvoiceItemTableModel() {
        invoice = new Invoice();
        itemsToShow = new ArrayList<>();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    @Override
    public int getRowCount() {
        return itemsToShow.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceItem item = itemsToShow.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return item.getOrderNumber();
            case 1:
                return item.getProduct();
            case 2:
                return item.getSize();
            case 3:
                return item.getPrice().setScale(2, RoundingMode.HALF_UP).doubleValue();
            case 4:
                return item.getQuantity();
            default:
                return "N/A";
        }
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        if (columnIndex == 4) {
            InvoiceItem temp = itemsToShow.get(rowIndex);
            int index = invoice.getItems().indexOf(temp);
            InvoiceItem item = invoice.getItems().get(index);
            int quantity = (int) value;
            if (quantity > 0) {
                item.setQuantity(quantity);
                item.setTotal(item.getPrice().multiply(new BigDecimal(item.getQuantity())));
                if (item.getStatus() == null) {
                    item.setStatus(InvoiceItemStatus.UPDATE);
                }
                updateInvoiceTotalPrice();
            }
        }

    }

    public List<InvoiceItem> getItems() {
        List<InvoiceItem> items = new ArrayList<>();
        for (InvoiceItem item: invoice.getItems()) {
            if (item.getStatus() == null || !item.getStatus().equals(InvoiceItemStatus.DELETE)) {
                items.add(item);
            }
        }
        return items;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void addInvoiceItem(InvoiceItem itm) {
        InvoiceItem item = null;
        for (int i = 0; i < invoice.getItems().size(); i++) {
            InvoiceItem invoiceItem = invoice.getItems().get(i);
            if (invoiceItem.getStatus() != null && invoiceItem.getStatus().equals(InvoiceItemStatus.DELETE)) {
                continue;
            }
            if (invoiceItem.getProduct().equals(itm.getProduct())
                    && invoiceItem.getSize() == itm.getSize()) {
                if (invoiceItem.getStatus() == null) {
                    invoiceItem.setStatus(InvoiceItemStatus.UPDATE);
                }
                item = invoiceItem;
                item.setQuantity(itm.getQuantity() + invoiceItem.getQuantity());
            }
        }
        if (item == null) {
            item = itm;
            item.setInvoice(invoice);
            item.setOrderNumber(itemsToShow.size() + 1);
            item.setStatus(InvoiceItemStatus.INSERT);
            invoice.getItems().add(item);
        }
        item.setTotal(item.getPrice().multiply(new BigDecimal(item.getQuantity())));
        updateInvoiceTotalPrice();
    }

    public void removeveInvoiceItem(int row) {
        InvoiceItem temp = itemsToShow.get(row);
        int index = invoice.getItems().indexOf(temp);
        InvoiceItem invoiceItem = invoice.getItems().get(index);
        if (invoiceItem.getStatus() != null && invoiceItem.getStatus().equals(InvoiceItemStatus.INSERT)) {
            invoice.getItems().remove(index);
        } else {
            invoice.getItems().get(index).setStatus(InvoiceItemStatus.DELETE);
        }
        setOrderNumbers();
        updateInvoiceTotalPrice();
    }

    private void setOrderNumbers() {
        int num = 0;
        for (InvoiceItem item : invoice.getItems()) {
            if (item.getStatus() == null || !item.getStatus().equals(InvoiceItemStatus.DELETE)) {
                if ((item.getOrderNumber() != (num + 1)) && item.getStatus() == null) {
                    item.setStatus(InvoiceItemStatus.UPDATE);
                }
                item.setOrderNumber(++num);
            }
        }
    }

    private void updateInvoiceTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (InvoiceItem item : invoice.getItems()) {
            if (item.getStatus() == null || !item.getStatus().equals(InvoiceItemStatus.DELETE)) {
                total = total.add(item.getTotal());
            }
        }
        invoice.setTotal(total);
        refreshTableData();
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
        setItemsToShow();
    }

    private void setItemsToShow() {
        itemsToShow = new ArrayList<>();
        for (InvoiceItem item : invoice.getItems()) {
            if (item.getStatus() == null || !item.getStatus().equals(InvoiceItemStatus.DELETE)) {
                itemsToShow.add(item);
            }
        }
    }

    private void refreshTableData() {
        setItemsToShow();
        fireTableDataChanged();
    }

}
