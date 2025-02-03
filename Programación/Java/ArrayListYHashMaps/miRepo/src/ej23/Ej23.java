/*
 * En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones, una torre 5 peones, 
 * un alfil 3, un caballo 2 y un péon vale, lógicamente, 1 peón. 
 * Realiza un programa que genere al azar las capturas que ha hecho un jugador durante una partida. 
 * El número de capturas será un valor aleatorio entre 0 y 15. 
 * Hay que tener en cuenta que cada jugador tiene la posibilidad de capturar algunas de las siguientes piezas (no más): 
 * 1 dama, 2 torres, 2 alfiles, 2 caballos y 8 peones. Al final debe aparecer la puntuación total.
 * Ejemplo:
 * Fichas capturadas por el jugador:
 * Alfil (3 peones)
 * Caballo (2 peones)
 * Peón (1 peones)
 * Torre (5 peones)
 * Peón (1 peones)
 * Puntos totales: 12 peones.
 */

package ej23;

import java.util.ArrayList;
import java.util.HashMap;

public class Ej23 {
    public static void main(String[] args) {
        HashMap<String, Integer> valor = new HashMap<>();
        valor.put("dama", 9);
        valor.put("torre", 5);
        valor.put("alfil", 3);
        valor.put("caballo", 2);
        valor.put("peon", 1);

        HashMap<String, Integer> comidas = new HashMap<>();
        comidas.put("dama", 0);
        comidas.put("torre", 0);
        comidas.put("alfil", 0);
        comidas.put("caballo", 0);
        comidas.put("peon", 0);

        for (int i = 0; i < (int) (Math.random()*15+1); i++) {
            ArrayList<Integer> sacadas = new ArrayList<>();
            int ficha = (int) (Math.random()*15+1);
            do {
                if (!sacadas.contains(ficha)) {
                    sacadas.add(ficha);
                } else {
                    ficha = -1;
                    break;
                }
                if (ficha == 1 && comidas.get("dama") <= 1) {
                    int antiguoValor = comidas.get("dama");
                    comidas.put("dama", antiguoValor + 1);
                } else if (ficha >= 2 && ficha <= 3 && comidas.get("torre") < 2) {
                    int antiguoValor = comidas.get("torre");
                    comidas.put("torre", antiguoValor + 1);
                } else if (ficha >= 4 && ficha <= 5 && comidas.get("alfil") < 2) {
                    int antiguoValor = comidas.get("alfil");
                    comidas.put("alfil", antiguoValor + 1);
                } else if (ficha >= 6 && ficha <= 7 && comidas.get("torre") < 2) {
                    int antiguoValor = comidas.get("caballo");
                    comidas.put("caballo", antiguoValor + 1);
                } else if (ficha >= 6 && ficha <= 7 && comidas.get("peon") < 8) {
                    int antiguoValor = comidas.get("peon");
                    comidas.put("peon", antiguoValor + 1);
                }
            } while (ficha == -1);
        }

        System.out.printf("""
                Fichas capturadas por el jugador:
                Total de fichas capturadas: %d
                %d %s (%d peones)
                %d %s (%d peones)
                %d %s (%d peones)
                %d %s (%d peones)
                %d %s (%d peones)
                Puntos totales: %d
                """, comidas.get("dama") + comidas.get("torre") + comidas.get("alfil") + comidas.get("caballo") + comidas.get("peon"),
                     comidas.get("dama"), "dama", valor.get("dama"),
                     comidas.get("torre"), "torre", valor.get("torre"),
                     comidas.get("alfil"), "alfil", valor.get("alfil"),
                     comidas.get("caballo"), "caballo", valor.get("caballo"),
                     comidas.get("peon"), "peon", valor.get("peon"),
                     valor.get("dama") * comidas.get("dama") + valor.get("torre") * comidas.get("torre") + valor.get("alfil") * comidas.get("alfil") + valor.get("caballo") * comidas.get("caballo") + valor.get("peon") * comidas.get("peon"));
    }
}
