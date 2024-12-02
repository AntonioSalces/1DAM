package clases;

import java.util.Scanner;

public class Ej13 {
    public static void ordenar () {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Introduce los tres números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int mayor, medio, menor;

        if (a > b && a > c){
            mayor = a;
        } else if  (b > a && b > c){
            mayor = b;
        }else {
            mayor = c;
        }
        if (a < b && a < c){
            menor = a;
        }else if (b < a && b < c){
            menor = b;
        }else {
            menor = c;
        }
        if (a != mayor && a != menor){
            medio = a;
        }else if (a != mayor && b!= menor){
            medio = b;
        }else {
            medio = c;
        }
        System.err.println("Los números introducidos ordenados de mayor a menor son " + mayor + " , " + medio + " , " + menor);
        scanner.close();
    }
    
}
