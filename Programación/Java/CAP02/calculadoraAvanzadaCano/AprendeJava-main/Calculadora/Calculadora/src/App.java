import java.util.Scanner;

import matematicas.operaciones.Calculadora;

public class App {
    
    public static void main(String[] args) throws Exception {
        while (true) {
            Calculadora.pedirDatos(); // Llamamos al método para solicitar datos al usuario

            // Preguntar si el usuario quiere continuar o salir
            Scanner sc= new Scanner(System.in);
            System.out.print("¿Quieres realizar otra operación? (sí/no): ");
            String continuar = sc.next();

            if (!continuar.equalsIgnoreCase("sí")) {
                System.out.println("Gracias por usar la calculadora.");
                break; // Salimos del bucle
            }
            sc.close();
        }
    }
}

