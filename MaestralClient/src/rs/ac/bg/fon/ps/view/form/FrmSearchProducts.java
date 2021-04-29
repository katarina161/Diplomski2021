/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Katarina
 */
public class FrmSearchProducts extends javax.swing.JDialog {

    /**
     * Creates new form FrmViewProducts
     */
    public FrmSearchProducts(java.awt.Frame parent, boolean modal) {
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
        btnAdd = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtArticle = new javax.swing.JTextField();
        cmbCategories = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnCancelFilter = new javax.swing.JButton();
        tblScroll = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle"); // NOI18N
        setTitle(bundle.getString("FrmSearchProducts.title.PRODUCTS")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setBackground(new java.awt.Color(2, 26, 126));
        btnAdd.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText(bundle.getString("FrmSearchProducts.button.ADD")); // NOI18N

        btnDetails.setBackground(new java.awt.Color(2, 26, 126));
        btnDetails.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDetails.setText(bundle.getString("FrmSearchProducts.button.DETAILS")); // NOI18N

        jLabel1.setText(bundle.getString("FrmSearchProducts.label.ARTICLE:")); // NOI18N

        cmbCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(2, 26, 126));
        btnSearch.setText(bundle.getString("FrmSearchProducts.button.SEARCH")); // NOI18N

        btnCancelFilter.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelFilter.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelFilter.setForeground(new java.awt.Color(2, 26, 126));
        btnCancelFilter.setText(bundle.getString("FrmSearchProducts.button.CANCEL_FILTER")); // NOI18N

        tblProducts.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProducts.setGridColor(new java.awt.Color(255, 255, 255));
        tblProducts.setRowHeight(22);
        tblProducts.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tblScroll.setViewportView(tblProducts);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnCancelFilter)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetails)
                        .addGap(0, 132, Short.MAX_VALUE))
                    .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelFilter;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Object> cmbCategories;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JScrollPane tblScroll;
    private javax.swing.JTextField txtArticle;
    // End of variables declaration//GEN-END:variables


    public JTable getTblProducts() {
        return tblProducts;
    }

    public void btnDetailsAddActionListener(ActionListener actionListener) {
        btnDetails.addActionListener(actionListener);
    }

    public void btnAddAddActionListener(ActionListener actionListener) {
        btnAdd.addActionListener(actionListener);
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JComboBox<Object> getCmbCategories() {
        return cmbCategories;
    }

    public JTextField getTxtArticle() {
        return txtArticle;
    }

    private void prepareView() {
        txtArticle.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(2,26,126)));
        cmbCategories.setRenderer(new DefaultListCellRenderer() {
            @Override
            public void paint(Graphics g) {
                setBackground(Color.white);
                setForeground(Color.BLACK);
                super.paint(g);
            }
        });

        JTableHeader header = tblProducts.getTableHeader();
        header.setBackground(new Color(2,26,126));
        header.setForeground(Color.white);
        header.setFont(new Font("Tahoma", Font.BOLD, 15));
        tblScroll.getViewport().setBackground(Color.white);
    }

    public void btnSearchAddActionListener(ActionListener actionListener) {
        btnSearch.addActionListener(actionListener);
    }

    public void btnCancelFilterAddActionListener(ActionListener actionListener) {
        btnCancelFilter.addActionListener(actionListener);
    }
    
}
