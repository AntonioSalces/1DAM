/*
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer la respuesta) y que, además,sea capaz de aprender nuevas capitales.
 * En principio, el programa solo conoce las capitales de España,Portugal y Francia. Estos datos deberán estar almacenados en un diccionario. 
 * Los datos sobre capitales que vaya aprendiendo el programa se deben almacenar en el mismo diccionario. 
 * El usuario sale del programa escribiendo la palabra “salir”.
 * Ejemplo:
 * Escribe el nombre de un país y te diré su capital: España
 * La capital de España es Madrid
 * Escribe el nombre de un país y te diré su capital: Alemania
 * No conozco la respuesta ¿cuál es la capital de Alemania?: Berlín
 * Gracias por enseñarme nuevas capitales
 * Escribe el nombre de un país y te diré su capital: Portugal
 * La capital de Portugal es Lisboa
 * Escribe el nombre de un país y te diré su capital: Alemania
 * La capital de Alemania es Berlín
 * Escribe el nombre de un país y te diré su capital: Francia
 * La capital de Francia es París
 * Escribe el nombre de un país y te diré su capital: salir
 */

package ej16;

import java.util.HashMap;

public class Ej16 {
    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<String, String>();
        paises.put("España", "Madrid");
        paises.put("Portugal", "Lisboa");
        paises.put("Francia", "Paris");
        
        String palabra;
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            palabra = System.console().readLine();
            if (paises.containsKey(palabra)) {
                System.out.printf("La capital de %s es %s%n", palabra, paises.get(palabra));
            } else {
                System.out.printf("No conozco la respuesta ¿cuál es la capital de %s?: ", palabra);
                String capital = System.console().readLine();
                paises.put(palabra, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        } while (!palabra.equals("salir"));
    }
}
