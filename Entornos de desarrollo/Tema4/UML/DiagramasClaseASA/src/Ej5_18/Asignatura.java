package Ej5_18;

public class Asignatura {
    private int codigo;
    private String nombre;
    private String tipo;
    private int creditos;

    public Asignatura(String nombre, int codigo, String tipo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.creditos = creditos;
    }
}