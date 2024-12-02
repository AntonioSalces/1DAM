package ej16;

public class Ej16 {
    public static void primo() {
        System.err.print("Introduzca un número entero y le diré si es primo: ");
        int num = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;
        for (int i = 2; i <= num/2; i++){
            if (num % i == 0){
                esPrimo = false;
            }
        }
        if (esPrimo == false) {
            System.err.println("El número introducido no es primo");
        } else{
            System.out.println("El número introducio es primo");
        }
    }

}
