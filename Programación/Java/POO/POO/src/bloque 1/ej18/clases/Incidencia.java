package ej18.clases;

public class Incidencia {
    private static int codigo = 1;
    private boolean pendiente;
    private String problema;
    private int numeroPuesto;
    private String resolucion;
    private static int pendientes;

    public Incidencia(int numeroPuesto, String problema){
        codigo = codigo++;
        pendiente = true;
        this.problema = problema;
        this.numeroPuesto = numeroPuesto;
        resolucion = "";
        pendientes++;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public void resuelve(String resolucion){
        this.resolucion = resolucion;
        pendiente = false;
        pendientes--;
    }

    @Override
    public String toString() {
        return String.format("Incidencia %d - Puesto: %d - %s - %s %s", codigo, numeroPuesto, problema, pendiente?"Pendiente":"Resuelta", pendiente?"":"- " + resolucion);
    }
}
