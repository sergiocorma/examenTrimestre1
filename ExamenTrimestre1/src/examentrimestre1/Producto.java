/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentrimestre1;

/**
 *
 * @author Profesor
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int precio;
    private String fechaVenta;

    public Producto() {
    }

    public Producto(String codigo, String nombre, int precio, String fechaVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaVenta = fechaVenta;
    }
    
    
     public Producto(String nombre, int precio, String fechaVenta) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaVenta = fechaVenta;
        this.codigo = generarCodigo();
    }

    @Override
    public String toString() {
        return " Código: "+ this.codigo +
                "\n Nombre Producto: "+ this.nombre +
                "\n Precio: " + this.precio+
                "\n Fecha de venta: "+ this.fechaVenta.substring(0,2)+"-"+
                this.fechaVenta.substring(2,4)+"-"+this.fechaVenta.substring(4,8);
                
    }
     
     private String generarCodigo(){
         String codigo="";
         String letra="";
         int num1,num2;
         
         if (this.precio<50)
             letra="A";
         
         if (this.precio>= 50 && this.precio <500)
             letra="B";
         
         if (precio>=500)
             letra="C";
         
         num1 = (int) (Math.random() * (10-0)+0);
         num2 = (int) (Math.random() * (10-0)+0);
         
         codigo = letra + Integer.toString(num1) +
                 Integer.toString(num2);
         
         return codigo;
     }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
     
     
}
