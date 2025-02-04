package eticket;

public interface TicketLineInterface {
    public Product getProduct();
    public int getCantidadComprada();
    public void modificarCantidadComprada(int cantidad);
    public double devolverPrecioTotal();
}
