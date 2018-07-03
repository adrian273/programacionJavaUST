package tallermecanica.Modals;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tallermecanica.Models.RegistroModel;
import tallermecanica.Models.VehiculoModel;

/**
 *
 * @author adrian
 */
public class AddNewRegistroModal extends javax.swing.JDialog {

    RegistroModel rm;
    VehiculoModel vm;

    /**
     * Creates new form AddNewRegistroModal
     *
     * @param parent
     * @param modal
     * @throws java.lang.ClassNotFoundException
     */
    public AddNewRegistroModal(java.awt.Frame parent, boolean modal) throws ClassNotFoundException {
        super(parent, modal);
        initComponents();
        rm = new RegistroModel();
        vm = new VehiculoModel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDescripcion = new javax.swing.JTextArea();
        jtCosto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPatente = new javax.swing.JTextField();
        btnVerificarPatente = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Registro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Nuevo Registro"));

        jLabel1.setText("Descripcion");

        jLabel2.setText("Costo $");

        jLabel3.setText("Patente Vehiculo");

        jtDescripcion.setColumns(20);
        jtDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtDescripcion);

        btnVerificarPatente.setText("Verificar Patente");
        btnVerificarPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarPatenteActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificarPatente, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                    .addComponent(jtCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarPatente))
                .addGap(36, 36, 36)
                .addComponent(btnAgregar)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Agregar un nuevo Registro
     *
     * @param evt
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String descripcion = this.jtDescripcion.getText();
        String costo = this.jtCosto.getText();
        String patente = this.jtPatente.getText();

        if (descripcion.equals("")) {
            JOptionPane.showMessageDialog(null, "Descripcion Requerida!", "Error", JOptionPane.ERROR_MESSAGE);
            this.jtDescripcion.requestFocus();
        } else if (costo.equals("")) {
            JOptionPane.showMessageDialog(null, "Costo Requerido!", "Error", JOptionPane.ERROR_MESSAGE);
            this.jtCosto.requestFocus();
        } else if (costo.length() > 9) {
            JOptionPane.showMessageDialog(null, "Upps a sobrepaso el limite de digitos [max 9]", "Error", JOptionPane.ERROR_MESSAGE);
            this.jtCosto.requestFocus();
        } else if (patente.equals("")) {
            JOptionPane.showMessageDialog(null, "Patente Requerida!", "Error", JOptionPane.ERROR_MESSAGE);
            this.jtPatente.requestFocus();
        } else {
            try {
                if (vm.verificPatente(patente)) {
                    try {
                        rm.addNewRegistro(costo, Integer.parseInt(costo), patente);
                        JOptionPane.showMessageDialog(null, "Agregado con exito!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        this.jtDescripcion.setText("");
                        this.jtCosto.setText("");
                        this.jtPatente.setText("");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Solo Numeros", "Error", JOptionPane.ERROR_MESSAGE);
                        this.jtCosto.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Patente no registrada", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddNewRegistroModal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    /**
     * TODO boton para verificar patente
     * @param evt 
     */
    private void btnVerificarPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarPatenteActionPerformed
        // TODO add your handling code here:
        try {
            String patente = this.jtPatente.getText();
            ResultSet rs = vm.viewDataVehiculo(patente);
            if (rs.next()) {
                rs.beforeFirst();
                Frame frame = new Frame();
                InformacionVehiculoModal ivm = new InformacionVehiculoModal(frame, true, rs);
                ivm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Patente no registrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarPatenteActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewRegistroModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewRegistroModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewRegistroModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewRegistroModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewRegistroModal dialog = null;
                try {
                    dialog = new AddNewRegistroModal(new javax.swing.JFrame(), true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddNewRegistroModal.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVerificarPatente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextArea jtDescripcion;
    private javax.swing.JTextField jtPatente;
    // End of variables declaration//GEN-END:variables
}
