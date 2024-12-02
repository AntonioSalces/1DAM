/*
Enunciado de Examen Avanzado:

Desarrolla un sistema de inventario para una tienda en línea que administre productos con precios y cantidades de stock. 
La aplicación debe validar los precios y manejar excepciones personalizadas para controlar el inventario y los valores negativos. 
Sigue los siguientes requisitos:

    Clase Producto:
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
Excepciones Personalizadas:

    Crea las siguientes excepciones personalizadas:
        PrecioInvalidoException, que debe lanzarse cuando el precio del producto es menor que cero.
        CantidadInvalidaException, que debe lanzarse cuando la cantidad especificada es negativa.
        StockInsuficienteException, que debe lanzarse cuando se intenta vender más productos de los que hay en stock.
Captura y muestra los errores usando un bloque try-catch.
    Usa printf para mostrar el nombre, precio y cantidad en stock de cada producto después de cada operación de venta.
 */

 import productos.Producto;
import excepciones.PrecioInvalidoExeption;
import excepciones.CantidadInvalidadException;
import excepciones.StockInsuficienteException;

public class App {
    public static void main(String[] args) {
        try {
            // Creación de un producto
            Producto manzana = new Producto("Manzana", 1.2, 12);
            
            // Venta de 2 unidades de manzana
            manzana.vender(8);

            // Mostrar detalles del producto después de la venta
            System.out.printf("Nombre: %s, Precio: %.2f, Cantidad en stock: %d%n", 
                              manzana.getNombre(), manzana.getPrecio(), manzana.getCantidad());
        } catch (PrecioInvalidoExeption e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CantidadInvalidadException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
