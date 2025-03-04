package Inventario;

/**
 * Clase para representar productos con nombre, precio y stock
 * 
 * @author Gaston
 * @version 1.0
 * @since 04-03-2025
 */
public class Producto {
    /** Nombre del producto*/
    private String nombre;
    /** Precio del producto*/
    private double precio;
    /** Stock disponible del producto*/
    private int stock;

    /**
     * Metodo de fabrica para crear nuevo producto
     * 
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param stock Stock del producto
     * @return nueva instancia del producto
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    /**
     * Constructor privado de la clase producto
     * 
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param stock Stock del producto
     */
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra informacion del producto en consola
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }
    
    /**
     * Obtiene nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece nombre del producto
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene precio del producto
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece precio del producto 
     * @param precio nuevo precio de producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene cantidad de stock del producto
     * @return  cantidad de stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece cantidad de stock del producto
     * @param stock nueva cantidad de stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
