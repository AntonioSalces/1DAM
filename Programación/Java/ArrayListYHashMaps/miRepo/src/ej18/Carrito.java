package ej18;

import java.util.HashMap;

public class Carrito {
    private HashMap<Elemento, Integer> compra;

    public Carrito() {
        this.compra = new HashMap<>();
    }

    public void agrega(Elemento e) {
        compra.put(e, e.getCantidad());
    }

    public int numeroDeElementos() {
        return compra.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento elemento : compra) {
            total += elemento.getPrecio() * elemento.getCantidad();
        }
        return total;
    }
    
    @Override
public String toString() {
    String productos = "";
    for (Elemento elemento : compra) {
        productos += String.format("%s", elemento);
    }

    return String.format(
        "Contenido del carrito%n======================%n%s", productos);
}

}
