package matematicas;

import java.util.Scanner;

public class Calculadora {
    private static Double operando1;
    private static Double operando2;
    private static String operador;
    private static Double memoria;

    public static void setOperando1(double op1) {
        Calculadora.operando1 = op1;
    }
    public static void setOperando2(double op2) {
        Calculadora.operando2 = op2;
    }
    public static void setOperando(String op) {
        if (op.equals("AC")) {
            resetMemory(); // Si es "AC", reiniciamos la calculadora
            System.out.println("Resultado: 0");
        } else {
            operador = op;
        }
    }

    public static void resetMemory(){
        memoria = null;
        operando1 = null;
        operando2 = null;
        operador = null;
    }

    public static Double realizarOperacion() {
        switch (operador) {
            case "+":
                memoria = operando1 + operando2;
                return memoria;
            case "-":
                memoria = operando1 - operando2;
                return memoria;
            case "*":
                memoria = operando1 * operando2;
                return memoria;
            case "/":
                memoria = operando1 / operando2;
                return memoria;   
            case "AC":
                resetMemory();
                System.err.println("0");
                break;         

            default:
                System.out.println("Operador no válido");
                break;
        }

        return memoria;
    }

    public static void solicitarDatos(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el primer número");
    setOperando1(scanner.nextDouble());
    System.out.println("Introduce un operador o 'AC'");
    String operandoInput = scanner.next();
    setOperando(operandoInput);
    System.out.println("Introduce el segundo número");
    setOperando2(scanner.nextDouble());
    scanner.close();
    }
}


