/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.idao.IClienteDAO;

import ec.edu.ups.modelo.Cliente;

/**
 *
 * @author user
 */
public class ControladorCliente {

    private Cliente cliente;
    private IClienteDAO clienteDAO;

    /**
     * En el constructor controladorCliente sera vacio como las buenas practicas
     * de programacion
     */
    public ControladorCliente() {

    }

    /**
     * Nuestro constructor
     *
     * @param clienteDAO
     */
    public ControladorCliente(ClienteDAO clienteDAO) {

        this.clienteDAO = clienteDAO;

    }

    /**
     * Registramos nuestro cliente con la ayuda del create del dao
     *
     * @param cedula
     * @param nombre
     * @param apellido
     * @param direccion
     */
    public void registrarCliente(String cedula, String nombre, String apellido, String direccion) {

        cliente = new Cliente(cedula, nombre, apellido, direccion);

        clienteDAO.create(cliente);
    }

    /**
     *
     * @return un cliente si existe
     */
    public Cliente verificarCliente() {
        return cliente;
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param direccion
     */
    public void actualizarCliente(String nombre, String apellido, String cedula, String direccion) {

        cliente = new Cliente(cedula, nombre, apellido, direccion);
        clienteDAO.update(cliente);

    }

    /**
     *
     * @param cedula
     */
    public void eliminarCliente(String cedula) {
        clienteDAO.delete(cliente);
    }

    /**
     *
     * @param cedula
     * @return un clieente si encuentra su ceedula
     */
    public Cliente validarCliente(String cedula) {
        Cliente c = clienteDAO.read(cedula);
        return c;

    }

}
