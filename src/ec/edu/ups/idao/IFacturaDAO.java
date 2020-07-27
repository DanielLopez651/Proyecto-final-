package ec.edu.ups.idao;
import ec.edu.ups.modelo.Factura;
import java.util.List;
public interface IFacturaDAO {
    public void create(Factura factura);
    public boolean cambiarEstado(String codigo);
    public List<Factura> mostrarFacturas();
}
