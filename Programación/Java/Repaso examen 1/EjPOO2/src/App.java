import coche.Coche;

public class App {
    public static void main(String[] args) throws Exception {
        Coche honda = new Coche(6, 5, "Honda");
        honda.informacion(args);
    }
}
