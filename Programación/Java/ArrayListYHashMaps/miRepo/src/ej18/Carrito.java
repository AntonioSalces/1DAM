/*package ej18;

import java.util.HashMap;
import java.util.Map;

public class Carrito {
    private HashMap<String, Elemento> compra;

    public Carrito() {
        
    }

    public void agrega(Elemento e) {
        compra.put(e, e.getCantidad());
    }

    public int numeroDeElementos() {
        return compra.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento elemento : compra.values()) {
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
*/