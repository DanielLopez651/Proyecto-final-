/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

public class Bodega {
    private String codigo;
    private String nombre;
    private String Direccion;

    public Bodega(String codigo, String nombre, String Direccion) {
        this.setCodigo(codigo);//2 bytes total 4
        this.setNombre(nombre);//25 bytes total 27
        this.setDireccion(Direccion);//50 bytes 52
        //Total de bytes 83
       
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = this.validarEspacios(codigo, 2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =this.validarEspacios(nombre,25);
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = this.validarEspacios(Direccion, 50);
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
        hash = 41 * hash + Objects.hashCode(this.codigo);
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
        final Bodega other = (Bodega) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

   
    
    
    @Override
    public String toString() {
        return "Bodega{" + "codigo=" + codigo + ", nombre=" + nombre + ", Direccion=" + Direccion + '}';
    }
    
}


