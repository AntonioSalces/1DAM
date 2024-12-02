/*
 *  Tenemos que crear una calculadora que tenga el mismo funcionamiento que cualquier calculadora normal con las
 *  operaciones básicas. Debemos de crear 3 sets, para setear el primer y segundo operando, y el operador. Creamos 3
 *  variables, las mencionadas anteriormente y la memoria, para guardar los resultados (deben de ser doubles).
 */

import calculadora.Calculadora;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Calculadora.operar(0.0, 0.0, '+', 0.0);
        scanner.close();
    }
}
