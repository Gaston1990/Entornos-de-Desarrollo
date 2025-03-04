package Inventario;

import Inventario.Producto;
import java.util.ArrayList;
/**
 * Clase para representar inventario de productos
 * permite agregar productos y mostrarlos
 * 
 * @author Gaston
 * @version 1.0
 * @since 04-03-2025
 */
public class Inventario {
    /** Lista de productos en el inventario */
    public ArrayList<Producto> listaProductos;

    /**
     * Constructor inventario
     * inicializa lista vacia de productos
     */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Añade un producto al inventario
     * @param p Producto que se va a agregar
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    /**
     * Mostrar informacion de los productos del inventario
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    /**
     * Metodo principal, prueba de funcionalidads
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        System.out.println("Inventario de productos:");
        inventario.mostrar();

       
    }
}