/*
 * Crea un ArrayList con los nombres de 6 compañeros de clase. 
 * A continuación, muestra esos nombres por pantalla.
 * Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ningún índice.
 */

package ej1;

import java.util.ArrayList;

public class ej1 {
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<String>();
        compañeros.add("Blanca");
        compañeros.add("Antonio");
        compañeros.add("Alberto");
        compañeros.add("Samu");
        compañeros.add("Cano");
        compañeros.add("Javi");
        for (String gente : compañeros) {
            System.out.println(gente);
        }
    }
}
