/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaregistrogaudi.gui;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemaregistrogaudi.gui.modals.AgregarNuevaObraArte;
import sistemaregistrogaudi.gui.modals.ListarObraArte;

/**
 *
 * @author adrian
 */
public class CrudObraArte extends javax.swing.JInternalFrame {

    public static DefaultTableModel dm = new DefaultTableModel();

    /**
     * Creates new form CrudObraArte
     */
    public CrudObraArte() {
        initComponents();
        loadDataArte();
        App.dataSala.forEach((key, value) -> {
            this.jcTipoSala.addItem(value.getNombreSala());
        });
    }

    /**
     * loadDataArte();;
     */
    public static void loadDataArte() {
        try {
            String titles[] = {"Nombre Pintura", "Autor", "Tecnica", "Genero", "Año", "Ancho", "Alto", "Ubicacion", "ident"};
            dm = new DefaultTableModel(titles, 0);
            for (int i = 0; i < App.dataArte.size(); i++) {
                String np = App.dataArte.get(i).getNombreObra();
                String n = App.dataArte.get(i).getAutor().getNombre();
                String t = App.dataArte.get(i).getTecnica().name();
                String g = App.dataArte.get(i).getGenero().name();
                int year = App.dataArte.get(i).getYear();
                int ancho = App.dataArte.get(i).getTamano().getAncho();
                int alto = App.dataArte.get(i).getTamano().getAlto();
                String ubi = App.dataArte.get(i).getUbicacion().getNombreSala();
                int ident = App.dataArte.get(i).getId();
                Object data[] = {np, n, t, g, year, ancho, alto, ubi, ident};
                dm.addRow(data);
            }
            CrudObraArte.jTable1.setModel(dm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jpMenu = new javax.swing.JPopupMenu();
        jmEliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddNewObra = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jcTipoSala = new javax.swing.JComboBox<>();
        btnTotal = new javax.swing.JButton();

        jmEliminar.setText("Eliminar");
        jmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarActionPerformed(evt);
            }
        });
        jpMenu.add(jmEliminar);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setComponentPopupMenu(jpMenu);
        jScrollPane1.setViewportView(jTable1);

        btnAddNewObra.setText("Agregar");
        btnAddNewObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewObraActionPerformed(evt);
            }
        });

        btnListar.setText("Buscar Pintura por Sala");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jcTipoSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));

        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAddNewObra, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNewObra)
                    .addComponent(btnListar)
                    .addComponent(jcTipoSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewObraActionPerformed
        // TODO add your handling code here:
        try {
            Frame f = new Frame();
            AgregarNuevaObraArte a = new AgregarNuevaObraArte(f, true);
            a.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddNewObraActionPerformed

    /**
     * TODO Elinar registro de obra de arte
     *
     * @param evt
     */
    private void jmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int reg = this.jTable1.getSelectedRow();
            int confirm = JOptionPane.showConfirmDialog(null, "¿ Seguro de eliminar este registro ?");
            if (JOptionPane.OK_OPTION == confirm) {
                App.dataArte.remove(reg);
                JOptionPane.showMessageDialog(null, "Eliminado con exito!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadDataArte();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmEliminarActionPerformed

    /**
     * *
     * TODO Listar Datos de Obra de Arte por Nombre Sala
     *
     * @param evt
     */
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        try {
            String nombreSala = (String) this.jcTipoSala.getSelectedItem();
            if (!nombreSala.equals("")) {
                if (App.dataArte.size() > 0) {
                    Frame f = new Frame();
                    ListarObraArte loa = new ListarObraArte(f, true, nombreSala);
                    loa.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos agregados!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nombre Sala Requerida!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    /**
     * TODO mostrar total de las obras totales
     *
     * @param evt
     */
    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(null, "Total Obra Arte: " + App.dataArte.size(), "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error" ,JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewObra;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcTipoSala;
    private javax.swing.JMenuItem jmEliminar;
    private javax.swing.JPopupMenu jpMenu;
    // End of variables declaration//GEN-END:variables
}
