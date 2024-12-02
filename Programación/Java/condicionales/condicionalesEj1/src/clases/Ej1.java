package clases;

import java.util.Scanner;

public class Ej1 {
    public static void primeraAsignatura() {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Escribe un día de la semana y te diré que tenemos a primera hora: ");
        String dia = scanner.nextLine();

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("Programación");                
                break;

            case "martes":
                System.out.println("IPE I");
                break;
        
            case "miercoles":
                System.out.println("Programación");
                break;

            case "jueves":
                System.out.println("Lenguaje de marcas");
                break;

            case "viernes":
                System.out.println("Lenguaje de marcas");
                break;

            default:
                System.out.println("Día equivocado");
        }

        scanner.close();
    }
}
