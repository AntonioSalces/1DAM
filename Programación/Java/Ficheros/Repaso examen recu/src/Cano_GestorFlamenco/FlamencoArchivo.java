package Cano_GestorFlamenco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FlamencoArchivo {
    private String fileName;

    public FlamencoArchivo(String nombreArchivo) {
        this.fileName = nombreArchivo;
        createFile();
    }

    public String getFileName() {
        return fileName;
    }

    public File createFile() {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public void writeFile(String name, String phrase) {
        createFile();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(name, true));
            bw.write(phrase);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> readFile(String name) {
        ArrayList<String> phrases = new ArrayList<>();
        String linea = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            while ((linea = br.readLine()) != null) {
                phrases.add(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return phrases;
    }

    public void deleteFile(String name) {
        File file = new File(name);
        if (file.exists()) {
            file.delete();
        }
    }
}