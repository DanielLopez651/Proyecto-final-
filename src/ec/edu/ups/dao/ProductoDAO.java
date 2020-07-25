
package ec.edu.ups.dao;
import ec.edu.ups.idao.IProductoDAO;
import ec.edu.ups.modelo.Bodega;
import ec.edu.ups.modelo.Producto;
import java.io.IOException;
import java.io.RandomAccessFile;
public class ProductoDAO implements IProductoDAO{
    
    private RandomAccessFile archivo;
    private int tamañoRegistro;
    private Bodega bodega;

    public ProductoDAO() {
        
        tamañoRegistro=43;
try {
            archivo = new RandomAccessFile("datos/Bodegas.dat", "rw");
            tamañoRegistro = 83;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
        
    }
    
    @Override
    public void create(Producto producto) {
        
    }

    @Override
    public Producto read(String CodigoProduto) {
        
        return null;
    }

    @Override
    public void update(Producto producto) {
       
    }

    @Override
    public void delete(Producto producto) {
        
    }
    
}
