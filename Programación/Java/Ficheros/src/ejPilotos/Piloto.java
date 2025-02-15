package ejPilotos;

public class Piloto implements Comparable<Piloto>{
    private String nombre;
    private String equipo;
    private int numero;
    private String nacionalidad;
    private int puntos;

    public Piloto(String nombre, String equipo, int numero, String nacionalidad, int puntos) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.puntos = puntos;
    }

    public String getEquipo() {
        return equipo;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int compareTo(Piloto p) {
        return Integer.compare(p.puntos, this.puntos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null) return false;
        Piloto piloto = (Piloto) obj;
        return numero == piloto.numero && nombre.equals(piloto.nombre);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Equipo: %s, Numero: %d, Nacionalidad: %s, Puntos %d", 
        nombre, equipo, numero, nacionalidad, puntos);
    }
}
