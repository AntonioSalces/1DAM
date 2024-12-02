package clases;

import java.util.Scanner;

public class Ej3 {
    public static void diaSemana(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digame un número del 1 al 7: ");
        int dia = scanner.nextInt();
        if (dia >=1 && dia <=7){
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
            
                default:
                System.out.println("Número no válido");
                    break;
            }
        }
        scanner.close();
    }
}
