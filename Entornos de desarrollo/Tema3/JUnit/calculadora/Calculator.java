package calculadora;

public class Calculator {

    public String nombre = "";

    public int suma(int sumando1, int sumando2){
        return sumando1 + sumando2;
    }

    public int resta (int minuendo, int sustraendo){
        return minuendo - sustraendo;
    }

    public int multiplica (int factor1, int factor2){
        return factor1 * factor2;
    }

    public int divide (int dividendo, int divisor){
        return dividendo / divisor;
    }
}