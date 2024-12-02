package ej47;

public class Ej47 {
    public static void m() {
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        short altura = Short.parseShort(System.console().readLine());
        System.out.println("MMMMMM");
        for (int i = 1; i <= (altura-3)/2; i++){
            System.err.println("M    M");
        }
        System.out.println("MMMMMM");
        for (int i = 1; i <= (altura-3)/2; i++){
            System.err.println("M    M");
        }
        System.out.println("MMMMMM");
    }
}