package ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ej1 {
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(file);
            for (int i = 0; i < 500; i++) {
                if (esPrimo(i)) {
                    file.write(i + "\n");
                }
            }        
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
