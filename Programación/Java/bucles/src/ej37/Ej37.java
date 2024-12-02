package ej37;

public class Ej37 {
    public static int voltear (int valor){
        int volteado = 0;
        while (valor >0) {
            volteado = volteado*10+(valor%10);
            valor/=10;
        }
        return volteado;  
        }


    public static void palotes() {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        final int NUMEROORIGINAL = num;
        num = voltear(num*10+1);
        String palotes = "";
        while (num != 1) {
            for (int i = 1; i <= num%10; i++){
                System.out.print("| ");
            }
            System.out.print("- ");
            num/=10;
        }

    }
}
