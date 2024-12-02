package ej35;

public class Ej35v2 {
    public static void x() {
        System.out.print("Por favor, introduzca la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());
        int contador = altura;
        for (int i = 1; i <= altura*2-1; i++){
            for (int j = 1; j<=altura-contador; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j<=2*contador-3;j++){
                System.out.print(" ");
            }
            if (contador ==1)
            System.out.print("*");
            if (i < altura) {
                contador--;
            }else{
                contador++;
            }
            System.out.println("");
        }
    }
}