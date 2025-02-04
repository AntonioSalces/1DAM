package eticket;

import java.util.HashMap;

public interface TicketLineInterface {
    public Product getProduct(Product p);
    public int getCantidadComprada(Product p, HashMap<Product, Integer> stockProductos);
    public void modificarCantidadComprada(Product p, int nuevaCantidad);
    public double devolverPrecioTotal();
}
