
package ec.edu.ups.dao;
import ec.edu.ups.idao.IProductoDAO;
import ec.edu.ups.modelo.Bodega;
import ec.edu.ups.modelo.Producto;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class ProductoDAO implements IProductoDAO{
    
      private RandomAccessFile archivo;
    private int tamañoRegistro;
    private Producto producto;

    public ProductoDAO() {
        
        tamañoRegistro=47;
try {
            archivo = new RandomAccessFile("datos/Productos.dat", "rw");
            tamañoRegistro = 47;
        } catch (IOException ex) {
            System.out.println("error de lectura y escritura");
            ex.printStackTrace();
        }
        
    }
    
    @Override
    public void create(Producto producto) {
        
        try {
            
            archivo.seek(archivo.length());
            archivo.writeUTF(producto.getCodigo());
            archivo.writeUTF(producto.getNombre());
            
            archivo.writeInt(producto.getCantidad());
            
            archivo.writeDouble(producto.getPrecio());
            
            archivo.writeUTF(producto.getCodigoBodega());
            
            ;
        } catch (IOException ex) {
            System.out.println("error en el create ProductoDao");
        }
        
    }

    @Override
    public Producto read(String CodigoProduto) {
        
        return null;
    }

    @Override
    public void update(Producto producto, String codigo) {
        try {
            long salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                archivo.seek(archivo.getFilePointer() - 4);
                
                if (codigo.equals(codigoArchivo.trim())) {
                    
                    salto = archivo.length() + 1;
                    
                    archivo.writeUTF(producto.getCodigo());
                    archivo.writeUTF(producto.getNombre());
            
                    archivo.writeInt(producto.getCantidad());
            
                    archivo.writeDouble(producto.getPrecio());
            
                    archivo.writeUTF(producto.getCodigoBodega());
                    
                                    
                    
                }
                salto = salto + 47;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String codigo) {
        try {
            Producto p=new Producto(" ", " ", 0, 0, " ");
            long salto = 0;
            
            while (salto < archivo.length()) {
                
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                System.out.println(codigoArchivo);
                
                archivo.seek(archivo.getFilePointer() - 4);
                
                System.out.println(archivo.getFilePointer());
                
                if (codigo.equals(codigoArchivo.trim())) {
                    
                   
                  
                    archivo.writeUTF(p.getCodigo());
                    System.out.println(p.getCodigo());
            archivo.writeUTF(p.getNombre());
            
            archivo.writeInt(p.getCantidad());
            
            archivo.writeDouble(p.getPrecio());
            
            archivo.writeUTF(p.getCodigoBodega());
                                      
                  
                    salto=archivo.length()+1;
                    
                }
                salto = salto + 47;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
        
    }
    @Override
    public List<Producto> listarProductos(){
        List<Producto> modelo = new ArrayList<Producto>();
        
        
        try {
        int salto = 0;
        while (salto < archivo.length()) {
            archivo.seek(salto);
                    
                    String codigo = archivo.readUTF();
                    String nombre = archivo.readUTF();
                
                    
                   
                    int cantidad=archivo.readInt();
                    
                    double precio=archivo.readDouble();
                    
                    String codigoBodega=archivo.readUTF();
                    
                    
                    Producto producto=new Producto(codigo, nombre, cantidad, precio, codigoBodega);
                    if(codigo.trim().equalsIgnoreCase("")||codigo.trim().contains("f")==true){
                        
                    }else{
                       modelo.add(producto);
                    }
                    
                    salto=salto+47;
                    
        }
        return modelo;
        } catch (IOException e) {
            System.out.println("Error listar producto");
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Producto> listarProductosPorBodega(String CodigoBo){
        List<Producto> modelo = new ArrayList<Producto>();
        
        
        
        try {
        int salto = 0;
        while (salto < archivo.length()) {
            archivo.seek(salto);
                    
                    String codigo = archivo.readUTF();
                    String nombre = archivo.readUTF();
                
                    
                   
                    int cantidad=archivo.readInt();
                    
                    double precio=archivo.readDouble();
                    
                    String codigoBodega=archivo.readUTF();
                    
                    
                    Producto producto=new Producto(codigo, nombre, cantidad, precio, codigoBodega);
                    System.out.println(codigo.trim().contains("f"));
                    if(codigo.trim().equalsIgnoreCase("")||codigo.trim().contains("f")==true){
                        
                    }else{
                        if(codigoBodega.trim().equalsIgnoreCase(CodigoBo)){
                            modelo.add(producto);
                        }
                       
                    }
                    
                    salto=salto+47;
                    
        }
        return modelo;
        } catch (IOException e) {
            System.out.println("Error listar producto");
            e.printStackTrace();
        }
        return null;
    }
    @Override
 public List<String> findAll(){
     
     List<String> Lista = new ArrayList<String>();
        
        try {
            int salto = 0;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String codigo = archivo.readUTF();
                
                Lista.add(codigo.trim());
                
               
                salto = salto + 47;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Lista;

 }
 @Override
 public Producto buscarPorNombreYBodega(String nombre, String codigoBodega){
     
     try {
            long salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                    String nombre1 = archivo.readUTF();
                    int cantidad=archivo.readInt();
                    double precio=archivo.readDouble();
                    String codigoBodega1=archivo.readUTF();
                if (nombre1.trim().equalsIgnoreCase(nombre)&&codigoBodega1.trim().equalsIgnoreCase(codigoBodega)) {
                    Producto p=new Producto(codigoArchivo, nombre1, cantidad, precio, codigoBodega1);
                    return p;
                    
                    
                                    
                    
                }
                salto = salto + 47;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
     
     return null;
 }
  @Override
 public List<Producto> buscarPorNombre(String nombre){
     List<Producto> lista = new ArrayList<Producto>();
     try {
            long salto = 0;
            
            while (salto < archivo.length()) {
                archivo.seek(salto);
                
                String codigoArchivo = archivo.readUTF();
                    String nombre1 = archivo.readUTF();
                    int cantidad=archivo.readInt();
                    double precio=archivo.readDouble();
                    String codigoBodega1=archivo.readUTF();
                if (nombre1.trim().equalsIgnoreCase(nombre)) {
                    Producto p=new Producto(codigoArchivo, nombre1, cantidad, precio, codigoBodega1);
                    
                    lista.add(p);
                    
                                    
                    
                }
                salto = salto + 47;
            }
        } catch (IOException e) {
            System.out.println("Error login");
            e.printStackTrace();
        }
     
     return lista;
     
 }
    
}
