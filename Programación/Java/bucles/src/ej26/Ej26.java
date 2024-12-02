/*
Realiza un programa que pida primero un número y a continuación un 
la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.
 */

package ej26;

import java.util.Scanner;
    
public class Ej26 {
    public static void Posiciones() {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca un número entero
        System.out.print("Introduzca un número entero: ");
        String numero = scanner.nextLine(); // Leemos el número como cadena para manipularlo más fácilmente
        
        // Pedimos al usuario que introduzca un dígito
        System.out.print("Introduzca un dígito: ");
        char digito = scanner.next().charAt(0); // Leemos el dígito como carácter
        
        // Variable para almacenar las posiciones en las que aparece el dígito
        String posiciones = "";
        
        // Recorremos cada carácter del número
        for (int i = 0; i < numero.length(); i++) {
            // Si el carácter en la posición actual es igual al dígito ingresado
            if (numero.charAt(i) == digito) {
                // Sumamos 1 a i para obtener la posición contando desde 1, no desde 0
                posiciones += (i + 1) + " ";
            }
        }
        
        // Comprobamos si se encontraron posiciones
        if (!posiciones.isEmpty()) {
            System.out.println("Contando de izquierda a derecha, el " + digito + 
                               " aparece dentro de " + numero + " en las siguientes posiciones: " + posiciones.trim());
        } else {
            System.out.println("El dígito " + digito + " no aparece en el número " + numero);
        }
        
        // Cerramos el objeto Scanner
        scanner.close();
    }
}
