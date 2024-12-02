package ej31;

public class Ej31 {
    public static void l() {
        System.out.print("Indica la altura de la L: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < altura-1; i++){
            System.out.println("*");
        }
        for (int i = 0; i < altura/2+1; i++){
            System.out.print("* ");
        }
    }
}
