package ej25;

public class Ej25 {
    public static void numerosAlReves() {
        System.out.print("Introduzca un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());
        final int NUMERO_ORIGINAL = numero;
        String resultado = ""; // Inicializar como cadena vacía para concatenar los dígitos

        while (numero != 0) {
            int aux = numero % 10; // Obtener el último dígito del número
            resultado += aux; // Concatenar el dígito a la cadena resultado
            numero /= 10; // Eliminar el último dígito del número original
        }

        System.out.println("Si le damos la vuelta a " + NUMERO_ORIGINAL + " tenemos el " + resultado);
    }
}       