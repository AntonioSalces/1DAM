package ejPilotos;

import java.io.IOException;
import java.util.ArrayList;

public class Temporada {
    private ArrayList<Piloto> pilotos;
    private ArrayList<Carrera> carreras;

    public Temporada() throws IOException {
        pilotos = new ArrayList<>();
        cargarPilotos();
    }

    private void cargarPilotos() throws IOException {
        GestorPilotos gestor = new GestorPilotos();
        gestor.leerArchivo();
        this.pilotos = gestor.pilotos;
    }
}
