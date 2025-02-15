package ejTiendaLibros;

import java.io.IOException;

public class EjTiendaLibros {
    public static void main(String[] args) throws IOException {
        TiendaLibros tl = new TiendaLibros();

        int opcion = 0;
        do {
            System.out.println("1. Añadir libro al array");
            System.out.println("2. Añadir libros del array al fichero");
            System.out.println("3. Leer fichero y cargar los libros");
            System.out.println("4. Mostrar libros cargados en pantalla");
            System.out.println("5. Borrar fichero");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.print("Indica el titulo del libro: ");
                    String titulo = System.console().readLine();
                    System.out.print("\n Indica el autor del libro: ");
                    String autor = System.console().readLine();
                    System.out.print("\n Indica el precio del libro: ");
                    int precio = Integer.parseInt(System.console().readLine());
                    tl.addLibro(new Libro(titulo, autor, precio));
                    break;

                case 2:
                    tl.guardarLibro();
                    break;

                case 3:
                    tl.cargarLibros();
                    break;

                case 4:
                    System.out.println(tl.mostrarLibros());
            
                default:
                    break;
            }
        } while (opcion != 6);
    }
}
