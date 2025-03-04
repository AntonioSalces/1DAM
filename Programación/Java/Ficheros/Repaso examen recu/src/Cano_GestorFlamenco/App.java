package Cano_GestorFlamenco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static void menu() {
        System.out.println("\nGESTOR FLAMENCO");
        System.out.println("====================");
        System.out.println("1. Crear nuevo archivo");
        System.out.println("2. Seleccionar archivo");
        System.out.println("3. Añadir frase al archivo seleccionado");
        System.out.println("4. Leer contenido del archivo seleccionado");
        System.out.println("5. Leer archivo numerado (.dat)");
        System.out.println("6. Borrar archivo");
        System.out.println("7. Mostrar archivos disponibles");
        System.out.println("8. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, GestorFlamenco> archivos = new HashMap<>();
        String archivoActual = null;

        int opcion;
        do {
            menu();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: // Crear archivo
                    System.out.print("Introduce el nombre del archivo: ");
                    String fileName = scanner.nextLine();
                    if (archivos.containsKey(fileName)) {
                        System.out.println("El archivo ya existe.");
                    } else {
                        FlamencoArchivo archivo = new FlamencoArchivo(fileName);
                        archivos.put(fileName, new GestorFlamenco(archivo));
                        archivoActual = fileName;
                        System.out.println("Archivo '" + fileName + "' creado y seleccionado.");
                    }
                    break;

                case 2: // Seleccionar archivo existente
                    if (archivos.isEmpty()) {
                        System.out.println("No hay archivos creados.");
                        break;
                    }
                    System.out.print("Introduce el nombre del archivo a seleccionar: ");
                    String selectFile = scanner.nextLine();
                    if (archivos.containsKey(selectFile)) {
                        archivoActual = selectFile;
                        System.out.println("Archivo '" + archivoActual + "' seleccionado.");
                    } else {
                        System.out.println("El archivo no existe.");
                    }
                    break;

                case 3: // Añadir frase
                    if (archivoActual == null) {
                        System.out.println("Primero debes seleccionar un archivo.");
                        break;
                    }
                    System.out.print("Introduce la frase a añadir: ");
                    String frase = scanner.nextLine();
                    archivos.get(archivoActual).addPhrase(frase);
                    System.out.println("Frase añadida a '" + archivoActual + "'.");
                    break;

                case 4: // Leer contenido del archivo principal
                    if (archivoActual == null) {
                        System.out.println("Primero debes seleccionar un archivo.");
                        break;
                    }
                    ArrayList<String> frases = archivos.get(archivoActual).getFile().readFile(archivoActual);
                    if (frases.isEmpty()) {
                        System.out.println("El archivo está vacío.");
                    } else {
                        System.out.println("Contenido de '" + archivoActual + "':");
                        for (String f : frases) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 5: // Leer archivo numerado .dat
                    if (archivoActual == null) {
                        System.out.println("Primero debes seleccionar un archivo.");
                        break;
                    }
                    ArrayList<String> frasesDat = archivos.get(archivoActual).getFile().readFile(archivoActual + ".dat");
                    if (frasesDat.isEmpty()) {
                        System.out.println("El archivo .dat está vacío.");
                    } else {
                        System.out.println("Contenido de '" + archivoActual + ".dat':");
                        for (String f : frasesDat) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 6: // Borrar archivo
                    if (archivoActual == null) {
                        System.out.println("Primero debes seleccionar un archivo.");
                        break;
                    }
                    archivos.get(archivoActual).getFile().deleteFile(archivoActual);
                    archivos.get(archivoActual).getFile().deleteFile(archivoActual + ".dat");
                    archivos.remove(archivoActual);
                    System.out.println("Archivo '" + archivoActual + "' eliminado.");
                    archivoActual = null;
                    break;

                case 7: // Mostrar archivos disponibles
                    if (archivos.isEmpty()) {
                        System.out.println("No hay archivos creados.");
                    } else {
                        System.out.println("Archivos disponibles:");
                        for (String name : archivos.keySet()) {
                            System.out.println("- " + name);
                        }
                    }
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
}
