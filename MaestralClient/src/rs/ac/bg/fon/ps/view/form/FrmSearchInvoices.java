/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Katarina
 */
public class FrmSearchInvoices extends javax.swing.JDialog {

    /**
     * Creates new form FrmSearchInvoices
     */
    public FrmSearchInvoices(java.awt.Frame parent, boolean modal) {
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
        jPanel2 = new javax.swing.JPanel();
        txtSearchNumber = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        cmbFilter = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnCancelFilter = new javax.swing.JButton();
        txtSearchPartner = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tblScroll = new javax.swing.JScrollPane();
        tblInvoices = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("rs/ac/bg/fon/ps/resources/Bundle"); // NOI18N
        setTitle(bundle.getString("FrmSearchInvoices.title.INVOICES")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(101, 149, 224));

        txtSearchNumber.setBackground(new java.awt.Color(101, 149, 224));
        txtSearchNumber.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSearchNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtSearchNumber.setBorder(null);
        txtSearchNumber.setCaretColor(new java.awt.Color(255, 255, 255));

        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/search-number.png"))); // NOI18N

        cmbFilter.setBackground(new java.awt.Color(101, 149, 224));
        cmbFilter.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmbFilter.setForeground(new java.awt.Color(255, 255, 255));
        cmbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFilter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText(bundle.getString("FrmSearchInvoices.button.SEARCH")); // NOI18N

        btnCancelFilter.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelFilter.setText(bundle.getString("FrmSearchInvoices.button.CANCEL_FILTER")); // NOI18N

        txtSearchPartner.setBackground(new java.awt.Color(101, 149, 224));
        txtSearchPartner.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSearchPartner.setForeground(new java.awt.Color(255, 255, 255));
        txtSearchPartner.setBorder(null);
        txtSearchPartner.setCaretColor(new java.awt.Color(255, 255, 255));

        jDateChooser.setBackground(new java.awt.Color(101, 149, 224));
        jDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser.setDateFormatString("dd.MM.yyyy.");
        jDateChooser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(101, 149, 224));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(bundle.getString("FrmSearchInvoices.label.INVOICE_NUMBER")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(101, 149, 224));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("FrmSearchInvoices.label.PARTNER")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtSearchNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearchPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearchNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchPartner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelFilter)
                        .addGap(82, 82, 82))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelFilter, btnSearch, cmbFilter, txtSearchNumber});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooser, txtSearchPartner});

        tblInvoices.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInvoices.setGridColor(new java.awt.Color(255, 255, 255));
        tblInvoices.setRowHeight(20);
        tblInvoices.setSelectionBackground(new java.awt.Color(176, 204, 247));
        tblInvoices.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblInvoices.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblScroll.setViewportView(tblInvoices);

        btnDetails.setBackground(new java.awt.Color(101, 149, 224));
        btnDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDetails.setText(bundle.getString("FrmSearchInvoices.button.SEE_DETAILS")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tblScroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnDetails)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelFilter;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Object> cmbFilter;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblInvoices;
    private javax.swing.JScrollPane tblScroll;
    private javax.swing.JTextField txtSearchNumber;
    private javax.swing.JTextField txtSearchPartner;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        txtSearchNumber.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
        txtSearchPartner.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
        cmbFilter.setRenderer(new DefaultListCellRenderer() {
            @Override
            public void paint(Graphics g) {
                setBackground(Color.white);
                setForeground(Color.BLACK);
                super.paint(g);
            }
        });

        JTableHeader header = tblInvoices.getTableHeader();
        header.setBackground(new Color(101,149,224));
        header.setForeground(Color.white);
        header.setFont(new Font("Tahoma", Font.BOLD, 15));
        tblScroll.getViewport().setBackground(Color.white);
    }

    public JTextField getTxtSearchNumber() {
        return txtSearchNumber;
    }

    public JComboBox<Object> getCmbFilter() {
        return cmbFilter;
    }

    public JTable getTblInvoices() {
        return tblInvoices;
    }

    public void btnDetailsAddActionListener(ActionListener actionListener) {
        btnDetails.addActionListener(actionListener);
    }

    public JDateChooser getjDateChooser() {
        return jDateChooser;
    }

    public void btnSearchAddActionListener(ActionListener actionListener) {
        btnSearch.addActionListener(actionListener);
    }

    public JTextField getTxtSearchPartner() {
        return txtSearchPartner;
    }

    public void btnCancelFilterAddActionListener(ActionListener actionListener) {
        btnCancelFilter.addActionListener(actionListener);
    }
}
