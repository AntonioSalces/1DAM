package ej12;

public class Ej12 {
    public static void fibonacci() {
        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
        System.out.print("Por favor, introduzca n: ");
        short numeros = Short.parseShort(System.console().readLine());
        
        if (numeros <= 0) {
            System.out.println("Por favor, introduzca un número positivo.");
            return;
        }

        System.out.print("0");

        if (numeros > 1) {
            System.out.print(" 1");
        }

        int anterior = 0;
        int actual = 1;

        for (int i = 2; i < numeros; i++) {
            int siguiente = anterior + actual;
            System.out.print(" " + siguiente);
            anterior = actual;
            actual = siguiente;
        }
        
        System.out.println(); // Salto de línea al final
    }
}
