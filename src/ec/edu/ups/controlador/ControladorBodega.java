/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.BodegaDao;
import ec.edu.ups.idao.IBodegaDao;
import ec.edu.ups.modelo.Bodega;
import java.util.List;
import javax.swing.DefaultListModel;

public class ControladorBodega {
    private Bodega bodega;
    private IBodegaDao bodegaDao;

    public ControladorBodega(IBodegaDao bodegaDao) {
        this.bodegaDao = bodegaDao;
    }
    

    public ControladorBodega() {
    }
    public void registrarCliente(String codigo, String nombre, String direccion) {
        
        
        bodega = new Bodega(codigo, nombre, direccion);
        
        bodegaDao.create(bodega);
    }
    public boolean actualizarBodega(String codigo, String nombre, String Direccion){
          List<String> lista=bodegaDao.findAll();
        
          for (int i = 0; i <lista.size() ; i++) {
          if(lista.get(i).equalsIgnoreCase(codigo)){
              Bodega bodega=new Bodega(codigo, nombre, Direccion);
              bodegaDao.update(bodega, codigo);
              return true;
          }
          
          }
        return false;
    }
    public boolean eliminar(String codigo){
        List<String> lista=bodegaDao.findAll();
        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i).equalsIgnoreCase(codigo)){
                bodegaDao.delete(codigo);
                return true;
            }
        }
        return false;
    
}
    public DefaultListModel ListarTelefonos(){
        DefaultListModel modelo=bodegaDao.listarTelefonos();
        
        return modelo;
    }
    
}
