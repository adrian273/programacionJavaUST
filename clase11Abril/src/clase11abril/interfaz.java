/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11abril;

import java.util.ArrayList;

/**
 *
 * @author kdr
 */
public class interfaz extends javax.swing.JFrame {

    ArrayList<Persona> lista = new ArrayList<>();

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        posicion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbEstadoCivil = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        cCiudad = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        lblPos = new javax.swing.JLabel();
        rbSoltero = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbViudo = new javax.swing.JRadioButton();
        chbMayor = new javax.swing.JCheckBox();
        chbPermiso = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("E - mail");

        jLabel3.setText("ciudad");

        cCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setText("guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAtras.setText("atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAdelante.setText("adelante");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        lblPos.setText("jLabel4");

        gbEstadoCivil.add(rbSoltero);
        rbSoltero.setText("soltero");
        rbSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSolteroActionPerformed(evt);
            }
        });

        gbEstadoCivil.add(rbCasado);
        rbCasado.setText("casado");

        gbEstadoCivil.add(rbViudo);
        rbViudo.setText("viudo");

        chbMayor.setText("mayor Edad");

        chbPermiso.setText("Permiso conducir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfNombre)
                                        .addComponent(tfEmail)
                                        .addComponent(cCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAtras)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdelante))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbSoltero)
                                    .addComponent(rbViudo)
                                    .addComponent(rbCasado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbPermiso)
                                    .addComponent(chbMayor))
                                .addGap(28, 28, 28)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnAdelante)
                    .addComponent(lblPos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSoltero)
                    .addComponent(chbMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCasado)
                    .addComponent(chbPermiso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbViudo)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      private void posicion() {
        lblPos.setText(String.valueOf(lista.size()));
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here
        Persona p = new Persona();
        p.setNombre(tfNombre.getText());
        p.setEmail(tfEmail.getText());
        p.setCiudad((String) cCiudad.getSelectedItem());
        if (rbSoltero.isSelected()) {
            p.setEstadoCivil("soltero");
        } else if (rbCasado.isSelected()) {
            p.setEstadoCivil("casado");
        } else if (rbViudo.isSelected()) {
            p.setEstadoCivil("viudo");
        }

        if (chbMayor.isSelected()) {
            p.setMayorEdad(true);
        } else {
            p.setMayorEdad(false);
        }

        if (chbPermiso.isSelected()) {
            p.setLicencia(true);
        } else {
            p.setLicencia(false);
        }
        lista.add(p);
        tfNombre.setText("");
        tfEmail.setText("");
        cCiudad.setSelectedIndex(0);
        gbEstadoCivil.clearSelection();
        chbPermiso.setSelected(false);
        chbMayor.setSelected(false);
        posicion();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here
        int pos = Integer.parseInt(lblPos.getText());
        pos -= 1;
        if (pos >= 0) {
            tfNombre.setText(lista.get(pos).getNombre());
            tfEmail.setText(lista.get(pos).getEmail());
            cCiudad.setSelectedItem(lista.get(pos).getCiudad());
            lblPos.setText(String.valueOf(pos));
        }

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here
        int pos = Integer.parseInt(lblPos.getText());
        pos += 1;
        if (pos < lista.size()) {
            tfNombre.setText(lista.get(pos).getNombre());
            tfEmail.setText(lista.get(pos).getEmail());
            cCiudad.setSelectedItem(lista.get(pos).getCiudad());

            lblPos.setText(String.valueOf(pos));

        }

    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void rbSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSolteroActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cCiudad;
    private javax.swing.JCheckBox chbMayor;
    private javax.swing.JCheckBox chbPermiso;
    private javax.swing.ButtonGroup gbEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPos;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JRadioButton rbViudo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
