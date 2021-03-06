/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorBodega;
import ec.edu.ups.modelo.Bodega;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author olope
 */
public class VentanaRegistrarBodega extends javax.swing.JInternalFrame {

    private ControladorBodega controladorBodega;

    private String mensajeOptionPane1;
    private String mensajeOptionPane2;

    //clases localizazión
    private Locale localizacion;
    private ResourceBundle mensajes;
    private String llenar;
    private String bode;
    private String codI;
    private String escribirC;
    private String bodegaB;
    private String codi;
    private String nom;
    private String dire;
    private String co;
    private String di;
    private String bc;
    

    public VentanaRegistrarBodega(ControladorBodega controladorBodega) {
        initComponents();
        this.setTitle("Registrar Bodega");
        this.controladorBodega = controladorBodega;

        this.mensajeOptionPane1 = "¡Llenar todo !";
        this.mensajeOptionPane2 = "Cliente Creado";
        this.llenar="llenar todo";
        this.bode="bodega actualizada";
        this.codI="codigo incorrecto";
        this.codi="escribir el codigo";
        this.bodegaB="bodega borrada";
        this.bc="bodega creada";
        this.co="codigo";
       this.nom="nombre";
       this.di="direccion";
    }

    public void cambiarIdioma(Locale localizacion, ResourceBundle mensajes) {
        jLabel1.setText(mensajes.getString("lblRegitrarBodega"));
        jLabel2.setText(mensajes.getString("lblCodigo"));
        jLabel3.setText(mensajes.getString("lblNombre"));
        jLabel4.setText(mensajes.getString("lblDireccion"));
        btnRegistar.setText(mensajes.getString("btnRegitrar"));
        btnActualizar.setText(mensajes.getString("btnActualizar"));
        btnBorrar.setText(mensajes.getString("btnBorrar"));
        btnListar.setText(mensajes.getString("btnListar"));
        btnCerra.setText(mensajes.getString("btnCerrar"));
        

        this.mensajeOptionPane1 = mensajes.getString("mensajeOptionPane1");
        this.mensajeOptionPane2 = mensajes.getString("mensajeOptionPane2_2");
        this.llenar=mensajes.getString("llenar");
        this.bode=mensajes.getString("bode");
          this.codI=mensajes.getString("codI");
          this.bc=mensajes.getString("bc");
        
        this.bodegaB=mensajes.getString("bodegaB");
         this.codi=mensajes.getString("codi");
        this.nom=mensajes.getString("nom");
        this.dire=mensajes.getString("dire");
        this.co=mensajes.getString("co");
        this.nom=mensajes.getString("nom");
        this.dire=mensajes.getString("dire");
        this.setTitle(mensajes.getString("ventanaRBTitleBar"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnRegistar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCerra = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Registrar Bodega");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        btnRegistar.setText("Registrar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCerra.setText("Cerrar");
        btnCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerraActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegistar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnActualizar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                        .addComponent(txtNombre)
                                        .addComponent(txtCodigo)))
                                .addGap(60, 60, 60)
                                .addComponent(btnBorrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnListar)
                        .addGap(44, 44, 44)
                        .addComponent(btnCerra)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistar)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnCerra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();

        if (codigo.isEmpty() && nombre.isEmpty() && direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this,llenar);
        } else {
            this.controladorBodega.registrarBodega(codigo, nombre, direccion);
            JOptionPane.showMessageDialog(this, bc);
            limpiar();
            actualizarTabla();

        }
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnCerraActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();

        if (codigo.isEmpty() && nombre.isEmpty() && direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, llenar);
        } else {
            boolean cent = this.controladorBodega.actualizarBodega(codigo, nombre, direccion);

            if (cent == true) {
                JOptionPane.showMessageDialog(this, bode);
                limpiar();
                actualizarTabla();

            } else {
                JOptionPane.showMessageDialog(this, codI);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, codi);
        } else {
            boolean cent = this.controladorBodega.eliminarBodega(codigo);
            if (cent == true) {
                JOptionPane.showMessageDialog(this, bodegaB);
                limpiar();
                actualizarTabla();

            } else {
                JOptionPane.showMessageDialog(this, codI);
                limpiar();
            }
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        actualizarTabla();


    }//GEN-LAST:event_btnListarActionPerformed
    public void actualizarTabla() {
        List<Bodega> modelo = controladorBodega.ListarBodegas();
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn(co);
        modelo2.addColumn(nom);
        modelo2.addColumn(dire);
        if (modelo != null) {
            for (Bodega bodega : modelo) {
                modelo2.addRow(new Object[]{bodega.getCodigo(), bodega.getNombre(), bodega.getDireccion()});
            }
            jTable2.setModel(modelo2);

        } else {
            

        }
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated


    }//GEN-LAST:event_formInternalFrameActivated
    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerra;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
