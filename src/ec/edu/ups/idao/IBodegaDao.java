/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;
import ec.edu.ups.modelo.Bodega;
import java.util.List;
import javax.swing.DefaultListModel;
public interface IBodegaDao {
    public void create(Bodega bodega);

    public Bodega read(String idBodega);

    public void update(Bodega bodega,String codigo);

    public void delete(String codigo);
     public List<String> findAll();
     public DefaultListModel listarTelefonos();
    
}
