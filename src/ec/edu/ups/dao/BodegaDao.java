/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.dao.BodegaDao;
import ec.edu.ups.idao.IBodegaDao;
import ec.edu.ups.modelo.Bodega;
import java.io.IOException;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
        
public class BodegaDao implements IBodegaDao{
    private RandomAccessFile archivo;
    private int tamañoRegistro;
    private Bodega bodega;
    /**
     * se crea el archivo en nuestro datos con permisos rw
     */
    public  BodegaDao (){
       
    tamañoRegistro=83;
try {
            archivo = new RandomAccessFile("datos/Bodegas.dat", "rw");
            tamañoRegistro = 83;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
    }    
    /**
     * 
     * @param bodega 
     */
    @Override
    public void create(Bodega bodega) {
        try {
            
            archivo.seek(archivo.length());
            archivo.writeUTF(bodega.getCodigo());
            archivo.writeUTF(bodega.getNombre());
            archivo.writeUTF(bodega.getDireccion());
            
            ;
        } catch (IOException ex) {
            System.out.println("error en el create UsuarioDAO");
        }
    }
/**
 * 
 * @param idBodega
 * @return 
 */
    @Override
    public Bodega read(String idBodega) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * 
 * @param bodega
 * @param codigo 
 */
    @Override
    public void update(Bodega bodega, String codigo) {
        try {
            long salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                archivo.seek(archivo.getFilePointer() - 4);
                
                if (codigo.equals(codigoArchivo.trim())) {
                    
                    salto = archivo.length() + 1;
                    
                    archivo.writeUTF(bodega.getCodigo());
                    
                    archivo.writeUTF(bodega.getNombre());
                    
                    archivo.writeUTF(bodega.getDireccion());
                    
                                    
                    
                }
                salto = salto + 83;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param codigo 
     */

    @Override
    public void delete(String codigo) {
        
        try {
            long salto = 0;
            int registro = 83;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                archivo.seek(archivo.getFilePointer() - 4);
                
                if (codigo.equals(codigoArchivo.trim())) {
                    
                   
                  
                    archivo.writeUTF("  ");
                    archivo.writeUTF("                         ");
                    archivo.writeUTF("                                               ");                  
                  
                    salto=archivo.length()+1;
                    
                }
                salto = salto + 83;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
   
    }
    /**
     * 
     * @return 
     */
    @Override
 public List<String> findAll(){
     
     List<String> Lista = new ArrayList<String>();
        
        try {
            int salto = 0;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String codigo = archivo.readUTF();
                
                Lista.add(codigo.trim());
                
               
                salto = salto + 83;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Lista;

 }
 /**
  * 
  * @return 
  */
 @Override
 public List<Bodega> listarTelefonos(){
     List<Bodega> modelo = new ArrayList<Bodega>();
        
        try {
        int salto = 0;
        while (salto < archivo.length()) {
            archivo.seek(salto);
            
                    String codigo = archivo.readUTF();
                    String nombre = archivo.readUTF();
                    String direccion= archivo.readUTF();
                    
                    
                    Bodega bodega=new Bodega(codigo, nombre, direccion);
                    if(codigo.trim().equalsIgnoreCase("")){
                        
                    }else{
                       modelo.add(bodega);
                    }
                    
                    salto=salto+83;
                    
        }
        return modelo;
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
        
        
        return null;
     
     
 }
}
    

