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
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO implements IFacturaDAO {

    private RandomAccessFile archivo;
    private int tamañoRegistro;

    /**
     * se crea el archivo en nuestro datos con permisos rw
     */
    public FacturaDAO() {
        tamañoRegistro = 18;
        try {
            archivo = new RandomAccessFile("datos/facturas.dat", "rw");
            tamañoRegistro = 18;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
    }
/**
 * 
 * @param factura 
 */
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
    /**
     * 
     * @param codigo
     * @return 
     */

    @Override
    public boolean cambiarEstado(String codigo) {
        try {

            long salto = 0;

            while (salto < archivo.length()) {
                archivo.seek(salto);

                String codigoArchivo = archivo.readUTF();
                System.out.println(archivo.getFilePointer());
                if (codigoArchivo.trim().equalsIgnoreCase(codigo)) {
                    archivo.writeUTF("invalido");
                    return true;
                }
                salto = salto + 18;
            }

        } catch (IOException ex) {
            System.out.println("error en el create FacturaDao");
            ex.printStackTrace();
        }
        return false;
    }
    /**
     * 
     * @return 
     */

    @Override
    public List<Factura> mostrarFacturas() {
        List<Factura> lista = new ArrayList<Factura>();
        try {
            long salto = 0;

            while (salto < archivo.length()) {
                archivo.seek(salto);

                String codigoArchivo = archivo.readUTF();
                String estado = archivo.readUTF();

                Factura f = new Factura(codigoArchivo, estado);

                lista.add(f);

                salto = salto + 18;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }

        return lista;
    }

}
