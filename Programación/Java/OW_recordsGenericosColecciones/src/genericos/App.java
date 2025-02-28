package genericos;

public class App {
    public static void main(String[] args) {
        Par<Integer, String> p1 = new Par<>(1, "Hola");
        System.out.println(p1);

        Par<Integer, String> p2 = new Par<>(8, "=======D");
        System.out.println(p2);
    }
}
