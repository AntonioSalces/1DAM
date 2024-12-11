package clases;

public class Persona {
    //Propiedades
    private String dni;
    private String nombre;
    private int edad;

    //Getters y setters
    public String getDni() {
        return dni;
    }   
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Métodos
    public void hablar() {

    }

    public void trabajar() {

    }

    public boolean estaVivo() {
        return true;
    }

    public boolean esHijo(Persona persona1, Persona persona2) {
        return true;
    }
}
