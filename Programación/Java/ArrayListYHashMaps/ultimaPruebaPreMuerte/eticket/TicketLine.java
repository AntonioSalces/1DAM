package eticket;

public class TicketLine implements TicketLineInterface{
    private Product producto;
    private int amount;

    public TicketLine(Product producto, int amount) {
        this.producto = producto;
        this.amount = amount;
    }

    @Override
    public Product geProduct() {
        return producto;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void modifyAmount(int newAmount) {
        this.amount = newAmount;
    }

    @Override
    public double getTotalPrice() {
        return amount + producto.getPrice();
    }

    @Override
    public String toString() {
        return String.format("""
                            %50s (%d x %10.2f $ ) = %10.2f%n""", producto.getTradeName(), amount, producto.getPrice(), getTotalPrice());
    }
    
}
