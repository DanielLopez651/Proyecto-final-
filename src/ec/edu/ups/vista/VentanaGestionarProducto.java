package ec.edu.ups.vista;
import ec.edu.ups.controlador.ControladorBodega;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VentanaGestionarProducto extends javax.swing.JInternalFrame {

    ControladorBodega controladorBodega;
    ControladorProducto controladorProducto;
    public VentanaGestionarProducto(ControladorBodega controladorBodega, ControladorProducto controladorProducto) {
        initComponents();
        this.setTitle("Gestionar Productos");
        boolean estado=false;
        txtCantidad.setVisible(estado);
        txtCodigoProducto.setVisible(estado);
        txtNombre.setVisible(estado);
        txtPrecio.setVisible(estado);
        jLabel2.setVisible(estado);
        jLabel3.setVisible(estado);
        jLabel4.setVisible(estado);
        jLabel5.setVisible(estado);
        btnActualizar.setVisible(estado);
        btnBorrar.setVisible(estado);
        btnListar.setVisible(estado);
        btnRegistrar.setVisible(estado);
        jTable1.setVisible(estado);
        
        
        this.controladorBodega=controladorBodega;
        this.controladorProducto=controladorProducto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigoBodega = new javax.swing.JTextField();
        btnVerificarBodega = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Ingrese codigo de bodega");

        btnVerificarBodega.setText("Aceptar");
        btnVerificarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarBodegaActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Cantidad");

        jLabel5.setText("Precio");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtCantidad)
                            .addComponent(txtPrecio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txtCodigoBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnRegistrar)
                                .addGap(43, 43, 43)
                                .addComponent(btnActualizar)
                                .addGap(43, 43, 43)
                                .addComponent(btnBorrar)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerificarBodega)
                            .addComponent(btnListar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarBodega))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar)
                    .addComponent(btnListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarBodegaActionPerformed
        boolean validar=controladorBodega.validarBodega(txtCodigoBodega.getText());
        if(validar==true){
            
            JOptionPane.showMessageDialog(this, "Bodega valida");
            boolean estado=true;
            txtCodigoBodega.setEditable(false);
        txtCantidad.setVisible(estado);
        txtCodigoProducto.setVisible(estado);
        txtNombre.setVisible(estado);
        txtPrecio.setVisible(estado);
        jLabel2.setVisible(estado);
        jLabel3.setVisible(estado);
        jLabel4.setVisible(estado);
        jLabel5.setVisible(estado);
        btnActualizar.setVisible(estado);
        btnBorrar.setVisible(estado);
        btnListar.setVisible(estado);
        btnRegistrar.setVisible(estado);
        jTable1.setVisible(estado);
        jTable1.setVisible(estado);
        actualizarTabla();
            
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Bodega invalida");
        }
        
       
    }//GEN-LAST:event_btnVerificarBodegaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String codigo=txtCodigoProducto.getText();
        String nombre=txtNombre.getText();
        String cantidad=txtCantidad.getText();
        String precio=txtPrecio.getText();
        String codigoBodega=txtCodigoBodega.getText();
        
        if(codigo.isEmpty()&&nombre.isEmpty()&&cantidad.isEmpty()&&precio.isEmpty()&&codigoBodega.isEmpty()){
            JOptionPane.showMessageDialog(this, "Llenar todo");
        }else{
            int cantidad1=Integer.parseInt(cantidad);
            Double precio1=Double.parseDouble(precio);
            
            this.controladorProducto.registrarProducto(codigo, nombre, cantidad1, precio1, codigoBodega);
            
            JOptionPane.showMessageDialog(this, "Producto creado en la bodega "+codigoBodega);
            actualizarTabla();
            limpiar();
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
        txtCodigoBodega.setText("");
        boolean estado=false;
        txtCodigoBodega.setEditable(true);
        txtCantidad.setVisible(estado);
        txtCodigoProducto.setVisible(estado);
        txtNombre.setVisible(estado);
        txtPrecio.setVisible(estado);
        jLabel2.setVisible(estado);
        jLabel3.setVisible(estado);
        jLabel4.setVisible(estado);
        jLabel5.setVisible(estado);
        btnActualizar.setVisible(estado);
        btnBorrar.setVisible(estado);
        btnListar.setVisible(estado);
        btnRegistrar.setVisible(estado);
        jTable1.setVisible(estado);
        this.setVisible(false);
        limpiarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigo=txtCodigoProducto.getText();
        String nombre=txtNombre.getText();
        String cantidad=txtCantidad.getText();
        String precio=txtPrecio.getText();
        String codigoBodega=txtCodigoBodega.getText();
        
        if(codigo.isEmpty()&&nombre.isEmpty()&&cantidad.isEmpty()&&precio.isEmpty()&&codigoBodega.isEmpty()){
        JOptionPane.showMessageDialog(this, "Llennar todo");
        } else {
            boolean cent = this.controladorProducto.actualizarBodega(codigo, nombre, Integer.parseInt(cantidad), Double.parseDouble(precio), codigoBodega);

            if (cent == true) {
                JOptionPane.showMessageDialog(this, "Bodega actualizada");
               limpiar();
               actualizarTabla();

            } else {
                JOptionPane.showMessageDialog(this, "Codigo incorrecto");
                limpiar();
            }
        }
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String codigo=txtCodigoProducto.getText();
        String nombre=txtNombre.getText();
        String cantidad=txtCantidad.getText();
        String precio=txtPrecio.getText();
        String codigoBodega=txtCodigoBodega.getText();
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escribir el codigo");
        } else {
            boolean cent = this.controladorProducto.eliminarProducto(codigo);
            if (cent == true) {
                JOptionPane.showMessageDialog(this, "Bodega borrada");
               limpiar();
               actualizarTabla();
               
            } else {
                JOptionPane.showMessageDialog(this, "Codigo incorrecto");
                limpiar();
            }
        }
        
        
        
    }//GEN-LAST:event_btnBorrarActionPerformed
public void actualizarTabla(){
    String codigoBodega=txtCodigoBodega.getText();
    List<Producto> modelo = controladorProducto.ListarProductosPorBodega(codigoBodega);
        DefaultTableModel modelo2=new DefaultTableModel();
      modelo2.addColumn("Codigo");
      modelo2.addColumn("Nombre");
      modelo2.addColumn("Cantidad");
      modelo2.addColumn("Precio");

        if (modelo != null) {
            for (Producto producto : modelo) {
                modelo2.addRow(new Object[]{producto.getCodigo(),producto.getNombre(),producto.getCantidad(),producto.getPrecio()});
            }
            jTable1.setModel(modelo2);
            
            
            
        } else {
            JOptionPane.showMessageDialog(this, "No hay productos registrados");
           

        }
}
public void limpiarTabla(){
    DefaultTableModel modelo=new DefaultTableModel();
    jTable1.setModel(modelo);
    
}
    public void limpiar(){
    txtCantidad.setText("");
    txtCodigoProducto.setText("");
    txtNombre.setText("");
    txtPrecio.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerificarBodega;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoBodega;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
