package ejEventoDeportivo;

import java.io.*;
import java.util.HashMap;

public class GestorParticipantes {
    protected HashMap<Integer, Participante> participantes;
    private final String NOMBREARCHIVO = "participantes.txt";

    public GestorParticipantes() {
        participantes = new HashMap<>();
    }

    public void cargarDatos() throws IOException {
        File file = new File(NOMBREARCHIVO);
        if (!file.exists()) {
            return;
        }

        participantes.clear();
        int maxId = 100;  // Para asegurar que siguienteId sea correcto

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    int edad = Integer.parseInt(partes[2]);
                    String deporte = partes[3];
                    double tiempo = Double.parseDouble(partes[4]);

                    Participante p = new Participante(id, nombre, edad, deporte, tiempo);
                    participantes.put(id, p);

                    // Mantener el ID más alto visto
                    if (id > maxId) {
                        maxId = id;
                    }
                }
            }
        }

        // Actualizar siguienteId para evitar repeticiones
        Participante.setSiguienteId(maxId + 1);
    }

    public String mostrarDatos() {
        if (participantes.isEmpty()) {
            return "No hay participantes registrados.";
        }

        StringBuilder sb = new StringBuilder();
        for (Participante p : participantes.values()) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    public Participante buscarPorId(int id) {
        return participantes.get(id);
    }

    public void aniadirParticipante(Participante p) throws IOException {
        participantes.put(p.getId(), p);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBREARCHIVO, true))) {
            bw.write(p.toString());
            bw.newLine();
        }
    }

    public void eliminarParticipante(int id) throws IOException {
        if (participantes.remove(id) == null) {
            System.out.println("El participante no existe.");
            return;
        }
        guardarEnArchivo();
    }

    private void guardarEnArchivo() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBREARCHIVO))) {
            for (Participante p : participantes.values()) {
                bw.write(p.toString());
                bw.newLine();
            }
        }
    }
}
