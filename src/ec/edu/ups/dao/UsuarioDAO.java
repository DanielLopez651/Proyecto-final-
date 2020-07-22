/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user
 */
public class UsuarioDAO implements IUsuarioDAO {

    private RandomAccessFile archivo;
    private int tamañoRegistro;
    private Usuario usuario;

    public UsuarioDAO() {
        tamañoRegistro = 128;
        try {
            archivo = new RandomAccessFile("datos/usuario.dat", "rw");
            tamañoRegistro = 128;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
    }

    @Override
    public void create(Usuario usuario) {
        try {
            archivo.seek(archivo.length());
            archivo.writeUTF(usuario.getCedula());
            archivo.writeUTF(usuario.getNombre());
            archivo.writeUTF(usuario.getApellido());
            archivo.writeUTF(usuario.getCorreo());
            archivo.writeUTF(usuario.getContraseña());
        } catch (IOException ex) {
            System.out.println("error en el create UsuarioDAO");
        }
    }

    @Override
    public Usuario read(String cedula) {
        int salto = 0;

        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF().trim();
                if (cedula.trim().equals(cedulaArchivo)) {
                    Usuario u = new Usuario(cedula, archivo.readUTF().trim(),
                            archivo.readUTF().trim(), archivo.readUTF().trim(),
                            archivo.readUTF().trim());
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
    public void update(Usuario usuario) {
        int salto = 0;
        int registro = 128;
        String cedula = usuario.getCedula();
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF().trim();
                if (cedula.trim().equals(cedulaArchivo)) {

                    archivo.writeUTF(usuario.getNombre());
                    archivo.writeUTF(usuario.getApellido());
                    archivo.writeUTF(usuario.getCorreo());
                    archivo.writeUTF(usuario.getContraseña());
                    break;
                }
                salto += registro;
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura o escritura en updateUsuario");
        }
    }

    @Override
    public void delete(Usuario usuario) {

        try {
            String cedula = usuario.getCedula();
            int salto = 0;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF();
                if (cedula.trim().equals(cedulaArchivo.trim())) {
                    archivo.writeUTF(llenarEspacios(10));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(50));
                    archivo.writeUTF(llenarEspacios(8));
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

    @Override
    public Usuario login(String correo, String contraseña) {
        try {
            int salto = 66;

            while (salto < archivo.length()) {
                archivo.seek(salto);
                String correoArchivo = archivo.readUTF();
                String contraseñaArchivo = archivo.readUTF();
                if (correo.equals(correoArchivo.trim())
                        && contraseña.equals(contraseñaArchivo.trim())) {
                    archivo.seek(salto - 66);
                    return new Usuario(archivo.readUTF().trim(), archivo.readUTF().trim(), archivo.readUTF().trim(), archivo.readUTF().trim(), archivo.readUTF().trim());
                }
                salto += tamañoRegistro;
            }

        } catch (IOException ex) {
            System.out.println("error login");
        }
        return null;

    }
}
