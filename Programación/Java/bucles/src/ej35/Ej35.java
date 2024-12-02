package ej35;

public class Ej35 {
    public static void x() {
        System.out.print("Por favor, introduzca la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());
        int contador = altura/2+1;
        for (int i = 1; i <= altura; i++){
            System.out.print("*");
            for (int j = 1; i<=altura-contador; j++){
                System.out.println(" ");
            }
            for (int j = 1; j<=contador; j++){
                System.err.print(" ");
            }
            System.out.println("*");
            if (i < altura/2+1) {
                contador--;
            }else{
                contador++;
            }

        }
    }
}