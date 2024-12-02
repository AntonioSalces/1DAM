package piramideRellenaRepaso;

public class PiramideRellenaRepaso {
    public static void pintarPiramide(int altura){
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= altura-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void piramideRellena(){
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        pintarPiramide(altura);
    }
}
