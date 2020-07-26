package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Bodega;
import java.util.List;
import ec.edu.ups.idao.IBodegaDao;
import ec.edu.ups.dao.BodegaDao;
import javax.swing.table.DefaultTableModel;

public class ControladorBodega {
    private Bodega bodega;
    private IBodegaDao bodegaDAO;

    public ControladorBodega(BodegaDao bodegaDao) {
        this.bodegaDAO = bodegaDao;
    }
    

    public ControladorBodega() {
    }
    public void registrarBodega(String codigo, String nombre, String direccion) {
        
        
        bodega = new Bodega(codigo, nombre, direccion);
        
       
        bodegaDAO.create(bodega);
    }
    public boolean actualizarBodega(String codigo, String nombre, String Direccion){
          List<String> lista=bodegaDAO.findAll();
        
          for (int i = 0; i <lista.size() ; i++) {
          if(lista.get(i).equalsIgnoreCase(codigo)){
              Bodega bodega=new Bodega(codigo, nombre, Direccion);
              bodegaDAO.update(bodega, codigo);
              return true;
          }
          
          }
        return false;
    }
    public boolean eliminarBodega(String codigo){
        List<String> lista=bodegaDAO.findAll();
        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i).equalsIgnoreCase(codigo)){
                bodegaDAO.delete(codigo);
                return true;
            }
        }
        return false;
    
}
    public DefaultTableModel ListarBodegas(){
        DefaultTableModel modelo=bodegaDAO.listarTelefonos();
        
        return modelo;
    }
    public boolean validarBodega(String codigo){
        List<String> lista=bodegaDAO.findAll();
         for (int i = 0; i <lista.size() ; i++) {
             if(lista.get(i).equalsIgnoreCase(codigo)){
                 return true;
             }
             
         }
        
        return false;
    }
}
