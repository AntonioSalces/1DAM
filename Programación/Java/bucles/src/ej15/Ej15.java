package ej15;

public class Ej15 {
    public static void pow(){
        System.err.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.err.print("Introduzca el exponente máximo: ");
        int exponente = Integer.parseInt(System.console().readLine());
        int calculo = 1;
        for (int i = 1; i <= exponente; i++){
                calculo *= base;
                System.err.printf("%d^%d = %d %n", base, i, calculo);
            }

        }
    }

