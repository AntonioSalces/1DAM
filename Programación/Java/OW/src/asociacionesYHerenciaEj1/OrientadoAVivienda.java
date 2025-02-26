package asociacionesYHerenciaEj1;

import java.util.Arrays;

public sealed abstract class OrientadoAVivienda extends Inmueble permits Casa, Apartamento{
    private static final int MIN_HABITACIONES = 6;
    protected int numHabitaciones;
    protected int numBanios;
    protected Habitacion[] habitaciones;

    public OrientadoAVivienda() {
        super();
        habitaciones = new Habitacion[MIN_HABITACIONES];
        numHabitaciones = 0;
    }

    public OrientadoAVivienda(int id, String direccion, double precio, int metrosCuadrados,
            int numBanios, Habitacion[] habitacion) {
        super(id, direccion, precio, metrosCuadrados);
        this.numHabitaciones = habitaciones.length;
        this.numBanios = numBanios;
        this.habitaciones = habitacion.clone();
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones.clone();
    }

    public void addHabitacion(Habitacion h) {
        if(habitaciones.length == numHabitaciones) {
            habitaciones = Arrays.copyOf(habitaciones, habitaciones.length+1);
        }
        habitaciones[numHabitaciones++] = h;
    }

    public void removeHabitacion(int index) {
        if(index > 0 && index < habitaciones.length) {
            habitaciones[index] = null;
            for(int i = index+1; i < numHabitaciones-1; i++) {
                habitaciones[i] = habitaciones[i+1];
            }
            numHabitaciones--;
        }
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + numHabitaciones;
        result = prime * result + numBanios;
        result = prime * result + Arrays.hashCode(habitaciones);
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
        OrientadoAVivienda other = (OrientadoAVivienda) obj;
        if (numHabitaciones != other.numHabitaciones)
            return false;
        if (numBanios != other.numBanios)
            return false;
        if (!Arrays.equals(habitaciones, other.habitaciones))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "OrientadoAVivienda [identificadorInmobiliario=" + identificadorInmobiliario + ", direccion=" + direccion
                + ", precioVenta=" + precioVenta + ", metrosCuadrados=" + metrosCuadrados + ", numHabitaciones="
                + numHabitaciones + ", numBanios=" + numBanios + ", habitaciones=" + Arrays.toString(habitaciones)
                + "]";
    }

    
}
