package ejPilotos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorPilotos {
    ArrayList<Piloto> pilotos;

    public GestorPilotos() {
        pilotos = new ArrayList<>();
    }

    public void leerArchivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("pilotos.txt"));
        String linea = "";

        while ((linea = br.readLine()) != null) {
            String partes[] = linea.split(";");

            if (partes.length == 5) {
                String nombre = partes[0];
                String equipo = partes[1];
                int numero = Integer.parseInt(partes[2]);
                String nacionalidad = partes[3];
                int puntos = Integer.parseInt(partes[4]);

                pilotos.add(new Piloto(nombre, equipo, numero, nacionalidad, puntos));
            }
        }
        br.close();
    }
}