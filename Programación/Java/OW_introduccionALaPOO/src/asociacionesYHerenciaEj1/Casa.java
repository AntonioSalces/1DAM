package asociacionesYHerenciaEj1;

import java.util.Arrays;

public final class Casa extends OrientadoAVivienda{
    private int numPisos;

    public Casa() {
        
    }

    public Casa(int id, String direccion, double precio, int metrosCuadrados, int numBanios, Habitacion[] habitacion,
            int numPisos) {
        super(id, direccion, precio, metrosCuadrados, numBanios, habitacion);
        this.numPisos = numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + numPisos;
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
        Casa other = (Casa) obj;
        if (numPisos != other.numPisos)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Casa [numPisos=" + numPisos + ", identificadorInmobiliario=" + identificadorInmobiliario
                + ", direccion=" + direccion + ", precioVenta=" + precioVenta + ", numHabitaciones=" + numHabitaciones
                + ", metrosCuadrados=" + metrosCuadrados + ", numBanios=" + numBanios + ", habitaciones="
                + Arrays.toString(habitaciones) + "]";
    }

}
