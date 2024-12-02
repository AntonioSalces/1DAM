public class LGTB {
    // Códigos ANSI para los colores
    public static final String ROJO = "\u001B[41m";
    public static final String NARANJA = "\u001B[43m";
    public static final String AMARILLO = "\u001B[103m";
    public static final String VERDE = "\u001B[42m";
    public static final String AZUL = "\u001B[44m";
    public static final String MORADO = "\u001B[45m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Dimensiones de la bandera
        int altura = 20; // Altura de cada columna
        int anchoDeCadaFranja = 12; // Ancho de cada franja

        // Imprimir la bandera con franjas verticales
        for (int i = 0; i < altura; i++) { // Cada fila
            imprimirFranja(ROJO, anchoDeCadaFranja);
            imprimirFranja(NARANJA, anchoDeCadaFranja);
            imprimirFranja(AMARILLO, anchoDeCadaFranja);
            imprimirFranja(VERDE, anchoDeCadaFranja);
            imprimirFranja(AZUL, anchoDeCadaFranja);
            imprimirFranja(MORADO, anchoDeCadaFranja);
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    // Método para imprimir una franja vertical (columna de color)
    public static void imprimirFranja(String color, int ancho) {
        for (int j = 0; j < ancho; j++) {
            System.out.print(color + " " + RESET); // Imprimir un bloque de color
        }
    }
}