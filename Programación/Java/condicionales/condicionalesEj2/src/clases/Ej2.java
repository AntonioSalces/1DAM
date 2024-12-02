package clases;

import java.util.Scanner;

public class Ej2 {
    static Scanner scanner = new Scanner(System.in);
    public static void saludoIf() {
        
        System.out.println("Dime una hora del día: (if)");
        int hora = scanner.nextInt();
        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }

    public static void saludoSwitch() {
        System.out.println("Dime una hora del día: (switch)");
        int hora = scanner.nextInt();
        switch (hora) {
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Buenos días");
                break;

            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("Buenas tardes");
                break;

            case 21, 22, 23, 1, 2, 3, 4, 5:
                System.out.println("Buenas noches");
                break;
        
            default:
                System.out.println("Hora equivocada");
                break;
        }
    }
}
