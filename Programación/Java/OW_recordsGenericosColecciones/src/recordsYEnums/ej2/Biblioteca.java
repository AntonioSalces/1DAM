package recordsYEnums.ej2;

import java.util.Arrays;

public class Biblioteca {
    private Libro[] libros;
    private int total;

    public Biblioteca() {
        libros = new Libro[10];
        total = 0;
    }

    public Biblioteca(int tamanio) {
        libros = new Libro[tamanio];
        total = 0;
    }

    public Biblioteca(Libro[] l) {
        libros = l.clone();
        total = l.length;
    }

    public void mostrarLibros() {
        System.out.println("LIRBOS");
        System.out.println("======");
        for (int i = 0; i < total; i++) {
            System.out.println(libros[i]);
        }
        System.out.println();
    }

    public void aniadirLibro(Libro l) {
        if (total >= libros.length) {
            libros = Arrays.copyOf(libros, 10);
        }

        libros[total++] = l;
    }

    public void buscarPorGenero (Genero g) {
        System.out.printf("Libros de %s%n", g);
        System.out.println("================");
        for (int i = 0; i < total; i++) {
            if (libros[i].genero().equals(g)) {
                System.out.println(libros[i]);
            }
        }
        System.out.println();
    }
}
