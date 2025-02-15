package ejEventoDeportivo;

import java.io.IOException;
import java.util.Scanner;

public class EjEventoDeportivo {
    public static String menu() {
        return """
                1. Listar participantes.
                2. Buscar por ID.
                3. Registrar nuevo participante.
                4. Eliminar participante.
                5. Salir.
                """;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        GestorParticipantes gestor = new GestorParticipantes();
        gestor.cargarDatos();

        int opcion;
        do {
            System.out.println(menu());
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Introduce un número válido.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println(gestor.mostrarDatos());
                    break;

                case 2:
                    System.out.print("Introduce el ID: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Error: Introduce un número válido.");
                        sc.next();
                    }
                    int id = sc.nextInt();
                    sc.nextLine();
                    Participante encontrado = gestor.buscarPorId(id);
                    if (encontrado != null) {
                        System.out.println("Participante encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontró un participante con ese ID.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Error: Introduce un número válido.");
                        sc.next();
                    }
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Deporte: ");
                    String deporte = sc.nextLine();
                    System.out.print("Tiempo de registro: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Error: Introduce un número válido.");
                        sc.next();
                    }
                    double tiempo = sc.nextDouble();
                    sc.nextLine();

                    Participante nuevo = new Participante(Participante.getSiguienteId(), nombre, edad, deporte, tiempo);
                    Participante.setSiguienteId(nuevo.getId() + 1); // Asegurar ID único
                    gestor.aniadirParticipante(nuevo);
                    System.out.println("Participante registrado con éxito.");
                    break;

                case 4:
                    System.out.print("Introduce el ID: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Error: Introduce un número válido.");
                        sc.next();
                    }
                    int idEliminar = sc.nextInt();
                    gestor.eliminarParticipante(idEliminar);
                    System.out.println("Participante eliminado.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
