/*
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción). 
 * Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. 
 * El programa pedirá una palabra en español y dará la correspondiente traducción en inglés.
 */

package ej10;

import java.util.HashMap;
import java.util.Set;

public class Ej10 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("sobremesa", "Afterglow");
        diccionario.put("madrugar", "Early-rising");
        diccionario.put("estrenar", "Debut");
        diccionario.put("merienda", "Snack");
        diccionario.put("tocayo", "Namesake");
        diccionario.put("empalagar", "Overwhelm");
        diccionario.put("friolero", "Cold-sensitive");
        diccionario.put("antojo", "Craving");
        diccionario.put("malagueño", "Malagan");
        diccionario.put("desvelado", "Sleepless");
        diccionario.put("desconocido", "Stranger");
        diccionario.put("atardecer", "Dusk");
        diccionario.put("estrépito", "Clamor");
        diccionario.put("aguacero", "Downpour");
        diccionario.put("añoranza", "Nostalgia");
        diccionario.put("paripé", "Facade");
        diccionario.put("chiringuito", "Beach-bar");
        diccionario.put("cachondeo", "Mischief");
        diccionario.put("manutención", "Allowance");
        diccionario.put("desgraciado", "Wretch");
        diccionario.put("chapuza", "Botch");
        diccionario.put("malpensado", "Suspicious");
        diccionario.put("trasnochar", "Overnight");
        diccionario.put("relamer", "Lick");
        diccionario.put("compadrear", "Schmooze");
        diccionario.put("madrugada", "Dawn");
        diccionario.put("alhaja", "Gem");
        diccionario.put("fisgón", "Snoop");
        diccionario.put("desparpajo", "Confidence");
        diccionario.put("morriña", "Homesickness");

        int opcion;
        do {
            System.out.printf("¿Qué quiere hacer?%n1.Traducir%n2.Salir%n");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.println();
                    Set<String> palabrasEspañol = diccionario.keySet();
                    System.out.print("Las palabras disponibles para traducir son las siguientes: " + palabrasEspañol + "\n¿Cuál quiere traducir?: ");
                    String palabra = System.console().readLine().toLowerCase();
                    if (diccionario.get(palabra) != null) {
                        System.out.println("La traducción de " + palabra.toLowerCase() + " es \"" + diccionario.get(palabra).toLowerCase() + "\"\n");
                    }else {
                        System.out.println("La palabra no existe\n");
                    }
                    break;
            
                default:
                    break;
            }
        } while (opcion != 2);
    }
}
