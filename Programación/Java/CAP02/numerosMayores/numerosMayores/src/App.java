import java.util.Scanner;
import funciones.api.Api;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Escribe el primer número: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.err.println("Escribe el segundo número: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.err.println("Escribe el tercer número: ");
        int c = Integer.parseInt(scanner.nextLine());
        Api.mayor(a, b, c);
        scanner.close();
    }
}