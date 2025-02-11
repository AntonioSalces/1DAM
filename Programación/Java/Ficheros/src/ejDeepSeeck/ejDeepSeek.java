package ejDeepSeeck;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ejDeepSeek {
    public static void main(String[] args) {
        String nombreFicheroSalida = "holamundo_sorted.txt";

        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("holaMundo.txt"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
