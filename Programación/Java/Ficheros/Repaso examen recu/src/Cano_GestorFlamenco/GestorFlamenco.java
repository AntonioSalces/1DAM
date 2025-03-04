package Cano_GestorFlamenco;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorFlamenco {
    private ArrayList<String> phrases;
    private FlamencoArchivo file;
    private HashMap<Integer, String> uniquePhrases;
    private int numPhrase;

    public GestorFlamenco(FlamencoArchivo file) {
        this.phrases = new ArrayList<>();
        this.file = file;
        this.uniquePhrases = new HashMap<>();
        this.numPhrase = 1;
    }

    public FlamencoArchivo getFile() {
        return file;
    }

    public void addPhrase(String phrase) {
        if (!phrases.contains(phrase)) {
            phrases.add(phrase);
        }
        if(!uniquePhrases.containsValue(phrase)) {
            uniquePhrases.put(numPhrase++, phrase);
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getFileName(), true));
            bw.write(phrase);
            bw.newLine();
            bw.close();

            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file.getFileName() + ".dat", true));
            bw2.write((numPhrase - 1)+ ";" + phrase);
            bw2.newLine();
            bw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deletePhrase(String phrase) {
        if (phrases.contains(phrase)) {
            phrases.remove(phrase);
        }

        Integer key = null;
        for (var entry : uniquePhrases.entrySet()) {
            if (entry.getValue().equals(phrase)){
                key = entry.getKey();
                break;
            }
        }
        if (key != null) {
            uniquePhrases.remove(key);
        }
        rewriteFile();
    }

    private void rewriteFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getFileName()));
            for(String phrase : phrases) {
                bw.write(phrase);
                bw.newLine();
            }
            bw.close();

            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file.getFileName() + ".dat"));
            for(var entry : uniquePhrases.entrySet()) {
                bw2.write(entry.getKey() + ";" + entry.getValue());
                bw2.newLine();
            }
            bw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}