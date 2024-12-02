package clases;

import java.util.Scanner;

public class Ej11 {
    public static void calcularHora() {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Introduce la hora del día: ");
        int hora = scanner.nextInt();
        System.err.println("Introduce el minuto del día");
        int minuto = scanner.nextInt();
        int minutosDia = 86400;
        hora = hora*3600;
        minuto = minuto*60;
        minutosDia = minutosDia - hora - minuto;
        System.err.println(minutosDia);
        scanner.close();
    }
        
}
