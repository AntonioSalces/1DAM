package clases;

public class amo {
    
    private int id;
    private String dni;
    private String nombre;

    public amo(int id, String dni, String nombre){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
