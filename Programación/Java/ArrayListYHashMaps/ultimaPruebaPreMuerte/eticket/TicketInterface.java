package eticket;

import java.util.Date;

public interface TicketInterface {
    public void add(Product p, int amount);
    public void remove(Product p, int amount) throws ProductDoesNotExists, NotEnoughStock;
    public Date getDate();
    public int getCode();
    public double getTotalPrice();
    @Override
    String toString();
}
