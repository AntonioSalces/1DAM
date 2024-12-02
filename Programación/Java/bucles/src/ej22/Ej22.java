/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package ej22;

public class Ej22 {
    public static boolean esPrimo (int numero){
        if (numero <= 1) { // Los números menores o iguales a 1 no son primos
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // Verificamos divisores hasta la raíz cuadrada de 'numero'
            if (numero % i == 0) {
                return false; // Si tiene un divisor distinto de 1 y de sí mismo, no es primo
            }
        }
        return true; // Es primo si no tiene divisores
    }

    public static void numerosPrimos() {
        System.out.println("Números primos entre 2 y 100");
        for (int i = 2; i <= 100; i++){
            if (esPrimo(i)){
                System.out.println(i+" ");
            }
        }
    }
}   
