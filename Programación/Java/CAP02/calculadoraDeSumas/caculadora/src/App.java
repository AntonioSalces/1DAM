import matematicas.operacions.Operaciones;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.err.println("**********SUMA**********");
        System.err.println("Introduzca un número: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.err.println("Introduzca otro número: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d + %d = %d", a, b, Operaciones.suma(a, b));

        System.out.println("\n");

        System.err.println("**********RESTA**********");
        System.err.println("Introduzca un número: ");
        a = Integer.parseInt(scanner.nextLine());
        System.err.println("Introduzca otro número: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d - %d = %d", a, b, Operaciones.resta(a, b));

        System.out.println("\n");

        System.err.println("**********MULTIPLICACIÓN**********");
        System.err.println("Introduzca un número: ");
        a = Integer.parseInt(scanner.nextLine());
        System.err.println("Introduzca otro número: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d * %d = %d", a, b, Operaciones.multiplicacion(a, b));

        System.out.println("\n");

        System.err.println("**********COCIENTE**********");
        System.err.println("Introduzca un número: ");
        a = Integer.parseInt(scanner.nextLine());
        System.err.println("Introduzca otro número: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d / %d = %d", a, b, Operaciones.cociente(a, b));

        System.out.println("\n");

        System.err.println("**********RESTO**********");
        System.err.println("Introduzca un número: ");
        a = Integer.parseInt(scanner.nextLine());
        System.err.println("Introduzca otro número: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d / %d = %d", a, b, Operaciones.resto(a, b));

        scanner.close();
    }
}