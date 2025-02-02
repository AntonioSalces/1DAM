/*
 * Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: 
 * Si algún producto se repite en diferentes líneas, se deben agrupar en una sola. 
 * Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, 
 * en el extracto se debe mostrar que se han pedido 4 botes de tomate. 
 * Después de teclear “fin”, el programa pide un código de descuento. 
 * Si el usuario introduce el código “ECODTO”, se aplica un 10% de descuento en la compra.
 * Ejemplo:
 * Producto: tomate
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: avena
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: tomate
 * Cantidad: 2
 * Producto: fin
 * Introduzca código de descuento (INTRO si no tiene ninguno): ECODTO
 * Producto Precio Cantidad Subtotal
 * ---------------------------------
 * tomate   1,59   3         4,77
 * quinoa   4,50   4        18,00
 * avena    2,21   1         2,21
 * ---------------------------------
 * Descuento: 2,50
 * ---------------------------------
 * TOTAL: 22,48
 */ 

package ej15;

import java.util.HashMap;

public class Ej15 {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<String, Double>();
        productos.put("tomate", 1.59);
        productos.put("quinoa", 4.50);
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("jengibre", 3.13);
        productos.put("guisantes", 1.60);

        HashMap<String, Integer> compra = new HashMap<String, Integer>();

        String producto;
        do {
            System.out.print("Producto: ");
            producto = System.console().readLine();
            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(System.console().readLine());
                if (!compra.containsKey(producto)) {
                    compra.put(producto, cantidad);
                } else if (compra.containsKey(producto)) {
                    int antiguaCantidad = compra.get(producto);
                    compra.put(producto, cantidad + antiguaCantidad);
                }
            }
            System.out.println();
        } while (!producto.equals("fin"));

        // Solicitar código de descuento
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigoDescuento = System.console().readLine();

        // Imprimir ticket
        System.out.printf("%-10s %-6s %-8s %-8s%n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("---------------------------------");

        double total = 0;

        for (String prod : compra.keySet()) {
            double precio = productos.get(prod);
            int cantidad = compra.get(prod);
            double subtotal = precio * cantidad;
            total += subtotal;

            System.out.printf("%-10s %-6.2f %-8d %-8.2f%n", prod, precio, cantidad, subtotal);
        }

        System.out.println("---------------------------------");

        // Aplicar descuento si el código es válido
        double descuento = 0;
        if (codigoDescuento.equals("ECODTO")) {
            descuento = total * 0.10;
            System.out.printf("Descuento: %.2f%n", descuento);
            System.out.println("---------------------------------");
        }

        System.out.printf("TOTAL: %.2f%n", total - descuento);
    }
}