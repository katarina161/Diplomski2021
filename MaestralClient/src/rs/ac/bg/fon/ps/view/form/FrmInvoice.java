/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Katarina
 */
public class FrmInvoice extends javax.swing.JDialog {

    /**
     * Creates new form FrmInvoice
     */
    public FrmInvoice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbCanceled = new javax.swing.JCheckBox();
        cbProcessed = new javax.swing.JCheckBox();
        panelInvoice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblInvoicePic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPartner = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tblScroll = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        btnRemoveItem = new javax.swing.JButton();
        panelItem = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbProducts = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbSizes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        lblAddItemError = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPDF = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle"); // NOI18N
        setTitle(bundle.getString("FrmInvoice.title.INVOICE")); // NOI18N
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbCanceled.setBackground(new java.awt.Color(255, 255, 255));
        cbCanceled.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbCanceled.setText(bundle.getString("FrmInvoice.cb.CANCELED")); // NOI18N
        cbCanceled.setEnabled(false);

        cbProcessed.setBackground(new java.awt.Color(255, 255, 255));
        cbProcessed.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbProcessed.setText(bundle.getString("FrmInvoice.cb.PROCESSED")); // NOI18N
        cbProcessed.setEnabled(false);

        panelInvoice.setBackground(new java.awt.Color(101, 149, 224));
        panelInvoice.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maestral");

        lblInvoicePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/invoice-pic.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(bundle.getString("FrmInvoice.label.INVOICE")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(bundle.getString("FrmInvoice.label.INVOICE_NUMBER")); // NOI18N

        txtNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNumber.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(bundle.getString("FrmInvoice.label.DATE")); // NOI18N

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtDate.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(bundle.getString("FrmInvoice.label.PARTNER")); // NOI18N

        txtPartner.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtPartner.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(bundle.getString("FrmInvoice.label.CREATED_BY")); // NOI18N

        javax.swing.GroupLayout panelInvoiceLayout = new javax.swing.GroupLayout(panelInvoice);
        panelInvoice.setLayout(panelInvoiceLayout);
        panelInvoiceLayout.setHorizontalGroup(
            panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInvoiceLayout.createSequentialGroup()
                .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInvoiceLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInvoicePic)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(540, 540, 540)
                        .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInvoiceLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInvoiceLayout.createSequentialGroup()
                                .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInvoiceLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelInvoiceLayout.setVerticalGroup(
            panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInvoiceLayout.createSequentialGroup()
                        .addComponent(lblInvoicePic, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(panelInvoiceLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        tblItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblItems.setGridColor(new java.awt.Color(255, 255, 255));
        tblItems.setOpaque(false);
        tblItems.setRowHeight(20);
        tblItems.setSelectionBackground(new java.awt.Color(101, 149, 224));
        tblItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblScroll.setViewportView(tblItems);

        btnRemoveItem.setBackground(new java.awt.Color(204, 0, 0));
        btnRemoveItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRemoveItem.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveItem.setText(bundle.getString("FrmInvoice.button.REMOVE_ITEM")); // NOI18N

        panelItem.setBackground(new java.awt.Color(255, 255, 255));
        panelItem.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("FrmInvoice.border.TITLE"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText(bundle.getString("FrmInvoice.label.PRODUCT")); // NOI18N

        cmbProducts.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmbProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProducts.setSelectedIndex(-1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText(bundle.getString("FrmInvoice.label.SIZE")); // NOI18N

        cmbSizes.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmbSizes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSizes.setSelectedIndex(-1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText(bundle.getString("FrmInvoice.label.PRICE")); // NOI18N

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText(bundle.getString("FrmInvoice.label.QUANTITY")); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnAddItem.setBackground(new java.awt.Color(92, 181, 62));
        btnAddItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setText(bundle.getString("FrmInvoice.button.ADD")); // NOI18N

        lblAddItemError.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout panelItemLayout = new javax.swing.GroupLayout(panelItem);
        panelItem.setLayout(panelItemLayout);
        panelItemLayout.setHorizontalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelItemLayout.createSequentialGroup()
                        .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cmbSizes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAddItemError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelItemLayout.setVerticalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblAddItemError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddItem)
                .addGap(19, 19, 19))
        );

        panelItemLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbProducts, cmbSizes, txtPrice, txtQuantity});

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/invoice-save.png"))); // NOI18N
        btnSave.setText(bundle.getString("FrmInvoice.button.SAVE")); // NOI18N

        btnClose.setBackground(new java.awt.Color(204, 204, 204));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnClose.setText(bundle.getString("FrmInvoice.button.CLOSE")); // NOI18N

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/invoice-cancel.png"))); // NOI18N
        btnCancel.setText(bundle.getString("FrmInvoice.button.CANCEL_INVOICE")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(176, 204, 247));

        jPanel3.setBackground(new java.awt.Color(101, 149, 224));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(bundle.getString("FrmInvoice.label.TOTAL")); // NOI18N

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTotal.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RSD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/pdf.png"))); // NOI18N
        lblPDF.setToolTipText(bundle.getString("FrmInvoice.tip.PDF")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblPDF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEdit.setBackground(new java.awt.Color(204, 204, 204));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/invoice-edit.png"))); // NOI18N
        btnEdit.setText(bundle.getString("FrmInvoice.button.EDIT_INVOICE")); // NOI18N

        btnProcess.setBackground(new java.awt.Color(204, 204, 204));
        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/invoice-process.png"))); // NOI18N
        btnProcess.setText(bundle.getString("FrmInvoice.button.PROCESS")); // NOI18N

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/invoice-delete.png"))); // NOI18N
        btnDelete.setText(bundle.getString("FrmInvoice.button.DELETE")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbProcessed)
                        .addGap(18, 18, 18)
                        .addComponent(cbCanceled)
                        .addGap(675, 675, 675)
                        .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelItem, tblScroll});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panelInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCanceled)
                    .addComponent(cbProcessed)
                    .addComponent(btnRemoveItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(panelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClose)
                        .addComponent(btnCancel)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(btnEdit)
                        .addComponent(btnProcess)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbCanceled;
    private javax.swing.JCheckBox cbProcessed;
    private javax.swing.JComboBox<Object> cmbProducts;
    private javax.swing.JComboBox<Object> cmbSizes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddItemError;
    private javax.swing.JLabel lblInvoicePic;
    private javax.swing.JLabel lblPDF;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelInvoice;
    private javax.swing.JPanel panelItem;
    private javax.swing.JTable tblItems;
    private javax.swing.JScrollPane tblScroll;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPartner;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        JTableHeader header = tblItems.getTableHeader();
        header.setBackground(new Color(101, 149, 224));
        header.setForeground(Color.white);
        header.setFont(new Font("Tahoma", Font.BOLD, 15));
        tblScroll.getViewport().setBackground(Color.white);
    }

