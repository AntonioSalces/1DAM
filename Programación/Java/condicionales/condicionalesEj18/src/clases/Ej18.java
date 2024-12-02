package clases;

import java.util.Scanner;

public class Ej18 {
    public static void primeraCifra() {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Escribe un número y te diré la primera cifra: ");
        int num = scanner.nextInt();
        while (num >= 10) {
            num = num/10;
        }
        System.err.println("La primera cifra es " + num);
        scanner.close();
    }
}
