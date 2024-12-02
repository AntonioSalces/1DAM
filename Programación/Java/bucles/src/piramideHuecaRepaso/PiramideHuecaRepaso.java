package piramideHuecaRepaso;

public class PiramideHuecaRepaso {
    public static void pintarPiramide(int altura, int division) {
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios iniciales
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir el borde izquierdo de la pirámide
            System.out.print("*");

            if (i == 1) {
                // Parte superior de la pirámide
                System.out.println();
            } else if (i == division) {
                // Imprimir fila de división (completa de asteriscos)
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("*");
                }
                System.out.print("*"); // Borde derecho
                System.out.println();
            } else {
                // Imprimir espacios internos en las filas intermedias
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*"); // Borde derecho
                System.out.println();
            }
        }
    }

    public static void PiramideHueca() {
        System.out.print("Introduzca la altura de la A: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la división: ");
        int division = Integer.parseInt(System.console().readLine());

        pintarPiramide(altura, division);
    }
}
