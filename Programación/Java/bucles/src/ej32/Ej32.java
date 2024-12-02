package ej32;

public class Ej32 {
    public static long voltear (long valor){
        long volteado = 0;
        while (valor!=0){
            volteado = (volteado * 10) + (valor%10);
            valor/=10;
        }
        System.err.println(volteado);
        return volteado;
    }

    public static void positivos (){
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Long.parseLong(System.console().readLine());
        num = voltear(num*10+1);
        int sumaPares = 0;
        while (num > 1) {
            if (num % 10 % 2 == 0) {
                sumaPares += num % 10;
                System.out.print(num % 10);
                num/=10;
            }else{
                num/=10;
            }
            
        }
        System.out.printf("Suma de los digitos pares: %d", sumaPares);
    }
}
