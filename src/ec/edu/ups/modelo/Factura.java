package ec.edu.ups.modelo;

import java.util.Objects;

public class Factura 
{
   private String codigo;//4 bytes total 6
   private String estado;//10 bytes total 12
   //14 bytes total 18
    public Factura() {
    }

    public Factura(String codigo, String estado) {
        this.setCodigo(codigo);
        this.setEstado(estado);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = validarEspacios(codigo, 4);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = validarEspacios(estado, 10);
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
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.codigo);
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
        final Factura other = (Factura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", estado=" + estado + '}';
    }
   
   
    
}
