package ejFicherosRegistros;

public class Registros {
    private static int ID = 100;
    private String name;
    private int age;
    private String city;

    public Registros(String name, int age, String city) {
        ID = ID++;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    
}
