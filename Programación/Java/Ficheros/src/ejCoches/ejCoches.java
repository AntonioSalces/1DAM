package ejCoches;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ejCoches {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        GestorCoches gestor = new GestorCoches();
        int opcion;

        do {
            System.out.println("\n--- MENÚ GESTOR DE COCHES ---");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche por ID");
            System.out.println("4. Eliminar coche");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    Coche nuevoCoche = new Coche(id, marca, modelo, anio, precio);
                    if (gestor.aniadirCoche(nuevoCoche)) {
                        System.out.println("Coche añadido correctamente.");
                    } else {
                        System.out.println("El ID ya existe");
                    }
                    break;
            
                case 2:
                    System.out.println("\n--- LISTADO DE COCHES ---");
                    System.out.println(gestor.listarCoches());
                    break;

                case 3:
                    System.out.print("Ingrese el ID del coche a buscar: ");
                    int buscarId = sc.nextInt();
                    try {
                        Coche encontrado = gestor.buscarPorID(buscarId);
                        System.out.println("Coche encontrado: " + encontrado);
                    } catch (CocheNotExistException e) {
                        System.out.println("Error: No se encontró un coche con ese ID.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el ID del coche a eliminar: ");
                    int eliminarId = sc.nextInt();
                    try {
                        if (gestor.eliminarCoche(eliminarId)) {
                            System.out.println("Coche eliminado correctamente.");
                        }
                    } catch (CocheNotExistException e) {
                        System.out.println("Error: No se encontró un coche con ese ID.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");

            }
        } while (opcion != 5);
        sc.close();
    }
}
