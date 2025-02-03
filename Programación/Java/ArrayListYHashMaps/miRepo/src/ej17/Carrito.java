package ej17;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Elemento> compra;

    public Carrito() {
        this.compra = new ArrayList<>();
    }

    public void agrega(Elemento e) {
        compra.add(e);
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
