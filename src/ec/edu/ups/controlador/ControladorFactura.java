package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import ec.edu.ups.dao.FacturaDAO;
import ec.edu.ups.idao.IFacturaDAO;
import java.util.List;
/**
 * 
 * @author user
 */
public class ControladorFactura {
    private Factura factura;
    private IFacturaDAO facturaDAO;
/**
 * 
 * @param facturaDAO 
 */
    public ControladorFactura(FacturaDAO facturaDAO) {
        this.facturaDAO=facturaDAO;
    }
      /**
     * En el constructor controladorFactura sera vacio como las buenas practicas
     * de programacion
     */

    public ControladorFactura() {
    }
    /**
     * 
     * @param codigo 
     */
    public void registrarFactura(String codigo) {
        factura = new Factura(codigo, "valido");
        facturaDAO.create(factura);
    }
    /**
     * 
     * @return lista de facturas 
     */
    public  List<Factura> mostrarFacturas(){
        List<Factura> lista=facturaDAO.mostrarFacturas();
        
        return lista;
    }
    /**
     * 
     * @param codigo 
     */
    public void cambiarEstado(String codigo){
        facturaDAO.cambiarEstado(codigo);
    }

}
