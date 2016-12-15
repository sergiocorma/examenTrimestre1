/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentrimestre1;

import java.util.Scanner;

/**
 * Clase que contiene los métodos de menu
 * @author Juan Francisco
 * @version 1.0
 */
public class Menu {
    
    public static void pintaMenu(){
        System.out.println("");
        System.out.println("");
        System.out.println("1- Guardar producto");
        System.out.println("2- Buscar producto por nombre");
        System.out.println("3- Ver todos los productos");
        System.out.println("4- Salir");
    }
    
    public static Producto pedirDatosProducto(){
        String nombre,fecha;
        int precio;
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el nombre del producto");
        nombre = leer.nextLine();
        System.out.println("Dime el precio del producto");
        precio = leer.nextInt();
        System.out.println("Dime la fecha de venta del producto con formato ddmmAAAA");
        fecha = leer.nextLine();
        fecha = leer.nextLine();
        
        
        Producto producto = new Producto(nombre,precio,fecha);
        
        return producto;
    }
    
    /**
     * Busca un producto por nombre en el vector de productos
     * @param vector es el vector donde estan los productos
     * @param nombre nombre a buscar en el vector
     * @return un objeto NO NULL de producto.
     */
    public static Producto buscarProducto(Producto[] vector, String nombre){
        Producto producto = new Producto();
        
        try{
            for (int i=0;i<vector.length;i++){
                if (vector[i]!=null)
                    if (vector[i].getNombre().equalsIgnoreCase(nombre))
                        producto = vector[i];
            }
        }catch(NullPointerException error){
            System.out.println("Has leido un null");
        }catch(Exception error){
            System.out.println("Hay un error");
        }
    
        return producto;
    }
    
}
