package ejInstituto;

public class Alumno implements Comparable<Alumno>{
    private Integer id;
    private String apellido;
    private String nombre;
    private String nie;
    private Grupo grupo;

    public Alumno(Integer id, String apellido, String nombre, String nie, Grupo grupo) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nie = nie;
        this.grupo = grupo;
    }

    public String getApellido() {
        return apellido;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public int getId() {
        return id;
    }

    public String getNie() {
        return nie;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (!this.getClass().equals(obj.getClass())) return false;
        return this.id == ((Alumno)obj).id;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("""
                ID: %d
                Apellido: %s
                Nombre: %s
                NIE: %s
                Grupo: %s
                """, id, apellido, nombre, nie, grupo);
    }
}
