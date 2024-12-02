package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void pedirDato (){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        char operando = scanner.next().charAt(0);
        double b = scanner.nextDouble();
        scanner.close(); 
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b==0){
            throw new ArithmeticException("No se puede dividir entre 0.");
        }
        return a / b;
    }

    public static void calculadora(double a, double b, char operando, double resultado){
        switch (operando) {
            case '+': sumar(a, b);
                break;
                
            case '-': restar(a, b);
                break;

            case '*': multiplicar(a, b);
                break;

            case '/': dividir(a, b);
                break;
        
            default:
                break;
        }
        System.out.println("El resultado es " + resultado);
    }
}
