package clases;

import java.util.Scanner;

public class Ej9 {
    public static void calcularEcuacion() {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Introduce el valor a 'a':");
        int a = scanner.nextInt();
        System.err.println("Introduce el valor de 'b':");
        int b = scanner.nextInt();
        System.err.println("Introduce el valor de 'c':");
        int c = scanner.nextInt();
        double x1 = 0;
        double x2 = 0;

        if (a==0 && b == 0 && c == 0){
            System.err.println("La ecuación tiene infinitas soluciones");
        } else if (a == 0 && b == 0){
            System.err.println("La ecuación no tiene soluciíon");
        } else {
            x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        }

        System.err.println("x1 = " + x1);
        System.err.println("x2 = " + x2);

        

        scanner.close();
    }
}
