package ej13;

public class Ej13 {
    public static void enteroONegativo(){
        System.out.println("Por favor, instroduzca 10 números enteros: ");
        int i = 1;
        int num = 0;
        int numPositivo = 0;
        int numeroNegativo = 0;
        for (i = 0; i <= 9; i++){
            num = Integer.parseInt(System.console().readLine());
            if (num >= 0) {
                numPositivo++;                
            } else
                numeroNegativo++;
            }
            System.out.printf("Ha introducido %d números positivos y %d números negativos.", numPositivo, numeroNegativo);
        }
    }
