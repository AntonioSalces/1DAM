package ej33;

public class Ej33 {
    public static long voltear (long valor){
        long volteado = 0;
        while (valor!=0){
            volteado = (volteado * 10) + (valor%10);
            valor/=10;
        }
        return volteado;
    }

    public static void paresImpares(){
        System.out.print("Por favor, introduzca un número: ");
        long num1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro número: ");
        long num2 = Long.parseLong(System.console().readLine());
        num1 = voltear(num1*10+1);
        num2 = voltear(num2*10+1);
        long numeroPar = 0;
        long numeroImpar = 0;
        while (num1 > 1) {
            if (num1 % 10 % 2 == 0) {
                numeroPar = numeroPar * 10 + num1 % 10;
            } else{
                numeroImpar = numeroImpar * 10 + num1 % 10;
            }
            num1/=10;

            if (num2 % 10 % 2 == 0) {
                numeroPar = numeroPar * 10 + num2 % 10;
            } else{
                numeroImpar = numeroImpar * 10 + num2 % 10;
            }
            num2/=10;
        }
        System.err.printf("El número formado por los dígitos pares es %d %n", numeroPar);
        System.err.printf("El número formado por los dígitos impares es %d", numeroImpar);
    }
}
