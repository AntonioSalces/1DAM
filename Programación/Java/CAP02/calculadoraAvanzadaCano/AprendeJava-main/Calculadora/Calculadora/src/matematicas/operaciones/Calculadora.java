package matematicas.operaciones;

import java.util.Scanner;

public class Calculadora {
    private static Double operador1 = null;
    private static Double operador2 = null;
    private static String operando = null;
    private static Double memory = null; // La memoria que almacena el resultado de la última operación

    // Método para establecer el primer operador
    public static void setOperador1(Double op1) {
        operador1 = op1;
    }

    // Método para establecer el segundo operador
    public static void setOperador2(Double op2) {
        operador2 = op2;
    }

    public static void setOperando(String op) {
        if (op.equals("AC")) {
            resetMemory(); // Si es "AC", reiniciamos la calculadora
            System.out.println("Resultado: 0");
        } else {
            operando = op;
        }
    }

    // Método para borrar la memoria ('C' o 'AC')
    public static void resetMemory() {
        memory = null;
        operador1 = null;
        operador2 = null;
        operando = null;
    }

    // Método que realiza la operación
    public static Double realizarOperacion() {
        // Si la memoria tiene un valor y no hay un operador1 establecido, se usa la memoria como operador1
        if (memory != null && operador1 == null) {
            operador1 = memory;
        }

        // Verificamos si los operadores y el operando han sido inicializados
        if (operador1 == null || operador2 == null || operando == null) {
            System.out.println("Error: Los operadores o el operando no están inicializados.");
            return null;
        }

        // Realizamos la operación según el valor de 'operando'
        switch (operando) {
            case "+":
                memory = operador1 + operador2;
                break;
            case "-":
                memory = operador1 - operador2;
                break;
            case "*":
                memory = operador1 * operador2;
                break;
            case "/":
                if (operador2 != 0) {
                    memory = operador1 / operador2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    return null;
                }
                break;
            case "AC":
                resetMemory();
                System.out.println("0");
                break;
            default:
                System.out.println("Operación no válida.");
                return null;
        }
        // Limpiamos operador1 y operando, para que al repetir operación se reutilice memory
        operador1 = null;
        operando = null;
        operando = null;

        return memory;
    }
    // Método para imprimir sin el ".0" si no es necesario
    public static void imprimirResultado(Double resultado) {
        // Verificamos si el número es entero (sin parte decimal)
        if (resultado == resultado.intValue()) {
            // Si es un entero, lo imprimimos como tal
            System.out.println("Resultado: " + resultado.intValue());
        } else {
            // Si es decimal, lo imprimimos como double
            System.out.println("Resultado: " + resultado);
        }
    }

        // Método para solicitar entrada del usuario
    public static void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número (operador1): ");
        setOperador1(scanner.nextDouble());

        System.out.print("Introduce el segundo número (operador2): ");
        setOperador2(scanner.nextDouble());

        System.out.print("Introduce el operando (+, -, *, /) o 'AC' para borrar memoria: ");
        String operandoInput = scanner.next();

        setOperando(operandoInput); // Llamamos al método para procesar el operando

        scanner.close(); // Cerramos el escáner
    }
}

