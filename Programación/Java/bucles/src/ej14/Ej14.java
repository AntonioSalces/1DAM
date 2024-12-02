package ej14;

public class Ej14 {
    public static void potencia (){
        System.err.println("Cálculo de una potencia.");
        System.err.print("Introduzca la base: ");
        long base = Short.parseShort(System.console().readLine());
        final short BASEORIGINAL = (short)base;
        System.err.print("Introduzca el exponente: ");
        short exponente = Short.parseShort(System.console().readLine());
        for (int i = 1; i < exponente-1; i++){
            base *= base;
        }
        System.out.printf("%d^%d = %d %n", BASEORIGINAL, exponente, base);
        
    }
}
