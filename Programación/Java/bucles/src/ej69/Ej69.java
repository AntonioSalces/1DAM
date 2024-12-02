package ej69;

public class Ej69 {
    public static void piramideMaya(){
        System.err.print("Introduzca la altura de la pirámide maya: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= altura-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            if(i%2==0){
                System.out.print("    ");
            }else{
                System.out.print("****");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
