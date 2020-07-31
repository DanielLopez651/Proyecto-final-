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
 * @author Daniel Lopez, Adrian Lopez ,Elian Guallpa, Andres Abad
 */
public class ControladorUsuario {

    private Usuario usuario;

    private IUsuarioDAO usuarioDAO;

    /**
     * En el constructor controladorUsuario sera vacio como las buenas practicas
     * de programacion
     */
    public ControladorUsuario() {

    }

      /**
     * @param usuarioDAO
     */
    
    public ControladorUsuario(UsuarioDAO usuarioDAO) {

        this.usuarioDAO = usuarioDAO;

    }
      /**
     * @param cedula
     * @param nombre
     * @param apellido
     * @param correo
     * @param contraseña 
     * se le llama al usuarioDAO para que nos registre un usuario
     */

    public void registrar(String cedula, String nombre, String apellido, String correo, String contraseña) {
        usuario = new Usuario(cedula, nombre, apellido, correo, contraseña);
        usuarioDAO.create(usuario);
    }
/**
 * valida si existe un usuario
 * @return Usuario
 * 
 */
    public Usuario verificarUsuario() {
        return usuario;
    }
/**
 *  le setteamos con la ayuda del update
 * @param nombre
 * @param apellido
 * @param cedula
 * @param correo
 * @param contraseña 
 */
    public void actualizarUsuario(String nombre, String apellido, String cedula, String correo,
            String contraseña) {
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setContraseña(contraseña);
        usuario.setCedula(cedula);
        usuarioDAO.update(usuario);

    }
    /**
     * eliminamos un usuario dependiendo la cedula
     * @param cedula 
     */

    public void eliminar(String cedula) {
        usuarioDAO.delete(usuario);
    }
    /**
     * 
     * @param correo
     * @param contraseña
     * @return si el correo y contraseña son iguales retorna true 
     */

    public boolean validarUsuario(String correo, String contraseña) {
        usuario = usuarioDAO.login(correo, contraseña);
        if (usuario != null) {
            return true;
        } else {
            return false;
        }
    }

}
