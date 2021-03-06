package tallermecanica;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallermecanica.Modals.AddNewRegistroModal;
import tallermecanica.Models.RegistroModel;

/**
 *
 * @author adrian verdugo
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

    /**
     * TODO cargar datos de los registros en la tabla
     */
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

        mainRegistroTable = new javax.swing.JPopupMenu();
        jmEliminar = new javax.swing.JMenuItem();
        jmEditar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTableRegistro = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnAddNewRegistro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jtCosto = new javax.swing.JTextField();
        btnActualizarRegistro = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlCliente = new javax.swing.JLabel();
        jlRut = new javax.swing.JLabel();
        jlVehiculo = new javax.swing.JLabel();
        jlPatente = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        jmEliminar.setText("Eliminar");
        jmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarActionPerformed(evt);
            }
        });
        mainRegistroTable.add(jmEliminar);

        jmEditar.setText("Editar");
        jmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarActionPerformed(evt);
            }
        });
        mainRegistroTable.add(jmEditar);

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
        dataTableRegistro.setComponentPopupMenu(mainRegistroTable);
        jScrollPane1.setViewportView(dataTableRegistro);

        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAddNewRegistro.setText("Agregar Nuevo Registro");
        btnAddNewRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewRegistroActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos a Actulizar"));

        jLabel1.setText("Descripcion");

        jtDescripcion.setColumns(20);
        jtDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtDescripcion);

        jLabel2.setText("Costo $");

        btnActualizarRegistro.setText("Actualizar");
        btnActualizarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarRegistroActionPerformed(evt);
            }
        });

        jLabel7.setText("N registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jtCosto))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jlId)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jlId))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizarRegistro)
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente - Vehiculo"));

        jLabel3.setText("Cliente");

        jLabel4.setText("Vehiculo");

        jLabel5.setText("Patente");

        jLabel6.setText("Rut");

        jlCliente.setText("-------");

        jlRut.setText("-------");

        jlVehiculo.setText("-------");

        jlPatente.setText("-------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlRut, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlRut))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlVehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlPatente))
                .addGap(23, 23, 23))
        );

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addGap(29, 29, 29)
                .addComponent(btnAddNewRegistro)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnAddNewRegistro)
                    .addComponent(btnExportar))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * TODO refrescar datos de la tabla
     *
     * @param evt
     */
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        loadDataRegistro();
        JOptionPane.showMessageDialog(null, "Tabla refrescada!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * TODO llamar el modal para agregar el nuevo modal
     *
     * @param evt
     */
    private void btnAddNewRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewRegistroActionPerformed
        // TODO add your handling code here:
        try {
            Frame f = new Frame();
            AddNewRegistroModal rm = new AddNewRegistroModal(f, true);
            rm.setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrudRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddNewRegistroActionPerformed

    /**
     * Eliminar Registro Seleccionado
     *
     * @param evt
     */
    private void jmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarActionPerformed
        // TODO add your handling code here
        try {
            int registro = this.dataTableRegistro.getSelectedRow();
            String ident = (String) this.dataTableRegistro.getValueAt(registro, 0);
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar este registro?", "Warnig", JOptionPane.WARNING_MESSAGE);
            if (JOptionPane.OK_OPTION == confirmar) {
                try {
                    rm.deleteRegistro(Integer.parseInt(ident));
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadDataRegistro();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmEliminarActionPerformed

    /**
     * TODO Cargar datos en panel de edicion de registro
     *
     * @param evt
     */
    private void jmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarActionPerformed
        // TODO add your handling code here:
        try {
            int reg = this.dataTableRegistro.getSelectedRow();
            String ident = (String) this.dataTableRegistro.getValueAt(reg, 0);
            try {
                ResultSet vData = rm.viewRegistro(Integer.parseInt(ident));
                System.out.println(vData);
                if (vData.next()) {
                    vData.beforeFirst();
                    while (vData.next()) {
                        this.jtDescripcion.setText(vData.getString("descripcionRegistro"));
                        this.jtCosto.setText(vData.getString("totalCobroRegistro"));
                        this.jlCliente.setText(vData.getString("nombresCliente") + " " + vData.getString("apellidosCliente"));
                        this.jlRut.setText(vData.getString("rutCliente"));
                        this.jlVehiculo.setText(vData.getString("nombreMarca") + " " + vData.getString("modelo") + " " + vData.getString("yearVehiculo"));
                        this.jlPatente.setText(vData.getString("patenteVehiculo"));
                        this.jlId.setText(vData.getString("idRegistro"));
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmEditarActionPerformed

    /**
     * TODO Actualizar los datos de los registros en la DB
     *
     * @param evt
     */
    private void btnActualizarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarRegistroActionPerformed
        // TODO add your handling code here:
        try {
            String des = this.jtDescripcion.getText();
            String costo = this.jtCosto.getText();
            String id = this.jlId.getText();

            if (des.equals("")) {
                JOptionPane.showMessageDialog(null, "Descipcion Requerida ", "Error", JOptionPane.ERROR_MESSAGE);
                this.jtDescripcion.requestFocus();
            } else if (costo.equals("")) {
                JOptionPane.showMessageDialog(null, "Costo Requerida ", "Error", JOptionPane.ERROR_MESSAGE);
                this.jtCosto.requestFocus();
            } else {
                int confirm = JOptionPane.showConfirmDialog(null, "¿Confirmas los cambios?", "Warning", JOptionPane.WARNING_MESSAGE);
                if (JOptionPane.OK_OPTION == confirm) {
                    try {
                        rm.updateRegistro(Integer.parseInt(id), des, Integer.parseInt(costo));
                        JOptionPane.showMessageDialog(null, "Datos actualizados!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        loadDataRegistro();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarRegistroActionPerformed

    /**
     * TODO boton para exportar datos en txt
     *
     * @param evt
     */
    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
        try {
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yy-MM-dd.HH_mm_ss");
            DateFormat dfDos = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            String outFile = "docs/registroTaller" + df.format(date) + ".txt";
            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                ResultSet rs = rm.dataRegistro();
                fichero = new FileWriter(outFile);
                pw = new PrintWriter(fichero);
                pw.write("Fecha de exportacion de registro: " + dfDos.format(date));
                pw.write("\n");
                pw.write("\n");
                pw.write("\n");
                while (rs.next()) {
                    pw.write("Numero Docs: " + rs.getString("idRegistro"));
                    pw.write("\n");
                    pw.write("Fecha Registro: " + rs.getString("fechaRegistro"));
                    pw.write("\n");
                    pw.write("Costo : " + rs.getString("totalCobroRegistro"));
                    pw.write("\n");
                    pw.write("Nombre Cliente: " + rs.getString("nombresCliente") + " " + rs.getString("apellidosCliente"));
                    pw.write("\n");
                    pw.write("Rut Cliente: " + rs.getString("rutCliente"));
                    pw.write("\n");
                    pw.write("Patente: " + rs.getString("patenteVehiculo"));
                    pw.write("\n");
                    pw.write("Modelo: " + rs.getString("modelo"));
                    pw.write("\n");
                    pw.write("Año: " + rs.getString("yearVehiculo"));
                    pw.write("\n");
                    pw.write("------------------------------------------------------------");
                    pw.write("\n");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                        JOptionPane.showMessageDialog(null, "Archivo Exportado con exito en la carpeta ./" + outFile, "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarRegistro;
    private javax.swing.JButton btnAddNewRegistro;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTable dataTableRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPatente;
    private javax.swing.JLabel jlRut;
    private javax.swing.JLabel jlVehiculo;
    private javax.swing.JMenuItem jmEditar;
    private javax.swing.JMenuItem jmEliminar;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextArea jtDescripcion;
    private javax.swing.JPopupMenu mainRegistroTable;
    // End of variables declaration//GEN-END:variables
}
