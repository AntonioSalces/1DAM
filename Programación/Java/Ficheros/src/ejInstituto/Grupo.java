package ejInstituto;

public class Grupo implements Comparable<Grupo>{
    private Integer id;
    private String nombre;
    private String turno;

    public Grupo(Integer id, String nombre, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.turno = turno;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public int compareTo(Grupo o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (!this.getClass().equals(obj.getClass())) return false;
        return this.id == ((Grupo)obj).id;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("""
                ID, %d
                Nombre: %s
                """, id, nombre);
    }
}
