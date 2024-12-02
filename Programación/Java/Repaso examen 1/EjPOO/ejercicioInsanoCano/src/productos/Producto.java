/*
 *     Clase Producto:
        Crea una clase Producto que contenga:
            Atributo nombre de tipo String para almacenar el nombre del producto.
            Atributo precio de tipo double para el precio del producto.
            Atributo cantidad de tipo int para la cantidad de stock disponible.
        Crea un constructor que reciba nombre, precio y cantidad.
            Si el precio es negativo, debe lanzar una excepción personalizada llamada PrecioInvalidoException.
            Si la cantidad es negativa, debe lanzar otra excepción personalizada llamada CantidadInvalidaException.
        Métodos getNombre, getPrecio y getCantidad para obtener los valores de los atributos.
        Método vender(int cantidad) que disminuye el stock del producto en la cantidad especificada.
            Si la cantidad solicitada supera el stock disponible, debe lanzar una excepción llamada StockInsuficienteException 
            con un mensaje adecuado.
            Si la cantidad es negativa, debe lanzar la excepción CantidadInvalidaException.
 */

 package productos;

 import excepciones.PrecioInvalidoExeption;
 import excepciones.CantidadInvalidadException;
 import excepciones.StockInsuficienteException;
 
 public class Producto {
     private String nombre;
     private double precio;
     private int cantidad;
 
     // Constructor
     public Producto(String nombre, double precio, int cantidad) throws PrecioInvalidoExeption, CantidadInvalidadException {
         if (precio < 0) {
             throw new PrecioInvalidoExeption("El precio no puede ser negativo.");
         }
         if (cantidad < 0) {
             throw new CantidadInvalidadException("La cantidad no puede ser negativa.");
         }
         this.nombre = nombre;
         this.precio = precio;
         this.cantidad = cantidad;    
     }
 
     // Métodos getters
     public int getCantidad() {
         return cantidad;
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public double getPrecio() {
         return precio;
     }
 
     // Método para vender
     public void vender(int cantidad) throws CantidadInvalidadException, StockInsuficienteException {
         if (cantidad < 0) {
             throw new CantidadInvalidadException("La cantidad a vender no puede ser negativa.");
         }
         if (cantidad > this.cantidad) {
             throw new StockInsuficienteException("No hay suficiente stock disponible.");
         }
         this.cantidad -= cantidad; // Reduce el stock
         System.out.printf("Se han vendido %d de %s. Quedan %d unidades a un precio de %.1f la unidad.%n", 
                           cantidad, nombre, this.cantidad, precio);
     }
 }
 