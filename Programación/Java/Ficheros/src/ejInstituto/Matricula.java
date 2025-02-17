package ejInstituto;

public class Matricula implements Comparable<Matricula>{
    private Integer id;
    private Alumno alumno;
    private Asignatura asignatura;

    public Matricula(Integer id, Alumno alumno, Asignatura asignatura) {
        this.id = id;
        this.alumno = alumno;
        this.asignatura = asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    @Override
    public int compareTo(Matricula o) {
        return this.asignatura.compareTo(o.getAsignatura());
    }

    @Override
    public boolean equals(Object obj) {
        return this.asignatura == ((Matricula)obj).asignatura &&
        this.alumno== ((Matricula)obj).alumno;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("""
                ID: %d
                Alumno: %s
                Asignatura: %s
                """, id, alumno, asignatura);
    }

}
