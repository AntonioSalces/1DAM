package interfaces.ej2;

public class App {
    public static void main(String[] args) {
        Factura f1 = new Factura("Antonio Salces", new Vendible[] 
        {new Producto("Agua", "Bebidas", 1.5),
         new Servicio("Pintado pared", "PinTURa", 4),
         new Servicio("Miau", "fontaneria", 1)});

        System.out.println(f1.calcularPrecio());
    }
}
