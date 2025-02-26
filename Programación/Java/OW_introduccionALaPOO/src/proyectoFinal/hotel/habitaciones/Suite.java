package proyectoFinal.hotel.habitaciones;

import proyectoFinal.hotel.economia.Precios;

public class Suite extends Habitacion{
    private String nombre;
    private int numeroPlazas;
    private String serviciosExtra;

    public Suite(int numero, String descripcion, String nombre, int numeroPlazas,
            String serviciosExtra) {
        super(numero, Precios.PRECIO_SUITE, descripcion);
        this.nombre = nombre;
        this.numeroPlazas = numeroPlazas;
        this.serviciosExtra = serviciosExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getServiciosExtra() {
        return serviciosExtra;
    }

    public void setServiciosExtra(String serviciosExtra) {
        this.serviciosExtra = serviciosExtra;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + numeroPlazas;
        result = prime * result + ((serviciosExtra == null) ? 0 : serviciosExtra.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suite other = (Suite) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (numeroPlazas != other.numeroPlazas)
            return false;
        if (serviciosExtra == null) {
            if (other.serviciosExtra != null)
                return false;
        } else if (!serviciosExtra.equals(other.serviciosExtra))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Suite [nombre=" + nombre + ", numeroPlazas=" + numeroPlazas + ", serviciosExtra=" + serviciosExtra
                + "]";
    }
}
