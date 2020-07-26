package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import ec.edu.ups.dao.ProductoDAO;
import ec.edu.ups.idao.IProductoDAO;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControladorProducto {
    private Producto producto;
    IProductoDAO iProductoDAO;
    public ControladorProducto(ProductoDAO productoDAO) {
        this.iProductoDAO=productoDAO;
    }
    public ControladorProducto(){
        
    }
    public void registrarProducto(String codigo, String nombre, int cantidad, double precio,String codigoBodega){
        
         producto=new Producto(codigo, nombre, cantidad, precio, codigoBodega);
        iProductoDAO.create(producto);
        
    }
    public DefaultTableModel ListarProductos(){
        DefaultTableModel modelo=iProductoDAO.listarProductos();
        
        return modelo;
    }
    public DefaultTableModel ListarProductosPorBodega(String codigoBo){
        DefaultTableModel modelo=iProductoDAO.listarProductosPorBodega(codigoBo);
        
        return modelo;
    }
    public boolean actualizarBodega(String codigo, String nombre, int cantidad, double precio, String codigoBodega){
          List<String> lista=iProductoDAO.findAll();
        
          for (int i = 0; i <lista.size() ; i++) {
          if(lista.get(i).equalsIgnoreCase(codigo)){
              Producto producto=new Producto(codigo, nombre, cantidad, precio, codigoBodega);
              iProductoDAO.update(producto, codigo);
              return true;
          }
          
          }
        return false;
    }
    public boolean eliminarProducto(String codigo){
        List<String> lista=iProductoDAO.findAll();
        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i).equalsIgnoreCase(codigo)){
                iProductoDAO.delete(codigo);
                return true;
            }
        }
        return false;
    
}
    
    
    
}
