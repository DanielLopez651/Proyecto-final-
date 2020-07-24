/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.BodegaDAO;
import ec.edu.ups.modelo.Bodega;
import java.util.List;
import javax.swing.DefaultListModel;
import ec.edu.ups.idao.IBodegaDAO;

public class ControladorBodega {
    private Bodega bodega;
    private IBodegaDAO bodegaDAO;

    public ControladorBodega(IBodegaDAO bodegaDao) {
        this.bodegaDAO = bodegaDAO;
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
    public DefaultListModel ListarBodegas(){
        DefaultListModel modelo=bodegaDAO.listarBodegas();
        
        return modelo;
    }
    
}
