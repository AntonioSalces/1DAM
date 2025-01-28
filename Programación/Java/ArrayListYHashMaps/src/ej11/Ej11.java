package ej11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej11 {
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

        List<Map.Entry<String, String>> aleatorias = new ArrayList<>(diccionario.entrySet());
        Collections.shuffle(aleatorias);
        int aciertos = 0;
        int fallos = 0;

        for (int i = 0; i < 5; i++) {
            String clave = aleatorias.get(i).getKey();
            String valorCorrecto = aleatorias.get(i).getValue();

            System.out.printf("¿Cual es la traducción de \"%s\"?: ", clave);
            String traduccion = System.console().readLine().toLowerCase();
            if (traduccion.equals(valorCorrecto.toLowerCase())) {
                aciertos++;
            }else {
                fallos++;
            }
        }
        System.out.printf("Total de aciertos: %d%nTotal de fallos: %d", aciertos, fallos);           
    }
}
