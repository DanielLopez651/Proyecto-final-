package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import ec.edu.ups.dao.ProductoDAO;
import ec.edu.ups.idao.IProductoDAO;
import java.util.ArrayList;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControladorProducto {

    private Producto producto;
    private IProductoDAO iProductoDAO;
/**
 * 
 * @param productoDAO 
 */
    public ControladorProducto(ProductoDAO productoDAO) {
        this.iProductoDAO = productoDAO;
    }
  /**
     * En el constructor controladorProducto sera vacio como las buenas practicas
     * de programacion
     */
    public ControladorProducto() {

    }
/**
 * 
 * @param codigo
 * @param nombre
 * @param cantidad
 * @param precio
 * @param codigoBodega 
 */
    public void registrarProducto(String codigo, String nombre, int cantidad, double precio, String codigoBodega) {

        producto = new Producto(codigo, nombre, cantidad, precio, codigoBodega);
        System.out.println(producto.getCantidad());
        iProductoDAO.create(producto);

    }
    /**
     * 
     * @return lista de productos
     */

    public List<Producto> ListarProductos() {
        List<Producto> modelo = iProductoDAO.listarProductos();

        return modelo;
    }
/**
 * 
 * @param codigoBo
 * @return 
 */
    public List<Producto> ListarProductosPorBodega(String codigoBo) {
        List<Producto> modelo = iProductoDAO.listarProductosPorBodega(codigoBo);

        return modelo;
    }
    /**
     * 
     * @param codigo
     * @param nombre
     * @param cantidad
     * @param precio
     * @param codigoBodega
     * @return 
     */
    public boolean actualizarBodega(String codigo, String nombre, int cantidad, double precio, String codigoBodega) {
        List<String> lista = iProductoDAO.findAll();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(codigo)) {
                Producto producto = new Producto(codigo, nombre, cantidad, precio, codigoBodega);
                iProductoDAO.update(producto, codigo);
                return true;
            }

        }
        return false;
    }
    /**
     * 
     * @param codigo
     * @return 
     */

    public boolean eliminarProducto(String codigo) {
        List<String> lista = iProductoDAO.findAll();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(codigo)) {
                iProductoDAO.delete(codigo);
                return true;
            }
        }
        return false;

    }
    /**
     * 
     * @param nombre
     * @param codigoBodega
     * @return 
     */

    public Producto LlenarFactura(String nombre, String codigoBodega) {
        Producto p = iProductoDAO.buscarPorNombreYBodega(nombre, codigoBodega);
        return p;
    }
/**
 * 
 * @param nombre
 * @return 
 */
    public List<Producto> BuscarPorNombre(String nombre) {
        List<Producto> lista = new ArrayList<Producto>();
        lista = iProductoDAO.buscarPorNombre(nombre);
        return lista;
    }
/**
 * 
 * @param CodigoProducto
 * @return 
 */
    public List<Producto> productosFacturados(String CodigoProducto) {
        List<Producto> p = iProductoDAO.read(CodigoProducto);
        return p;
    }
    /**
     * 
     * @param codigo
     * @param nombre
     * @param cantidad
     * @param precio
     * @param codigoBodega
     * @return 
     */

    public boolean actualizarBodegaPorNombre(String codigo, String nombre, int cantidad, double precio, String codigoBodega) {
        Producto p = new Producto(codigo, nombre, cantidad, precio, codigoBodega);

        boolean c = iProductoDAO.updatePorNombre(p, nombre);

        if (c == true) {
            return true;
        } else {
            return false;
        }

    }

}
