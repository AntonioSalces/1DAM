package eticket;

public interface TicketLineInterface {
    public Product geProduct();
    public int getAmount();
    public void modifyAmount(int newAmount);
    public double getTotalPrice();
    @Override
    String toString();
}
