package clases;

import java.util.Scanner;

public class Ej4 {
    public static void resolverEcuacion (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el valor de 'a'");
        int a = scanner.nextInt();
        System.out.println("Escribe el valor de 'b'");
        int b = scanner.nextInt();
        scanner.close();
        float x = 0;
        if (a!=0){
            x = -b/a;
            System.out.println("x = " + x); 
        }
    }
}
