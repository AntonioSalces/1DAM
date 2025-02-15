package ejEventoDeportivo;

public class Participante {
    private int id;
    private static int siguienteId = 100;  // Se actualizará al leer el archivo
    private String nombre;
    private int edad;
    private String deporte;
    private double tiempoDeRegistro;

    public Participante(int id, String nombre, int edad, String deporte, double tiempoDeRegistro) {
        this.id = id; // Usamos el ID del archivo
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.tiempoDeRegistro = tiempoDeRegistro;
    }

    public static int getSiguienteId() {
        return siguienteId;
    }

    public static void setSiguienteId(int nuevoId) {
        siguienteId = nuevoId;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDeporte() { return deporte; }
    public double getTiempoDeRegistro() { return tiempoDeRegistro; }

    @Override
    public String toString() {
        return String.format("%d,%s,%d,%s,%.2f", id, nombre, edad, deporte, tiempoDeRegistro);
    }
}
