package ej42;

public class Ej42 {
    public static void comprobacion (long num, boolean esPrimo){
        for (int i = 2; i<=num/2+1; i++){
            if (num%i==0){
                esPrimo = false;
                break;
            }   
        }
        if (esPrimo==false){
            System.out.printf("%d no es primo %n", num);
        }else{
            System.out.printf("%d es primo %n", num);
        }
    }
    public static void primoYSusSiguiente(){
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Long.parseLong(System.console().readLine());
        comprobacion(num, true);
        comprobacion(num+1, true);
        comprobacion(num+2, true);
        comprobacion(num+3, true);
        comprobacion(num+4, true);
    }
}