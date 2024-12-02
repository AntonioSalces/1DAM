package ej9;

public class Ej9 {
    public static void longitud(){
        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        long num = Long.parseLong(System.console().readLine());
        final long NUMORIGINAL = num;
        int i = 0;
        for (i = 0; num > 0; i++){
            num/=10;
        }
        System.out.printf("%d tiene %d dígito/s.", NUMORIGINAL, i);
    }
}
