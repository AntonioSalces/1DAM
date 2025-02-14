package ejCoches;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoCoches {
    public static void escribirCochesEnArchivo(ArrayList<Coche> coches) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("coches.txt"));
        for (Coche c : coches){
            String linea = c.getId() + "," + c.getMarca() + "," + c.getModelo() + "," + c.getAnio() + "," + c.getPrecio();
            bw.write(linea  + "\n");
        }
        bw.close();
    }

    public static ArrayList<Coche> leerCocheDesdeArchivo() throws FileNotFoundException, IOException {
        ArrayList<Coche> coches = new ArrayList<>();
        File archivo = new File("coches.txt");

        if(!archivo.exists()) {
            return coches;
        }

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String partes[] = linea.split(",");

            if (partes.length == 5) {
                int id = Integer.parseInt(partes[0]);
                String marca = partes[1];
                String modelo = partes[2];
                int anio = Integer.parseInt(partes[3]);
                double precio = Double.parseDouble(partes[4]);

                coches.add(new Coche(id, marca, modelo, anio, precio));
            }
        }
        br.close();
        return coches;
    }
}
