package eticket;

import java.util.Date;

public interface TicketInterface {
    public Date getFecha();
    public int getCodigo();
    public void add(Product p, int cantidad) throws ProductDoesNotExists, NotEnoughStock;
    public void remove(Product p, int cantidad) throws ProductDoesNotExists, NotEnoughStock;
    public double getTotal();
    @Override
    String toString();
}
