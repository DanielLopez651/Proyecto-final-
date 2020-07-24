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

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
   

    public Cliente() {
    }
    
     public Cliente(String cedula, String nombre, String apellido, String direccion) {
         System.out.println("nose");
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDireccion(direccion);
        

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = validarEspacios(cedula, 10);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarEspacios(nombre, 25);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = validarEspacios(apellido, 25);
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
        hash = 31 * hash + Objects.hashCode(this.cedula);
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
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedulaCliente=" + cedula + ", nombreCliente=" + nombre +
                ", apellidoCliente=" + apellido + ", direccion=" + direccion 
                 + '}';
    }
    
     
     
     


     

}
