package ec.edu.ups.idao;
import ec.edu.ups.modelo.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
        
public interface IProductoDAO {
    
    public void create(Producto producto);

    public Producto read(String CodigoProduto);

    public void update(Producto producto, String Codigo);

    public void delete(String codigo);
    
    public DefaultTableModel listarProductos();
    public List<String> findAll();
    
    public List<Producto> listarProductosPorBodega(String codigoBo);
    
    public Producto buscarPorNombreYBodega(String nombre, String codigoBodega);
     public List<Producto> buscarPorNombre(String nombre);
    
    
}
