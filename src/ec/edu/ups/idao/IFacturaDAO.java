package ec.edu.ups.idao;
import ec.edu.ups.modelo.Factura;
public interface IFacturaDAO {
    public void create(Factura factura);
    public boolean cambiarEstado(String codigo);
    
}
