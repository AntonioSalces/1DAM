/*
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. 
 * En esta primera versión del programa se tendrán en cuenta los productos que se indican en la tabla junto con su precio. 
 * Los productos se venden en bote, brick, etc. 
 * Cuando se realiza la compra, hay que indicar el producto y el número de unidades que se compran, 
 * por ejemplo “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por ejemplo “3” si se quieren comprar 3 botes. 
 * La compra se termina con la palabra “fin". 
 * Suponemos que el usuario no va a intentar comprar un producto que no existe. 
 * Utiliza un diccionario para almacenar los nombres y precios de los productos y una o varias listas para almacenar la
 * compra que realiza el usuario.
 * A continuación se muestra una tabla con los productos disponibles y sus respectivos precios:
 * Ejemplo:
 * avena: 2,21
 * garbanzos: 2,39
 * tomate: 1,59
 * jengibre: 3,13
 * quinoa: 4,50
 * guisantes: 1,60
 * Producto: tomate
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: avena
 * Cantidad: 1
 * Producto: tomate
 * Cantidad: 2
 * Producto: fin
 * Producto Precio Cantidad Subtotal
 * ---------------------------------
 * tomate   1,59   1        1,59
 * quinoa   4,50   2        9,00
 * avena    2,21   1        2,21
 * tomate   1,59   2        3,18
 * ---------------------------------
 * TOTAL: 15,98
 */

package ej14;

import java.util.ArrayList;
import java.util.HashMap;

public class Ej14 {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<String, Double>();
        productos.put("tomate", 1.59);
        productos.put("quinoa", 4.50);
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("jengibre", 3.13);
        productos.put("guisantes", 1.60);

        ArrayList<String> compra = new ArrayList<String>();
        ArrayList<Integer> cantidad = new ArrayList<Integer>();

        String producto;
        do {
            System.out.print("Producto: ");
            producto = System.console().readLine();
            if (!producto.equals("fin")) {
                compra.add(producto);
                System.out.print("Cantidad: ");
                cantidad.add(Integer.parseInt(System.console().readLine()));
            }
            System.out.println();
        } while (!producto.equals("fin"));

        System.out.printf("Producto Precio Cantidad Subtotal%n---------------------------------%n");
        for (int i = 0; i < compra.size(); i++) {
            System.out.print(compra.get(i) + "   ");
            System.out.print(productos.get(compra.get(i)) + "   ");
            System.out.print(cantidad.get(i) + "   ");
            System.out.println(productos.get(compra.get(i))*cantidad.get(i) + "   ");
        }
    }
}
