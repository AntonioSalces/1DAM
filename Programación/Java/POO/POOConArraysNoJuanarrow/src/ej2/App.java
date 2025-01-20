package ej2;

import ej2.clases.Biblioteca;
import ej2.clases.Libro;

public class App {
    private void menu(){
        System.out.print("""
                BIBLIOTECA
                ==========
                1. Añadir nuevo libro
                2. Listar libros
                3. Prestar libro
                4. Devolver libro
                5. Buscar por título
                6. Salir""");
    }

    private void anadirLibro(){
        System.out.println("AÑADIR LIBRO");
        System.out.println("============");
        System.out.print("Inserte el titulo del libro: ");
        String titulo = System.console().readLine();
        System.out.println();
        System.out.print("Inserte el autor del libro: ");
        String autor = System.console().readLine();
        System.out.println();
        System.out.print("Inserte el año de publicación: ");
        int anioPublicacion = Integer.parseInt(System.console().readLine());

        Libro libro = new Libro(titulo, autor, anioPublicacion);
    }

    private void listarBiblioteca(){
        System.out.println("MOSTRAR LIBROS BIBLIOTECA");
        System.out.println("=========================");
        biblioteca.mostrarLibros();
    }

    public Biblioteca biblioteca = new Biblioteca(10);

    public static void main(String[] args) {
        
    }
}
