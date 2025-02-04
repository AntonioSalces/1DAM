package eticket;

public interface StockInterface {
    public void allocateProduct(Product p, int cantidad) throws NotEnoughStock, ProductDoesNotExists;
    public void addProduct(Product p, int cantidad) throws ProductDoesNotExists;
}
