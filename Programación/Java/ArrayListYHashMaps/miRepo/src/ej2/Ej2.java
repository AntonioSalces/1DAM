/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
 * El tamaño de la lista también será aleatorio podrá oscilar entre 10 y 20 elementos ambos inclusive.
 */

package ej2;

import java.util.ArrayList;

public class Ej2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        final int MIN_ELEMENTS = 10;
        final int MAX_ELEMENTS = 20;
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 100;
        final int NUM_ELEMENTS = (int)(Math.random()*(MAX_ELEMENTS - MIN_ELEMENTS + 1) + MIN_ELEMENTS);
        int suma = 0;
        int max = 0;
        int min = 100;

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int value = (int)(Math.random()*(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
            numeros.add(value);
            suma += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.printf("Suma: %d %nMedia: %.2f %nMáximo: %d %nMínimo: %d", suma, (float)suma/NUM_ELEMENTS, max, min);
    }
}
