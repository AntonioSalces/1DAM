/*
 * Aquí deben de ir las variables y los metodos getters y setters. El metodo getResultado (que lanzará la excepción en
 * caso de operador invalido), debe de tener un switch dependiendo del operador que nos haya proporcionado el usuario.
 * Una vez haga el cálculo, el resultado debe de ser almacenado en el operador 1 para poder hacer la incrementalidad.
 * this.operando1 = this.operando1 + this.operando2. El return this.operando1 para mostrar el resultado debe de estar
 * fuera del condicional.
 */
package calculadora;

import java.util.Scanner;

public class Calculadora{
    private double x;
    private double y;
    private char op;
    private double resultado;

    public Calculadora (double x, double y, char op, double resultado) {
        x = 0;
        y = 0;
        op = 0;
        resultado = 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;

    }

    public double getY() {
        return y;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public char getOp() {
        return op;
    }

    public double getResultado() {
        return resultado;
    }

    public static void operar (double x, double y, char op, double resultado) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        x = scanner.nextDouble();
        System.out.println("Introduce el operador");
        op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Introduce el segundo número");
                y = scanner.nextDouble();
                resultado=x+y;
                System.out.println(x + "+" + y + "=" + resultado);
                break;

            case '-':
                System.out.println("Introduce el segundo número");
                y = scanner.nextDouble();
                resultado=x-y;
                System.out.println(x + "-" + y + "=" + resultado);
                break;

            case '*':
                System.out.println("Introduce el segundo número");
                y = scanner.nextDouble();  
                resultado=x*y;
                System.out.println(x + "*" + y + "=" + resultado);
                break;

            case '/':
                System.out.println("Introduce el segundo número");
                y = scanner.nextDouble();
                resultado=x/y;
                System.out.println(x + "/" + y + "=" + resultado);
                break;
        
            default:
                System.out.println("Operador invalido");
                break;
        }
        scanner.close();
    }
    

}