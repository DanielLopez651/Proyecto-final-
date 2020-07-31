package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Bodega;
import java.util.List;
import ec.edu.ups.idao.IBodegaDao;
import ec.edu.ups.dao.BodegaDao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Lopez, Adrian Lopez ,Elian Guallpa, Andres Abad
 */
public class ControladorBodega {

    private Bodega bodega;
    private IBodegaDao bodegaDAO;

    /**
     * @param bodegaDao
     */
    public ControladorBodega(BodegaDao bodegaDao) {
        this.bodegaDAO = bodegaDao;
    }

    /**
     * En el constructor controladorBodega sera vacio como las buenas practicas
     * de programacion
     */
    public ControladorBodega() {
    }

    /**
     * metodo registrar bodega
     *
     * @param codigo
     * @param nombre
     * @param direccion
     */
    public void registrarBodega(String codigo, String nombre, String direccion) {

        bodega = new Bodega(codigo, nombre, direccion);

        bodegaDAO.create(bodega);
    }

    /**
     * Buscamos en la bodega y hacemos uso de nuestro update
     *
     * @param codigo
     * @param nombre
     * @param Direccion
     * @return
     */
    public boolean actualizarBodega(String codigo, String nombre, String Direccion) {
        List<String> lista = bodegaDAO.findAll();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(codigo)) {
                Bodega bodega = new Bodega(codigo, nombre, Direccion);
                bodegaDAO.update(bodega, codigo);
                return true;
            }

        }
        return false;
    }

    /**
     * Eliminamos una bodega por medio del codigo
     *
     * @param codigo
     * @return
     */
    public boolean eliminarBodega(String codigo) {
        List<String> lista = bodegaDAO.findAll();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(codigo)) {
                bodegaDAO.delete(codigo);
                return true;
            }
        }
        return false;

    }

    /**
     *
     * @return una lista de bodegas
     */
    public List<Bodega> ListarBodegas() {
        List<Bodega> modelo = bodegaDAO.listarTelefonos();

        return modelo;
    }

    /**
     *
     * @param codigo
     * @return retorna true si el codigo existe
     */
    public boolean validarBodega(String codigo) {
        List<String> lista = bodegaDAO.findAll();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(codigo)) {
                return true;
            }

        }

        return false;
    }
}
