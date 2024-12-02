package clases;

import java.util.Scanner;

public class Ej6 {
    public static void calcularAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la altura desde la que cae un objeto: ");
        double h = scanner.nextInt();
        final double g = 9.81;
        double t = 0;
        if (h > 0){
            t = Math.sqrt((2*h)/g);
            System.out.println(t);
        } else {
            System.out.println("El número es menor a 0");
        }
        scanner.close();
    }
}
