/*
 * Escribe un programa que ordene 10 números enteros introducidos 
 * por teclado y almacenados en un objeto de la clase ArrayList.
 */

package ej3;

import java.util.ArrayList;

import java.util.Collections;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        final int MAX_NUMS = 10;
        System.out.println("Inserte 10 números: ");
        for (int i = 0; i < MAX_NUMS; i++) {
            numeros.add(Integer.parseInt(System.console().readLine()));
        }
        System.out.println("Antes de ordenar:\n" + numeros);
        Collections.sort(numeros);
        System.out.println("Después de ordenar:\n" + numeros);
    }
}
