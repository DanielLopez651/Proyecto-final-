package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaDevolverFactura extends javax.swing.JInternalFrame {

    private ControladorFactura controladorFactura;
    private ControladorProducto controladorProducto;
    private List<Factura> lista;

    private String mensajeOptionPane1;
    private String mensajeOptionPane2;
    private String mensajeOptionPane3;

    public VentanaDevolverFactura(ControladorFactura controladorFactura, ControladorProducto controladorProducto) {
        initComponents();
        this.setTitle("mensajeOptionPane1");

        this.controladorFactura = controladorFactura;
        this.controladorProducto = controladorProducto;

        this.mensajeOptionPane1 = "Devolver Facturas";
        this.mensajeOptionPane2 = "Ingrese Codigo";
        this.mensajeOptionPane3 = "Factura Devuelta";

    }

    public void cambiarIdioma(Locale localizacion, ResourceBundle mensajes) {

        jLabel1.setText(mensajes.getString("lblDevolverFacturas"));
        jLabel2.setText(mensajes.getString("lblCodigodeFacturaaDevolver"));
        jLabel3.setText(mensajes.getString("lblCodigoFactura"));
        jLabel4.setText(mensajes.getString("lblDetallarFactura"));
        jButton1.setText(mensajes.getString("btnRegitrar"));
        jButton2.setText(mensajes.getString("btnDevolver"));
        jButton3.setText(mensajes.getString("btnCerrar"));
        jButton4.setText(mensajes.getString("btnDetallar"));

        mensajeOptionPane1 = mensajes.getString("mensajeOptionPane1");
        mensajeOptionPane2 = mensajes.getString("mensajeOptionPane2");
        mensajeOptionPane3 = mensajes.getString("mensajeOptionPane3");

        this.setTitle(mensajes.getString("ventanaRBTitleBar"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Devolver Facturas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Listar Facturas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo de factura a devolver");

        jButton2.setText("Devolver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo Factura");

        jButton4.setText("Detallar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Detallar Factura");

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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton2)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(52, 52, 52)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        lista = controladorFactura.mostrarFacturas();
        DefaultTableModel modelo = new DefaultTableModel();

        if (lista == null) {
            JOptionPane.showMessageDialog(this, mensajeOptionPane1);
        } else {
            modelo.addColumn("codigo");
            modelo.addColumn("estado");

            for (Factura factura : lista) {
                modelo.addRow(new Object[]{factura.getCodigo(), factura.getEstado()});
                jTable1.setModel(modelo);
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);

        try {
            DefaultTableModel modelo2 = new DefaultTableModel();
            jTable1.setModel(modelo2);
            jTable2.setModel(modelo2);
            lista.clear();
        } catch (java.lang.NullPointerException e) {

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String codigoFactrura = jTextField1.getText();
        if (codigoFactrura.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese codigo");
        } else {
            controladorFactura.cambiarEstado(codigoFactrura);
            List<Producto> p = controladorProducto.productosFacturados(codigoFactrura);

            for (Producto producto : p) {

                boolean c = controladorProducto.actualizarBodegaPorNombre(producto.getCodigo(), producto.getNombre(),
                        producto.getCantidad(), producto.getPrecio(), producto.getCodigoBodega());
                System.out.println(c + "c");
                if (c == true) {

                } else {

                    controladorProducto.registrarProducto(producto.getCodigo().replaceAll("f", ""), producto.getNombre(),
                            producto.getCantidad(), producto.getPrecio(), producto.getCodigoBodega());
                }

            }
            JOptionPane.showMessageDialog(this, "Productos devueltos");

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String codigoProducto = jTextField2.getText();
        DefaultTableModel modelo2 = new DefaultTableModel();
        List<Producto> p = controladorProducto.productosFacturados(codigoProducto);
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Codigo Factura");
        modelo2.addColumn("cantidad");
        modelo2.addColumn("Precio Unidad");

        if (codigoProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el codigo");
        } else {
            for (Producto producto : p) {
                modelo2.addRow(new Object[]{producto.getNombre(), producto.getCodigo(), producto.getCantidad(), producto.getPrecio()});
            }
            jTable2.setModel(modelo2);
        }

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
