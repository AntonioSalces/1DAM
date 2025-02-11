package ej3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader("src/holaMundo.txt");
            FileReader file2 = new FileReader("src/primos.dat");
            FileWriter file = new FileWriter("result.txt");
            BufferedReader br1 = new BufferedReader(file1);
            BufferedReader br2 = new BufferedReader(file2);
            BufferedWriter bw = new BufferedWriter(file);
            String line1 = br1.readLine();
            String line2 = br2.readLine();
            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    bw.write(line1 + "\n");
                    line1= br1.readLine();
                }
                if (line2 != null) {
                    bw.write(line2 + "\n");
                    line2 = br2.readLine();
                }
            }
            br1.close();
            br2.close();
            bw.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
