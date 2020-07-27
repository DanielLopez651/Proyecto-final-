/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IFacturaDAO;
import ec.edu.ups.modelo.Factura;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FacturaDAO implements IFacturaDAO{
    private RandomAccessFile archivo;
    private int tamañoRegistro;
    
    public FacturaDAO(){
        tamañoRegistro = 18;
        try {
            archivo = new RandomAccessFile("datos/facturas.dat", "rw");
            tamañoRegistro = 18;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
    }

    @Override
    public void create(Factura factura) {
        try {
            
            archivo.seek(archivo.length());
            archivo.writeUTF(factura.getCodigo());
            archivo.writeUTF(factura.getEstado());
            
        } catch (IOException ex) {
            System.out.println("error en el create FacturaDao");
            ex.printStackTrace();
        }
        
        
        
    }

    @Override
    public boolean cambiarEstado(String codigo) {
        try {
            
            long salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                if(codigoArchivo.trim().equalsIgnoreCase(codigo)){
                    archivo.writeUTF("invalido");
                    return true;
                }
                salto=salto+18;
            }
            
        } catch (IOException ex) {
            System.out.println("error en el create FacturaDao");
            ex.printStackTrace();
        }
        return false;
    }
    
    
}
