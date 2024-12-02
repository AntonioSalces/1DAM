/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje 
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
 * Tendremos cuatro oportunidades para abrir la caja fuerte.

 */

package ej7;

public class Ej7 {
    public static void cajaFuerte() {
        int combinacion = 8888;
        int prueba = 0;
        int intentos = 0;

        do {
            System.err.print("Introduzca la clave de la caja fuerte: ");
            prueba = Integer.parseInt(System.console().readLine());
            if (intentos < 4) {
                if (prueba != combinacion) {
                    System.err.println("Clave incorrecta");
                } else {
                    System.err.println("Ha abierto la caja fuerte");
                }
                intentos++;
            } else {
                
            }
            
        } while (prueba != combinacion && intentos < 4);{
            System.err.println("Lo siento, ha agotado las 4 oportunidades");
        }
    }
}
