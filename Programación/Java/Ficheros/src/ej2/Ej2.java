package ej2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) {
        try {
            File file = new File("primos.dat");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea = "";
            try {
                while ((linea=br.readLine()) != null) {
                    System.out.println(linea);
                }
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
