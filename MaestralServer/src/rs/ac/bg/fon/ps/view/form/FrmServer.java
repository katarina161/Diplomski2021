/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.form;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 *
 * @author Katarina
 */
public class FrmServer extends javax.swing.JFrame {

    /**
     * Creates new form FrmServer
     */
    public FrmServer() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        lblStatusIcon = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuServer = new javax.swing.JMenu();
        miServerStart = new javax.swing.JMenuItem();
        miServerStop = new javax.swing.JMenuItem();
        menuConfiguration = new javax.swing.JMenu();
        miConfigServer = new javax.swing.JMenuItem();
        miConfigDatabase = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server aplication");

        jPanel1.setBackground(new java.awt.Color(189, 201, 219));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Server status:");

        lblStatusIcon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblStatusIcon.setToolTipText("");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        menuServer.setBackground(new java.awt.Color(255, 255, 255));
        menuServer.setText("Server");
        menuServer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        miServerStart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miServerStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/server-start.png"))); // NOI18N
        miServerStart.setText("Start");
        menuServer.add(miServerStart);

        miServerStop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miServerStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/ac/bg/fon/ps/view/image/server-stop.png"))); // NOI18N
        miServerStop.setText("Stop");
        menuServer.add(miServerStop);

        jMenuBar1.add(menuServer);

        menuConfiguration.setBackground(new java.awt.Color(255, 255, 255));
        menuConfiguration.setText("Configuration");
        menuConfiguration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        miConfigServer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miConfigServer.setText("Server");
        menuConfiguration.add(miConfigServer);

        miConfigDatabase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miConfigDatabase.setText("Database");
        menuConfiguration.add(miConfigDatabase);

        jMenuBar1.add(menuConfiguration);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatusIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatusIcon;
    private javax.swing.JMenu menuConfiguration;
    private javax.swing.JMenu menuServer;
    private javax.swing.JMenuItem miConfigDatabase;
    private javax.swing.JMenuItem miConfigServer;
    private javax.swing.JMenuItem miServerStart;
    private javax.swing.JMenuItem miServerStop;
    // End of variables declaration//GEN-END:variables


    public JLabel getLblStatusIcon() {
        return lblStatusIcon;
    }

    public JMenuItem getMiServerStop() {
        return miServerStop;
    }

    public JMenuItem getMiServerStart() {
        return miServerStart;
    }

    public void jmiServerStartAddActionListener(ActionListener actionListener) {
        miServerStart.addActionListener(actionListener);
    }

    public void jmiServerStopAddActionListener(ActionListener actionListener) {
        miServerStop.addActionListener(actionListener);
    }

    public void jmiConfigServerAddActionListener(ActionListener actionListener) {
        miConfigServer.addActionListener(actionListener);
    }

    public void jmiConfigDatabaseAddActionListener(ActionListener actionListener) {
        miConfigDatabase.addActionListener(actionListener);
    }
    
}
