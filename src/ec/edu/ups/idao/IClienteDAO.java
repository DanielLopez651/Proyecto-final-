/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Cliente;

/**
 *
 * @author user
 */
public interface IClienteDAO {
     public void create(Cliente cliente);

    public Cliente read(String cedulaCliente);

    public void update(Cliente cliente);

    public void delete(Cliente cliente);

}
