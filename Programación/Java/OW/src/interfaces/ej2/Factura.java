package interfaces.ej2;

public class Factura {
    private String nombreCliente;
    private Vendible[] productos;

    public Factura() {

    }

    public Factura(String nombreCliente, Vendible[] productos) {
        this.nombreCliente = nombreCliente;
        this.productos = productos.clone();
    }

    public double calcularPrecio() {
        double total = 0;
        for(int i = 0; i < productos.length; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
}
