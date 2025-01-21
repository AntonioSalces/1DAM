package ej3.clases;

public class Producto {
    private String nombre;
    private float precio;
    private int cantidadEnStock;

    public Producto(String nombre, float precio, int cantidadEnStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return String.format("""
            Producto: %s
            Precio: %.2f
            Stock: %d""", nombre, precio, cantidadEnStock);
    }
}
