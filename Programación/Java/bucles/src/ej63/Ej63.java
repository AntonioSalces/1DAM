package ej63;

public class Ej63 {
    public static void pintarPiramide(int i, int altura){
        if (i>=1){
            for (int j = 1; j <= altura-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 1; j <= i-1; j++){
                System.out.print("*");
            }

            for (int j = 1; j <= altura-i; j++)
            System.out.print(" ");
        } else {
            for (int j = 1; j <= 2*altura-1; j++){
                System.out.print(" ");
            }
        }
    }

    public static void dosPiramides(){
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int altura1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int altura2 = Integer.parseInt(System.console().readLine());
        int diferenciaPiramides = (int)Math.abs(altura1-altura2);
        int valorMax = (int)Math.max(altura1, altura2);
        for(int i = 1; i <= valorMax; i++){
            if (altura1>=altura2){
                pintarPiramide(i, altura1);
                System.out.print("   ");
                pintarPiramide(i-diferenciaPiramides, altura2);
            }else{
                pintarPiramide(i-diferenciaPiramides, altura1);
                System.out.print("   ");
                pintarPiramide(i, altura2);
            }
            System.out.println();
        }
        
    }
}
