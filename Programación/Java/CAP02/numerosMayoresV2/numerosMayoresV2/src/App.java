import ejUno.api.NumerosMayores;

public class App {
    public static void main(String[] args) throws Exception {
        int a=0, b=0, c=0;

        System.err.println("Escribe un número: ");
        NumerosMayores.identificador(a, b, c);
        System.err.println("Escribe el segundo número: ");
        NumerosMayores.identificador(a, b, c);
        System.err.println("Escribe el último número: ");
        NumerosMayores.identificador(a, b, c);
    }
}
