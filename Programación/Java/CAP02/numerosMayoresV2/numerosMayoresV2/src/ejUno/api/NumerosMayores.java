package ejUno.api;
import java.util.Scanner;

public class NumerosMayores {
    public static void lectora(int a){
        Scanner scanner = new Scanner(System.in);
        Integer.parseInt(scanner.nextLine());
    }

    public static void lectorb(int b){
        Scanner scanner = new Scanner(System.in);
        Integer.parseInt(scanner.nextLine());
    }

    public static void lectorc(int c){
        Scanner scanner = new Scanner(System.in);
        Integer.parseInt(scanner.nextLine());
    }

    public static void identificador(int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        Integer.parseInt(scanner.nextLine());

        if (a>=b && a>=c){
            System.err.println("El número mayor es "+a);
        } else if (b>=a && b>=c){
            System.err.println("El número mayor es "+b);
        } else{
            System.err.println("El número mayor es "+c);
        }
        
    }
}