    public JButton getBtnAddItem() {
        return btnAddItem;
    }

    public JButton getBtnRemoveItem() {
        return btnRemoveItem;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnProcess() {
        return btnProcess;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JCheckBox getCbCanceled() {
        return cbCanceled;
    }

    public JCheckBox getCbProcessed() {
        return cbProcessed;
    }

    public JComboBox<Object> getCmbProducts() {
        return cmbProducts;
    }

    public JComboBox<Object> getCmbSizes() {
        return cmbSizes;
    }

    public JPanel getPanelItem() {
        return panelItem;
    }

    public JTable getTblItems() {
        return tblItems;
    }

    public JTextField getTxtDate() {
        return txtDate;
    }

    public JTextField getTxtNumber() {
        return txtNumber;
    }

    public JTextField getTxtPartner() {
        return txtPartner;
    }

    public JTextField getTxtPrice() {
        return txtPrice;
    }

    public JTextField getTxtQuantity() {
        return txtQuantity;
    }

    public JLabel getLblTotal() {
        return lblTotal;
    }

    public JLabel getLblUser() {
        return lblUser;
    }

    public JLabel getLblAddItemError() {
        return lblAddItemError;
    }

    public JLabel getLblPDF() {
        return lblPDF;
    }

    public void btnAddItemAddActionListener(ActionListener actionListener) {
        btnAddItem.addActionListener(actionListener);
    }

    public void tblItemsAddSelectionListener(ListSelectionListener listSelectionListener) {
        tblItems.getSelectionModel().addListSelectionListener(listSelectionListener);
    }

    public void btnRemoveItemAddActionListener(ActionListener actionListener) {
        btnRemoveItem.addActionListener(actionListener);
    }

    public void btnCloseAddActionListener(ActionListener actionListener) {
        btnClose.addActionListener(actionListener);
    }

    public void btnSaveAddActionListener(ActionListener actionListener) {
        btnSave.addActionListener(actionListener);
    }

    public void btnEditAddActionListener(ActionListener actionListener) {
        btnEdit.addActionListener(actionListener);
    }

    public void btnProcessAddActionListener(ActionListener actionListener) {
        btnProcess.addActionListener(actionListener);
    }

    public void btnDeleteAddActionListener(ActionListener actionListener) {
        btnDelete.addActionListener(actionListener);
    }

    public void btnCancelAddActionListener(ActionListener actionListener) {
        btnCancel.addActionListener(actionListener);
    }

    public void lblPDFAddMouseListener(MouseAdapter mouseAdapter) {
        lblPDF.addMouseListener(mouseAdapter);
    }

}
