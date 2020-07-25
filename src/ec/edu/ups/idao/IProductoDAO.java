package ec.edu.ups.idao;
import ec.edu.ups.modelo.Producto;
        
public interface IProductoDAO {
    
    public void create(Producto producto);

    public Producto read(String CodigoProduto);

    public void update(Producto producto);

    public void delete(Producto producto);
    
    
}
