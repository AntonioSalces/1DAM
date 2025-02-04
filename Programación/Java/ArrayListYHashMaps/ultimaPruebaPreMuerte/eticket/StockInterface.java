package eticket;

public interface StockInterface {
    public void addProduct(Product p, int amount);
    public void allocateProduct(Product p, int amount) throws ProductDoesNotExists, NotEnoughStock;
    @Override
    String toString();
}
