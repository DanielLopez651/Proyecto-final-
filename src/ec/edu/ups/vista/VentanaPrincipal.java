/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.dao.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private UsuarioDAO usuarioDAO;
    private ClienteDAO clienteDAO;
    private BodegaDao bodegaDAO;
    private ProductoDAO productoDAO;
    private FacturaDAO facturaDAO;

    private VentanaIniciarSesion ventanaIniciarSesion;
    private VentanaRegistrarUsuario ventanaRegistrarUsuario;
    private VentanaGestionUsuario ventanaGestionUsuario;
    private VentanaGestionCliente ventanaGestionCliente;
    private VentanaRegistrarCliente ventanaRegistrarCliente;
    private VentanaRegistrarBodega ventanaGestionarBodega;
    private VentanaGestionarProducto ventanaGestionarProducto;
    private  VentanaGestionarFactura ventanaGestionarFactura;
    private VentanaDevolverFactura ventanaDevolverFactura;
    private  VentanaMostrarProductos ventanaMostrarProductos;
    private VentanaProductosPorBodega ventanaProductosPorBodega;

    private ControladorUsuario controladorUsuario;
    private ControladorCliente controladorCliente;
    private ControladorBodega controladorBodega;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;

    public VentanaPrincipal() {
        initComponents();
        menuGestionTotal.setVisible(false);
        menuItemCerrarSesion.setVisible(false);

        usuarioDAO = new UsuarioDAO();
        clienteDAO = new ClienteDAO();
        bodegaDAO = new BodegaDao();
        productoDAO = new ProductoDAO();
        facturaDAO=new FacturaDAO();

        controladorUsuario = new ControladorUsuario(usuarioDAO);
        controladorBodega = new ControladorBodega(bodegaDAO);
        controladorCliente = new ControladorCliente(clienteDAO);
        controladorProducto = new ControladorProducto(productoDAO);
        controladorFactura=new ControladorFactura(facturaDAO);

        ventanaIniciarSesion = new VentanaIniciarSesion(controladorUsuario, this);
        ventanaRegistrarUsuario = new VentanaRegistrarUsuario(controladorUsuario);
        ventanaGestionUsuario = new VentanaGestionUsuario(controladorUsuario);
        ventanaGestionCliente= new VentanaGestionCliente(controladorCliente);
        ventanaRegistrarCliente = new VentanaRegistrarCliente(controladorCliente);
        ventanaGestionarBodega = new VentanaRegistrarBodega(controladorBodega);
        ventanaGestionarProducto = new VentanaGestionarProducto(controladorBodega, controladorProducto);
        ventanaGestionarFactura=new VentanaGestionarFactura(controladorCliente, controladorProducto,controladorFactura);
        ventanaDevolverFactura=new VentanaDevolverFactura(controladorFactura, controladorProducto);
        ventanaMostrarProductos=new VentanaMostrarProductos(controladorProducto);
        ventanaProductosPorBodega=new VentanaProductosPorBodega(controladorProducto);

        desktopPane.add(ventanaRegistrarUsuario);
        desktopPane.add(ventanaRegistrarCliente);
        desktopPane.add(ventanaIniciarSesion);
        desktopPane.add(ventanaGestionCliente);
        desktopPane.add(ventanaGestionUsuario);
        desktopPane.add(ventanaGestionarProducto);
        desktopPane.add(ventanaGestionarBodega);
        desktopPane.add(ventanaGestionarFactura);
        desktopPane.add(ventanaDevolverFactura);
        desktopPane.add(ventanaMostrarProductos);
        desktopPane.add(ventanaProductosPorBodega);

    }

    public JMenuItem getInicarMenuItem() {
        return InicarMenuItem;
    }

    public JMenuItem getRegistarMenuItem() {
        return menuRegistar;
    }

    public JMenuItem getMenuItemCerrarSesion() {
        return menuItemCerrarSesion;
    }

    public JMenu getMenuGestionTotal() {
        return menuGestionTotal;
    }

    public JMenu getMenuIniciarS() {
        return menuIniciarS;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuIniciarS = new javax.swing.JMenu();
        menuRegistar = new javax.swing.JMenuItem();
        menuRegistarCliente = new javax.swing.JMenuItem();
        InicarMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuGestionTotal = new javax.swing.JMenu();
        menuItemGestionFactura = new javax.swing.JMenuItem();
        menuItemGestionProducto = new javax.swing.JMenuItem();
        menuItemGestionBodega = new javax.swing.JMenuItem();
        menuItemGestionCliente = new javax.swing.JMenuItem();
        menuItemGestionUsuario = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desktopPane.add(jLabel1);
        jLabel1.setBounds(100, 110, 300, 170);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuIniciarS.setMnemonic('f');
        menuIniciarS.setText("Inicio");

        menuRegistar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuRegistar.setMnemonic('s');
        menuRegistar.setText("Registar");
        menuRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistarActionPerformed(evt);
            }
        });
        menuIniciarS.add(menuRegistar);

        menuRegistarCliente.setText("Registar Cliente");
        menuRegistarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistarClienteActionPerformed(evt);
            }
        });
        menuIniciarS.add(menuRegistarCliente);

        InicarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        InicarMenuItem.setMnemonic('o');
        InicarMenuItem.setText("Iniciar Sesion");
        InicarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicarMenuItemActionPerformed(evt);
            }
        });
        menuIniciarS.add(InicarMenuItem);

        jMenuItem1.setText("Inventario productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuIniciarS.add(jMenuItem1);

        jMenuItem2.setText("Inventario por bodega");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuIniciarS.add(jMenuItem2);

        menuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCerrarSesion.setText("Cerra Sesion");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuIniciarS.add(menuItemCerrarSesion);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuIniciarS.add(exitMenuItem);

        menuBar.add(menuIniciarS);

        menuGestionTotal.setMnemonic('e');
        menuGestionTotal.setText("Gestinar");

        menuItemGestionFactura.setText("Factura");
        menuItemGestionFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGestionFacturaActionPerformed(evt);
            }
        });
        menuGestionTotal.add(menuItemGestionFactura);

        menuItemGestionProducto.setMnemonic('t');
        menuItemGestionProducto.setText("Producto");
        menuItemGestionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGestionProductoActionPerformed(evt);
            }
        });
        menuGestionTotal.add(menuItemGestionProducto);

        menuItemGestionBodega.setText("Bodega");
        menuItemGestionBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGestionBodegaActionPerformed(evt);
            }
        });
        menuGestionTotal.add(menuItemGestionBodega);

        menuItemGestionCliente.setText("Cliente");
        menuItemGestionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGestionClienteActionPerformed(evt);
            }
        });
        menuGestionTotal.add(menuItemGestionCliente);

        menuItemGestionUsuario.setMnemonic('y');
        menuItemGestionUsuario.setText("Usuario");
        menuItemGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGestionUsuarioActionPerformed(evt);
            }
        });
        menuGestionTotal.add(menuItemGestionUsuario);

        jMenuItem5.setText("Devolver factura");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuGestionTotal.add(jMenuItem5);

        menuBar.add(menuGestionTotal);

        jMenu1.setText("Idioma");

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void InicarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicarMenuItemActionPerformed
        cerrarVentanas();
        ventanaIniciarSesion.setVisible(true);
        menuRegistar.setVisible(false);
    }//GEN-LAST:event_InicarMenuItemActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        menuGestionTotal.setVisible(false);
        menuItemCerrarSesion.setVisible(false);
        menuIniciarS.setVisible(true);
        menuRegistar.setVisible(true);
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistarActionPerformed
        cerrarVentanas();

        ventanaRegistrarUsuario.setVisible(true);

    }//GEN-LAST:event_menuRegistarActionPerformed

    private void menuItemGestionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGestionProductoActionPerformed
        this.ventanaGestionarProducto.setVisible(true);

    }//GEN-LAST:event_menuItemGestionProductoActionPerformed

    private void menuItemGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGestionUsuarioActionPerformed
        cerrarVentanas();

        ventanaGestionUsuario.setVisible(true);
    }//GEN-LAST:event_menuItemGestionUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    ventanaMostrarProductos.setVisible(true);
    
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuRegistarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistarClienteActionPerformed
        cerrarVentanas();

        ventanaRegistrarCliente.setVisible(true);
    }//GEN-LAST:event_menuRegistarClienteActionPerformed

    private void menuItemGestionBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGestionBodegaActionPerformed
        ventanaGestionarBodega.setVisible(true);


    }//GEN-LAST:event_menuItemGestionBodegaActionPerformed

    private void menuItemGestionFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGestionFacturaActionPerformed
        ventanaGestionarFactura.setVisible(true);
    }//GEN-LAST:event_menuItemGestionFacturaActionPerformed

    private void menuItemGestionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGestionClienteActionPerformed
      cerrarVentanas();
      ventanaGestionCliente.setVisible(true);
    }//GEN-LAST:event_menuItemGestionClienteActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        ventanaDevolverFactura.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ventanaProductosPorBodega.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    public void cerrarVentanas() {

        ventanaIniciarSesion.setVisible(false);
        ventanaRegistrarUsuario.setVisible(false);

    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InicarMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGestionTotal;
    private javax.swing.JMenu menuIniciarS;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemGestionBodega;
    private javax.swing.JMenuItem menuItemGestionCliente;
    private javax.swing.JMenuItem menuItemGestionFactura;
    private javax.swing.JMenuItem menuItemGestionProducto;
    private javax.swing.JMenuItem menuItemGestionUsuario;
    private javax.swing.JMenuItem menuRegistar;
    private javax.swing.JMenuItem menuRegistarCliente;
    // End of variables declaration//GEN-END:variables

}
