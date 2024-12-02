/*
Escribe un programa que permita ir introduciendo una serie 
supere el valor 10000. Cuando esto último ocurra, se debe mostrar el 
números introducidos y la media.
 */

package ej23;

public class Ej23 {
    public static void numerosHasta10000() {
        int numero = 0;
        int total = 0;
        int contador = 0;
        System.out.println("""
                Por favor, vaya introduciendo números.
                El programa terminará cuando la suma de los números sea mayor que 10000.
                """);
        while (total <= 10000) {
            numero = Integer.parseInt(System.console().readLine());
            contador++;
            total += numero;
        }
        System.err.println("Ha introducido un total de "+contador+" números");
        System.err.println("La suma total es de "+total);
        System.err.println("La media es de "+(double)total/contador);
    }


}
