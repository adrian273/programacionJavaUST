/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermecanica;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class AplicationGUI extends javax.swing.JFrame {

    /**
     * Creates new form AplicationGUI
     */
    public AplicationGUI() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mainClientes = new javax.swing.JMenuItem();
        mainCrudVehiculo = new javax.swing.JMenuItem();
        mainCrudRegistro = new javax.swing.JMenuItem();
        jMainUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1262, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mainClientes.setText("Clientes");
        mainClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainClientesActionPerformed(evt);
            }
        });
        jMenu1.add(mainClientes);

        mainCrudVehiculo.setText("Vehiculos");
        mainCrudVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainCrudVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(mainCrudVehiculo);

        mainCrudRegistro.setText("Registros");
        mainCrudRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainCrudRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(mainCrudRegistro);

        jMainUsuarios.setText("Usuarios");
        jMainUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMainUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMainUsuarios);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainClientesActionPerformed
        // TODO add your handling code here:
        CrudClientes cc;
        try {
            cc = new CrudClientes();
            this.jDesktopPane1.add(cc);
            cc.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AplicationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mainClientesActionPerformed

    private void mainCrudVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainCrudVehiculoActionPerformed
        // TODO add your handling code here:
        CrudAutoMovil ca;
        try {
            ca = new CrudAutoMovil();
            this.jDesktopPane1.add(ca);
            ca.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AplicationGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AplicationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mainCrudVehiculoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mainCrudRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainCrudRegistroActionPerformed
        // TODO add your handling code here:
        CrudRegistro cr;
        try {
            cr = new CrudRegistro();
            this.jDesktopPane1.add(cr);
            cr.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AplicationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mainCrudRegistroActionPerformed

    private void jMainUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMainUsuariosActionPerformed
        // TODO add your handling code here:
        CrudUsuarios cu;
        try {
            cu = new CrudUsuarios();
            this.jDesktopPane1.add(cu);
            cu.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AplicationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMainUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AplicationGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMainUsuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mainClientes;
    private javax.swing.JMenuItem mainCrudRegistro;
    private javax.swing.JMenuItem mainCrudVehiculo;
    // End of variables declaration//GEN-END:variables
}
