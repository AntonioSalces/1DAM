package ejPilotos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Carrera {
    ArrayList<Piloto> pilotos;

    public Carrera() {
        pilotos = new ArrayList<>();
    }

    public void agregarPiloto(Piloto p) throws PilotoYaExisteException {
        boolean esta = false;
        for (Piloto pi : pilotos) {
            if (pi.getNumero() == p.getNumero()) {
                esta = true;
            }
        }
        if (!esta) {
            pilotos.add(p);
        } else {
            throw new PilotoYaExisteException();
        }
    }

    public void simularCarrera() {
        ArrayList<Integer> posiciones = new ArrayList<>();
        HashSet<Integer> posicionesUsadas = new HashSet<>(); // Usamos un HashSet para evitar duplicados

        for (int i = 0; i < pilotos.size(); i++) {
            int posicion = (int) (Math.random() * pilotos.size());

            while (posicionesUsadas.contains(posicion)) {
                posicion = (int) (Math.random() * pilotos.size());
            }

            posicionesUsadas.add(posicion);
            posiciones.add(posicion);
        }

        int[] puntosPorPosicion = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1 }; // Puntos por puesto

        for (int i = 0; i < posiciones.size(); i++) {
            int posicion = posiciones.get(i);

            if (i < 10) {
                Piloto piloto = pilotos.get(posicion); // Obtiene el piloto en esa posición
                piloto.setPuntos(piloto.getPuntos() + puntosPorPosicion[i]);
            }
        }

        Collections.sort(pilotos);

        System.out.println("Podio:");
        for (int i = 0; i < 3 && i < pilotos.size(); i++) {
            System.out.println((i + 1) + "º lugar: " + pilotos.get(i).getNombre() 
            + " con " + pilotos.get(i).getPuntos() + " puntos.");
        }
    }

    public void guardarResultados(String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));

        for(int i = 0; i < pilotos.size(); i++) {
            Piloto piloto = pilotos.get(i);

            String linea = (i + 1) + ";" + piloto.getNombre() + ";" + piloto.getEquipo() + ";" + piloto.getPuntos();
            bw.write(linea);
            bw.newLine();
        }
        bw.close();
        System.out.println("Resultados guardados en " + nombreArchivo);
    }
}
