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

    //Objetos DAO
    private IClienteDAO clienteDAO;

    //Constructor sin parametros
    public ControladorCliente() {

    }

    //Constructor con parametros
    public ControladorCliente(ClienteDAO clienteDAO) {

        this.clienteDAO = clienteDAO;

    }

    public void registrarCliente(String cedula, String nombre, String apellido, String direccion) {
        System.out.println("asd");
        
        cliente = new Cliente(cedula, nombre, apellido, direccion);
        
        clienteDAO.create(cliente);
    }

    public Cliente verificarCliente() {
        return cliente;
    }

    public void actualizarCliente(String nombre, String apellido, String cedula, String direccion
           ) {
        cliente.setNombreCliente(nombre);
        cliente.setApellidoCliente(apellido);
        cliente.setDireccion(direccion);
        cliente.setCedulaCliente(cedula);
        clienteDAO.update(cliente);

    }

    public void eliminarCliente(String cedula) {
        clienteDAO.delete(cliente);
    }

   
}
