/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rs.ac.bg.fon.ps.util.InvoiceItemStatus;

/**
 *
 * @author Katarina
 */
public class InvoiceItem implements DomainObject, Serializable {

    private Long id;
    private Invoice invoice;
    private int orderNumber;
    private Product product;
    private int size;
    private int quantity;
    private BigDecimal price;
    private BigDecimal total;
    private InvoiceItemStatus status;

    public InvoiceItem() {
    }

    public InvoiceItem(Invoice invoice, int orderNumber, Product product, int size, int quantity, BigDecimal price, BigDecimal total) {
        this.invoice = invoice;
        this.orderNumber = orderNumber;
        this.product = product;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public InvoiceItemStatus getStatus() {
        return status;
    }

    public void setStatus(InvoiceItemStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InvoiceItem other = (InvoiceItem) obj;
        if (!Objects.equals(this.invoice, other.invoice)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        return true;
    }

    @Override
    public String getTableName() {
        return "invoice_item";
    }

    @Override
    public String getParameterNames() {
        return "invoice_id, order_number, product_article, size, quantity, price, total";
    }

    @Override
    public String getParameterValues() {
        return String.format("%s, %s, %s, %s, %s, %s, %s",
                invoice.getId(), orderNumber, product.getArticle(), size, quantity, price, total);
    }

    @Override
    public String getPrimaryKeyName() {
        return "id";
    }

    @Override
    public Long getPrimaryKeyValue() {
        return id;
    }

    @Override
    public void setPrimaryKey(Long key) {
        this.id = key;
    }

    @Override
    public String getJoinCondition() {
        return "JOIN invoice i ON i.id = ii.invoice_id";
    }

    @Override
    public String getAllias() {
        return "ii";
    }

    @Override
    public String getUpdateQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append("order_number=").append(orderNumber)
                .append(", quantity=").append(quantity)
                .append(", total=").append(total);
        return sb.toString();
    }

    @Override
    public List<DomainObject> convertRSList(ResultSet rs) {
        List<DomainObject> list = new ArrayList<>();
        try {
            while (rs.next()) {
                Invoice i = new Invoice();
                i.setId(rs.getLong("i.id"));

                Product p = new Product();
                p.setArticle(rs.getLong("ii.product_article"));

                InvoiceItem ii = new InvoiceItem();
                ii.setInvoice(i);
                ii.setId(rs.getLong("ii.id"));
                ii.setOrderNumber(rs.getInt("ii.order_number"));
                ii.setQuantity(rs.getInt("ii.quantity"));
                ii.setPrice(rs.getBigDecimal("ii.price"));
                ii.setTotal(rs.getBigDecimal("ii.total"));
                ii.setProduct(p);
                ii.setSize(rs.getInt("ii.size"));

                list.add(ii);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR ResultSet " + getTableName());
        }
        return list;
    }

}
