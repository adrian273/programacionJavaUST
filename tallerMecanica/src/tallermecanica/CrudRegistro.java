/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermecanica;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallermecanica.Models.RegistroModel;

/**
 *
 * @author adrian
 */
public class CrudRegistro extends javax.swing.JInternalFrame {

    DefaultTableModel dm;
    RegistroModel rm;

    /**
     * Creates new form CrudRegistro
     */
    public CrudRegistro() throws ClassNotFoundException {
        initComponents();
        dm = new DefaultTableModel();
        rm = new RegistroModel();
        loadDataRegistro();
    }

    public void loadDataRegistro() {
        String titles[] = {"Numero Registro", "Fecha", "Descripcion", "Patente", "Cliente", "Total"};
        dm = new DefaultTableModel(titles, 0);
        try {
            ResultSet vData = rm.dataRegistro();
            if (vData.next()) {
                vData.beforeFirst();
                while (vData.next()) {
                    String nRegistro = vData.getString("idRegistro");
                    String fecha = vData.getString("fechaRegistro");
                    String descripcion = vData.getString("descripcionRegistro");
                    
                    String patente = vData.getString("patenteVehiculo");
                    String nCliente = vData.getString("nombresCliente") + " " + vData.getString("apellidosCliente");
                    String total = vData.getString("totalCobroRegistro");
                    Object dataAll[] = {nRegistro, fecha, descripcion, patente, nCliente, total};
                    this.dm.addRow(dataAll);
                }
                this.dataTableRegistro.setModel(dm);
            } else {
                JOptionPane.showMessageDialog(null, "No hay datos ingresados!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataTableRegistro = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crud Registro");
        setPreferredSize(new java.awt.Dimension(1239, 536));

        dataTableRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dataTableRegistro);

        btnRefresh.setText("Refrescar");

        jButton2.setText("Agregar Nuevo Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(jButton2))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTable dataTableRegistro;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
