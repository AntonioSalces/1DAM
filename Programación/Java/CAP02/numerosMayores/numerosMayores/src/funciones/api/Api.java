package funciones.api;

public class Api {
    public static void mayor (int a, int b, int c) {
        if (a>=b && a>=c) {
            System.out.printf("%d es mayor que %d y %d", a, b, c);
        } 
        else if (b>=a && b>=c){
            System.out.printf("%d es mayor que %d y %d", b, a, c);
        }
        else
        System.out.printf("%d es mayor que %d y %d", c, a, b);
        }
}