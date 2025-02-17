package ejInstituto;

public class Asignatura implements Comparable<Asignatura>{
    private Integer id;
    private String nombre;

    public Asignatura(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int compareTo(Asignatura o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (!this.getClass().equals(obj.getClass())) return false;
        return this.id == ((Asignatura)obj).id;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    
    @Override
    public String toString() {
        return String.format("""
                ID: %d
                Nombre: %s
                """, id, nombre);
    }
}
