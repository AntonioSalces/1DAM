/*
 * Tiene añadido de más el número formado. Se lo he añadido sin pensarlo creyendo que el ejercicio lo pedía.
 */

package ej41;

public class Ej41 {
    public static long voltear(long valor){
        long volteado = 0;
        while (valor!=0) {
            volteado = volteado*10+valor%10;
            valor/=10;
        }
        return volteado;
    }

    public static void paresImpares(){
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Long.parseLong(System.console().readLine());
        long aux = voltear(num*10+1);
        long pares = 0;
        long impares = 0;
        int contPares = 0;
        int contImpares = 0;
        while (aux != 1) {
            short digito = (short)(aux%10);
            if (digito%2==0){
                pares = (pares*10)+digito;
                contPares++;
            }else{
                impares = (impares*10)+digito;
                contImpares++;
            }
            aux/=10;
        }
        System.out.printf("El %d tiene %d dígitos pares y %d dígitos impares. %nEl número formado con los pares es el %d, y el formado con los impares es con el %d", num, contPares, contImpares, pares, impares);
    }
}
