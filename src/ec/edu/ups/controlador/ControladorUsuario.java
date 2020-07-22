/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorUsuario {

    private Usuario usuario;

    //Objetos DAO
    private IUsuarioDAO usuarioDAO;

    //Constructor sin parametros
    public ControladorUsuario() {

    }

    //Constructor con parametros
    public ControladorUsuario(UsuarioDAO usuarioDAO) {

        this.usuarioDAO = usuarioDAO;

    }

    public void registrar(String cedula, String nombre, String apellido, String correo, String contraseña) {
        usuario = new Usuario(cedula, nombre, apellido, correo, contraseña);
        usuarioDAO.create(usuario);
    }

    public Usuario verificarUsuario() {
        return usuario;
    }

    public void actualizarUsuario(String nombre, String apellido, String cedula, String correo,
            String contraseña) {
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setContraseña(contraseña);
        usuario.setCedula(cedula);
        usuarioDAO.update(usuario);

    }

    public void eliminar(String cedula) {
        usuarioDAO.delete(usuario);
    }

    public boolean validarUsuario(String correo, String contraseña) {
        usuario = usuarioDAO.login(correo, contraseña);
        if (usuario != null) {
            return true;
        } else {
            return false;
        }
    }

}
