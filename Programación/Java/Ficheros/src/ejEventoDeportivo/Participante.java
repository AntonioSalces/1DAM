package ejEventoDeportivo;

public class Participante {
    private int id;
    private static int siguienteId = 100;
    private String nombre;
    private int edad;
    private String deporte;
    private double tiempoDeRegistro;

    public Participante(String nombre, int edad, String deporte, double tiempoDeRegistro) {
        id = siguienteId++;
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.tiempoDeRegistro = tiempoDeRegistro;
    }
}
