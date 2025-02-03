package ej17;

public class Elemento {
    private String descripcion;
    private double precio;
    private int cantidad;

    public Elemento(String descripcion, double precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return String.format("%s PVP: %.2f Unidades: %d Subtotal: %.2f", descripcion, precio, cantidad, precio*cantidad);
    }
}
