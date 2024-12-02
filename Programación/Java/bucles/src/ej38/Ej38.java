package ej38;

public class Ej38 {
    public static void relojArena() {
        System.out.print("Por favor, introduzca la altura del reloj de arena (debe ser impar): ");
        int altura = Integer.parseInt(System.console().readLine());

        // Verificar que la altura sea un número impar
        if (altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar.");
            return;
        }

        // Parte superior del reloj de arena
        for (int i = 0; i < altura / 2 + 1; i++) {
            // Imprimir los espacios de la izquierda
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int k = 0; k < altura - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del reloj de arena
        for (int i = altura / 2 - 1; i >= 0; i--) {
            // Imprimir los espacios de la izquierda
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int k = 0; k < altura - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
