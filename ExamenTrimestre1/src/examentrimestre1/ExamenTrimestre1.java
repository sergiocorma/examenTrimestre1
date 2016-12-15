package examentrimestre1;

import java.util.Scanner;

/**
 *
 * @author Juan Francisco
 */
public class ExamenTrimestre1 {

    public static void main(String[] args) {
         /*Completa el código que falte SIN modificar las lineas escritas*/
        int opcion=0;
        int productosGuardados = 0;
        /*Vector donde se guardarán los productos de tamaño 5*/
        Producto[] vProductos = new Producto[5];

        do{
            Scanner leer = new Scanner(System.in);
            Menu.pintaMenu();
            opcion = leer.nextInt();
           
            switch(opcion){
                case 1:
                   vProductos[productosGuardados] = Menu.pedirDatosProducto();
                   productosGuardados++;
                    
                    break;
                case 2:
                    String nombre;
                    System.out.println("Dime el nombre del producto a buscar");
                    nombre = leer.next();
                    Producto producto = Menu.buscarProducto(vProductos, nombre);
                    
                    if (producto.getNombre()!=null)
                        System.out.println(producto);
                    
                    break;
                    
                case 3:
                    //Ejercicio 4
                    for (Producto product:vProductos){
                        if (product!=null)
                            System.out.println(product);
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("¡Adios!");
                    break;
                    
                default:
                    System.out.println("Elige una opción válida");
                    break;
            }   
        }while (opcion!=4);
        
    }
    
}