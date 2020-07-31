package ec.edu.ups.vista;
import ec.edu.ups.controlador.ControladorCliente;
import javax.swing.JOptionPane;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.controlador.ControladorProducto;
import java.util.List;
import ec.edu.ups.controlador.ControladorFactura;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;

public class VentanaGestionarFactura extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3=new DefaultTableModel();
    List<Producto> lista=new ArrayList<Producto>();
    List<Integer>cantidades=new ArrayList<Integer>();
    
    double preciototal1=0;
    private String mensajeOP1F;
    private String mensajeOP2F;
    private String mensajeOP3F;
    private String mensajeOP4F;
    private String mensajeOP5F;
    private String mensajeOP6F;
    private String mensajeOP7F;
    private String mensajeOP8F;
    private String mensajeOP9F;
    private String mensajeOP10F;
    private String mensajeOP11F;
    private String mensajeOP12F;
    private String mensajeOP13F;
    private String mensajeOP14F;
    private String mensajeOP15F;
    private String title1;
        
    
    public VentanaGestionarFactura(ControladorCliente controladorCliente, ControladorProducto controladorProducto, ControladorFactura controladorFactura) {
        initComponents();
        jLabel11.setVisible(false);
        jTextField9.setVisible(false);
        jButton6.setVisible(false);
        jButton2.setVisible(false);
        
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField5.setEditable(false);
                
        this.setTitle("Generar factura");
        
        this.controladorCliente =controladorCliente;
        this.controladorProducto= controladorProducto;
        this.controladorFactura=controladorFactura;
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Bodega");
        modelo.addColumn("cantidad");
        modelo.addColumn("Precio Unidad");
        modelo.addColumn("PRECIO");
        
        
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Bodega");
        modelo2.addColumn("cantidad");
        modelo2.addColumn("Precio Unidad");
        
        this.title1 = "Generar Factura";
        this.mensajeOP1F = "Nombre";
        this.mensajeOP2F = "Bodega";
        this.mensajeOP3F = "Cantidad";
        this.mensajeOP4F = "Precio Unidad";
        this.mensajeOP5F = "Precio";
        this.mensajeOP6F = "Llene la cedula";
        this.mensajeOP7F = "Cliente invalido";
        this.mensajeOP8F = "Llene todos los datos del producto";
        this.mensajeOP9F = "producto no encontrado";
        this.mensajeOP10F = "cantidad insuficiente en la bodega";
        this.mensajeOP11F = "Ingrese nombre del producto";
        this.mensajeOP12F = "Producto no encontrado";
        this.mensajeOP13F = "Ingrese codigo";
        this.mensajeOP14F = "Factura generada";
        this.mensajeOP15F = "No hay productos registrados";
        
        
    }
     public void cambiarIdioma(Locale localizacion, ResourceBundle mensajes) {
        
        jLabel1.setText(mensajes.getString("lblStock"));
        jLabel2.setText(mensajes.getString("lblFactura"));
        jLabel3.setText(mensajes.getString("lblCedulaCliente"));
        jLabel4.setText(mensajes.getString("lblNombre"));
        jLabel5.setText(mensajes.getString("lblDireccion"));
        jLabel6.setText(mensajes.getString("lblNombreproducto"));
        jLabel7.setText(mensajes.getString("lblApellido"));
        jLabel8.setText(mensajes.getString("lblNombreProcducto"));
        jLabel9.setText(mensajes.getString("lblCodigoBodega"));
        jLabel10.setText(mensajes.getString("lblCantidad"));
        jLabel11.setText(mensajes.getString("lblCodigoFactura"));
        jButton1.setText(mensajes.getString("btnLlenar"));
        jButton2.setText(mensajes.getString("btnCalcular"));
        jButton3.setText(mensajes.getString("btnBuscar"));
        jButton4.setText(mensajes.getString("btnCerrar"));
        jButton5.setText(mensajes.getString("btnAgregar"));
        jButton6.setText(mensajes.getString("btnGenerar"));
        jButton7.setText(mensajes.getString("btnListartodoslosProductos"));
        
        this.mensajeOP1F = mensajes.getString("mensajeOP1F");
        this.mensajeOP2F = mensajes.getString("mensajeOP2F");
        this.mensajeOP3F = mensajes.getString("mensajeOP3F");
        this.mensajeOP4F = mensajes.getString("mensajeOP4F");
        this.mensajeOP5F = mensajes.getString("mensajeOP5F");
        this.mensajeOP6F = mensajes.getString("mensajeOP6F");
        this.mensajeOP7F = mensajes.getString("mensajeOP7F");
        this.mensajeOP8F = mensajes.getString("mensajeOP8F");
        this.mensajeOP9F = mensajes.getString("mensajeOP9F");
        this.mensajeOP10F = mensajes.getString("mensajeOP10F");
        this.mensajeOP11F = mensajes.getString("mensajeOP11F");
        this.mensajeOP12F = mensajes.getString("mensajeOP12F");
        this.mensajeOP13F = mensajes.getString("mensajeOP13F");
        this.mensajeOP14F = mensajes.getString("mensajeOP14F");
        this.mensajeOP15F = mensajes.getString("mensajeOP15F");
        
        this.title1 = mensajes.getString("title1");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Stock");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Factura");

        jLabel3.setText("Cedula cliente");

        jButton1.setText("Llenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Direccion");

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

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre producto");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Apellido");

        jLabel8.setText("Nombre Producto");

        jLabel9.setText("Codigo Bodega");

        jLabel10.setText("Cantidad");

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel11.setText("Codigo Factura");

        jButton6.setText("Generar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Listar todos los productos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton1))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(39, 39, 39)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(44, 44, 44)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton3))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton4))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5)))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula=jTextField1.getText();
        if(cedula.isEmpty()){
           JOptionPane.showMessageDialog(this, mensajeOP6F);
        }else{
            Cliente c= controladorCliente.validarCliente(cedula);
            if(c==null){
                JOptionPane.showMessageDialog(this, mensajeOP7F);
            }else{
                jTextField2.setText(c.getNombre().trim());
                jTextField3.setText(c.getApellido().trim());
                jTextField5.setText(c.getDireccion().trim());
                
                
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        limpiar();
        preciototal1=0;
        jLabel11.setVisible(false);
        jTextField9.setVisible(false);
        jButton6.setVisible(false);
        jButton2.setVisible(false);
        lista.clear();
        cantidades.clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nombre=jTextField6.getText();
        String codigoBodega=jTextField7.getText();
        String cantidad=jTextField8.getText();
        if(nombre.isEmpty()&&codigoBodega.isEmpty()&&cantidad.isEmpty()){
            JOptionPane.showMessageDialog(this, mensajeOP8F);
        }else{
            Producto p=controladorProducto.LlenarFactura(nombre, codigoBodega);
            if(p==null){
            JOptionPane.showMessageDialog(this, mensajeOP9F);
        }else{
               if(p.getCantidad()<Integer.parseInt(cantidad)){
                   JOptionPane.showMessageDialog(this, mensajeOP10F);
                   
               }else{
                   
                   
                    double preciototal=Integer.parseInt(jTextField8.getText())*p.getPrecio();
                          
                   preciototal1=preciototal1+preciototal;
                 modelo.addRow(new Object[]{p.getNombre(), p.getCodigoBodega(),Integer.parseInt(jTextField8.getText()),p.getPrecio(),preciototal});  
                 jTable2.setModel(modelo);
                 jButton2.setVisible(true);
                   
                 lista.add(p);
                 cantidades.add(Integer.parseInt(jTextField8.getText()));
                 jTextField6.setText("");
                   jTextField7.setText("");
                   jTextField8.setText("");
                 
                 
               }
        
         
        
            }
        
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String nombre=jTextField4.getText();
        
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(this, mensajeOP11F);
        }else{
            List<Producto> p = controladorProducto.BuscarPorNombre(nombre);
            if(p==null){
                JOptionPane.showMessageDialog(this, mensajeOP12F);
            }else{
                for (Producto producto : p) {
                    modelo2.addRow(new Object[]{producto.getNombre(), producto.getCodigoBodega(),producto.getCantidad(),producto.getPrecio()});
                }
                
                jTable1.setModel(modelo2);
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel de=new DefaultTableModel();
        de.addColumn("Subtotal");
        de.addColumn("Iva");
        de.addColumn("Total");
        
        preciototal1=((double)Math.round(preciototal1 * 100d) / 100d);
        
        double iva=preciototal1*0.12;
        iva=((double)Math.round(iva * 100d) / 100d);
        double total=iva+preciototal1;
        de.addRow(new Object[]{preciototal1,iva,total});
        jTable4.setModel(de);
        
        jLabel11.setVisible(true);
        jTextField9.setVisible(true);
        jButton6.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    String codigoFactura=jTextField9.getText();
        if(codigoFactura.isEmpty()){
            JOptionPane.showMessageDialog(this, mensajeOP13F);
        }else{
            codigoFactura="f"+codigoFactura;
            controladorFactura.registrarFactura(codigoFactura);
           int cont=0;
            for (Producto producto : lista) {
                
                
                if(producto.getCantidad()==cantidades.get(cont)){
                    
                    controladorProducto.eliminarProducto(producto.getCodigo().trim());
                     
                }
                else{
                    System.out.println(producto);
                  boolean c=  controladorProducto.actualizarBodega(producto.getCodigo().trim(), producto.getNombre().trim(), producto.getCantidad()-cantidades.get(cont)
                ,producto.getPrecio(), producto.getCodigoBodega().trim());
                    
                }
                controladorProducto.registrarProducto(codigoFactura, producto.getNombre()
                ,cantidades.get(cont), producto.getCantidad(), producto.getCodigoBodega());
                
                cont++;
                
                
            }
            
            JOptionPane.showMessageDialog(this, mensajeOP14F);
            
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
List<Producto> modelos= controladorProducto.ListarProductos();
DefaultTableModel mod=new DefaultTableModel();
        mod.addColumn(mensajeOP1F);
        mod.addColumn(mensajeOP2F);
        mod.addColumn(mensajeOP3F);
        mod.addColumn(mensajeOP4F);
        
if(modelos==null){
    JOptionPane.showMessageDialog(this, mensajeOP15F);
}else{
    for (Producto modelo1 : modelos) {
        mod.addRow(new Object[]{modelo1.getNombre(), modelo1.getCodigoBodega(),modelo1.getCantidad(),modelo1.getPrecio()});
    }
    jTable1.setModel(mod);
    
}
        
        
    }//GEN-LAST:event_jButton7ActionPerformed
public void limpiar(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    
    DefaultTableModel m=new DefaultTableModel();
    jTable1.setModel(m);
    jTable2.setModel(m);
    jTable4.setModel(m);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
