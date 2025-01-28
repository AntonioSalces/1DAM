/*
 * Realiza un programa equivalente al anterior pero en esta ocasión, 
 * el programa debe ordenar palabras en lugar de números.
 */

package ej4;

import java.util.ArrayList;
import java.util.Collections;

public class Ej4 {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<String>();
        final int MAX_NUMS = 10;
        System.out.println("Inserte 10 palabras: ");
        for (int i = 0; i < MAX_NUMS; i++) {
            numeros.add((System.console().readLine()));
        }
        System.out.println("Antes de ordenar:\n" + numeros);
        Collections.sort(numeros);
        System.out.println("Después de ordenar:\n" + numeros);
    }
}

