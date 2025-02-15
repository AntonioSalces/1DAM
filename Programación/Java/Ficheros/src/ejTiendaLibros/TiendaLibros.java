package ejTiendaLibros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TiendaLibros {
    private ArrayList<Libro> librosArray;
    private HashMap<Integer, Libro> librosMap;
    private int siguienteID = 1;

    public TiendaLibros() {
        librosArray = new ArrayList<>();
        librosMap = new HashMap<>();
    }

    public Libro addLibro(Libro l) {
        if (l == null) {
            throw new IllegalArgumentException("El libro no puede ser null");
        }

        librosArray.add(l);
        librosMap.put(siguienteID++, l);
        return l;
    }

    public String mostrarLibros() {
        String libros = "";

        for(Libro l : librosArray) {
            libros +=  l.toString();
        }

        return libros;
    }

    public void guardarLibro() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("libros.txt", false));

        for(Libro l : librosArray) {
            bw.write(siguienteID++ + "," + l.getTitulo() + "," + l.getAutor() + "," + l.getPrecio() + "\n");
        }

        bw.close();
    }

    public void cargarLibros() throws FileNotFoundException, IOException {
        int ultimoId = 0;
        BufferedReader br = new BufferedReader(new FileReader("libros.txt"));
        String linea = "";

        while ((linea = br.readLine()) != null) {
            String partes[] = linea.split(",");

            if (partes.length == 4) {
                int id = Integer.parseInt(partes[0]);
                String libro = partes[1];
                String autor = partes[2];
                double precio = Double.parseDouble(partes[3]);

                Libro nuevoLibro = new Libro(libro, autor, precio);

                if (!librosArray.contains(nuevoLibro)) {
                    librosArray.add(new Libro(libro, autor, precio));
                }

                if (!librosMap.containsValue(nuevoLibro)) {
                    librosMap.put(id, nuevoLibro);
                }

                if (id > ultimoId) {
                    ultimoId = id;
                }
            }
        }
        br.close();
        siguienteID = ultimoId + 1;
    }

}
