package eticket;

import java.util.HashMap;

public class Stock implements StockInterface{
    HashMap<Product, Integer> inventario;

    public Stock(){
        inventario = new HashMap<>();
    }

    @Override
    public void addProduct(Product p, int amount){
        if (p == null) {
            System.out.println("Ha ocurrido un problema.");
        }
        if (inventario.containsKey(p)) {
            inventario.put(p, inventario.get(p) + amount);
        } else {
            inventario.put(p, amount);
        }
    }

    @Override
    public void allocateProduct(Product p, int amount) throws ProductDoesNotExists, NotEnoughStock{
        if (p == null) {
            throw new ProductDoesNotExists();
        }
        if (inventario.get(p) < amount) {
            throw new NotEnoughStock();            
        }
        if (inventario.get(p) == amount) {
            inventario.remove(p);
        }
        if (inventario.containsKey(p)) {
            inventario.put(p, inventario.get(p) - amount);
        } else {
            throw new ProductDoesNotExists();
        }
    }
    @Override
    public String toString() {
        String productos = "";

        for (Product producto : inventario.keySet()) {
            productos += producto.toString() + "\nStock disponible: " + inventario.get(producto) + "\n**********************************\n";
        }
        return productos;
    }
}
