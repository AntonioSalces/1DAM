package ej40;

public class Ej40 {
    public static void rombo() {
        int contador = 1;
        int altura = 7;
        for (int i = 1; i<=altura; i++){
            for (int j = 1; j<=(altura/2+1)-contador; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j<=2*contador-3; j++){
                System.out.print(" ");
            }
                if(contador != 1){
                    System.out.println("*");
                }else{
                    System.out.println("");
                }

            if (i<=altura/2) {
                contador++;
            }else{
                contador--;
            }
        }
    }
}

