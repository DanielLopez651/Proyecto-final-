/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Cliente {

    private String cedulaCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
   

    public Cliente() {
    }
    
     public Cliente(String cedulaCliente, String nombreCliente, String apellidoCliente, 
             String direccion) {
        this.setCedulaCliente(cedulaCliente);
        this.setNombreCliente(nombreCliente);
        this.setApellidoCliente(apellidoCliente);
        this.setDireccion(direccion);
        

    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = validarEspacios(cedulaCliente, 10);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente =  validarEspacios(nombreCliente, 25);
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = validarEspacios(apellidoCliente, 25);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = validarEspacios(direccion, 50);
    }

   
    public String validarEspacios(String cadena, int lon) {
        if (cadena.length() == lon) {
            return cadena;
        } else {
            if (cadena.length() < lon) {
                return llenarEspacios(cadena, lon);
            } else {
                return cortarEspacios(cadena, lon);
            }
        }
    }

    public String llenarEspacios(String cadena, int lon) {
        return String.format("%-" + lon + "s", cadena);
    }

    public String cortarEspacios(String cadena, int lon) {
        return cadena.substring(0, lon);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.cedulaCliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedulaCliente, other.cedulaCliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente +
                ", apellidoCliente=" + apellidoCliente + ", direccion=" + direccion 
                 + '}';
    }
    
     
     
     


     

}
