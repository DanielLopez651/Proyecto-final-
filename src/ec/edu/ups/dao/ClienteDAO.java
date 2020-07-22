/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user
 */
public class ClienteDAO implements IClienteDAO {

    private RandomAccessFile archivo;
    private int tamañoRegistro;
    private Cliente cliente;

    public ClienteDAO() {
        tamañoRegistro = 118;
        try {
            archivo = new RandomAccessFile("datos/cliente.dat", "rw");
            tamañoRegistro = 118;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
    }

    @Override
    public void create(Cliente cliente) {
        try {
            archivo.seek(archivo.length());
            archivo.writeUTF(cliente.getCedulaCliente());
            archivo.writeUTF(cliente.getNombreCliente());
            archivo.writeUTF(cliente.getApellidoCliente());
            archivo.writeUTF(cliente.getDireccion());
            ;
        } catch (IOException ex) {
            System.out.println("error en el create UsuarioDAO");
        }
    }

    @Override
    public Cliente read(String cedula) {
        int salto = 0;

        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF().trim();
                if (cedula.trim().equals(cedulaArchivo)) {
                    Cliente u = new Cliente(cedula, archivo.readUTF().trim(),
                            archivo.readUTF().trim(), archivo.readUTF().trim()
                    );
                    return u;
                }
                salto += tamañoRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura o escritura en read");
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        int salto = 0;
        int registro = 128;
        String cedula = cliente.getCedulaCliente();
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF().trim();
                if (cedula.trim().equals(cedulaArchivo)) {

                    archivo.writeUTF(cliente.getNombreCliente());
                    archivo.writeUTF(cliente.getApellidoCliente());
                    archivo.writeUTF(cliente.getDireccion());

                    break;
                }
                salto += registro;
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura o escritura en updateUsuario");
        }
    }

    @Override
    public void delete(Cliente cliente) {

        try {
            String cedula = cliente.getCedulaCliente();
            int salto = 0;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF();
                if (cedula.trim().equals(cedulaArchivo.trim())) {
                    archivo.writeUTF(llenarEspacios(10));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(50));

                    break;
                }
                salto += tamañoRegistro;
            }

        } catch (IOException ex) {
            System.out.println("Error delete usuario");
        }
    }

    public String llenarEspacios(int espacios) {
        String aux = "";
        return String.format("%-" + espacios + "s", aux);
    }

}
