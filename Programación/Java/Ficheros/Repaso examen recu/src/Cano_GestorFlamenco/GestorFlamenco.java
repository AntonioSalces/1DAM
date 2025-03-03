package Cano_GestorFlamenco;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorFlamenco {
    private ArrayList<String> phrases;
    private FlamencoArchivo file;

    public GestorFlamenco(FlamencoArchivo file) {
        this.phrases = new ArrayList<>();
        this.file = file;
    }

    public void addPhrase(String phrase) {
        if (!phrases.contains(phrase)) {
            phrases.add(phrase);
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getFileName(), true));
            bw.write(phrase);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deletePhrase(String phrase) {
        if (phrases.contains(phrase)) {
            phrases.remove(phrase);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}