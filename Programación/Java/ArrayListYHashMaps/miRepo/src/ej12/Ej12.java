/*
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos según el juego de la brisca. 
 * El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). 
 * La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta. 
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.
 * Ejemplo:
 * as de oros
 * cinco de bastos
 * caballo de espadas
 * sota de copas
 * tres de oros
 * Tienes 26 puntos
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ej12 {
    public static void main(String[] args) {
        HashMap<String, Integer> valores = new HashMap<String, Integer>();
        valores.put("as", 11);
        valores.put("2", 0);
        valores.put("3", 10);
        valores.put("4", 0);
        valores.put("5", 0);
        valores.put("6", 0);
        valores.put("7", 0);
        valores.put("sota", 2);
        valores.put("caballo", 3);
        valores.put("rey", 4);

        ArrayList<Carta> cartas = new ArrayList<Carta>();
        for (int i = 1; i <= 40; i++) {
            cartas.add(new Carta(i));
        }
        Collections.shuffle(cartas);

        int totalPuntos = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(cartas.get(i));
            String numero = cartas.get(i).getNumero();
            totalPuntos += valores.get(numero);
        }
        System.out.printf("Tienes %d puntos", totalPuntos);
        
        
    }
}