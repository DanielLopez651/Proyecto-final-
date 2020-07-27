package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import ec.edu.ups.dao.FacturaDAO;
import ec.edu.ups.idao.IFacturaDAO;

public class ControladorFactura {
    public Factura factura;
    public IFacturaDAO facturaDAO;

    public ControladorFactura(FacturaDAO facturaDAO) {
        this.facturaDAO=facturaDAO;
    }

    public ControladorFactura() {
    }
    public void registrarFactura(String codigo) {
        factura = new Factura(codigo, "valido");
        facturaDAO.create(factura);
    }

}
