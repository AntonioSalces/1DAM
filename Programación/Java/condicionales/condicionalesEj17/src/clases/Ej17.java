package clases;

import java.util.Scanner;

public class Ej17 {
    public static void ultimaCifra() {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Dime un número y te diré su última cifra: ");
        int num = scanner.nextInt();
        int resto = num % 10;
        System.err.println("El último número de la cifra es " + resto);
        scanner.close();
    }
}
