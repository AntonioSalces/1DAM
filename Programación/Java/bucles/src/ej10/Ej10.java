package ej10;

public class Ej10 {
    public static void mediaPositivos (){
        System.out.println("Este programa calcula la media de los números positivos introducidos. %n Para parar, introduza un número negativo. %n Vaya introduciendo números");
        double num = 0;
        short i = 0;
        double aux = 0;
        while (num >= 0) {
            num = Long.parseLong(System.console().readLine());
            i++;
            aux += num;
        }
        aux-=num;
        i-=1;
        System.err.printf("La media de los números positivos introducidos es de %f", aux/i);
    }
}
