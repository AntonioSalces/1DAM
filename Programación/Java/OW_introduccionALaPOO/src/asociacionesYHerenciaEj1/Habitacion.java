package asociacionesYHerenciaEj1;

public class Habitacion {
    private String uso;
    private double metrosCuadrados;
    private int numVentanas;

    public Habitacion() {

    }

    public Habitacion(String uso, double metrosCuadrados, int numVentanas) {
        this.uso = uso;
        this.metrosCuadrados = metrosCuadrados;
        this.numVentanas = numVentanas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uso == null) ? 0 : uso.hashCode());
        long temp;
        temp = Double.doubleToLongBits(metrosCuadrados);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + numVentanas;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Habitacion other = (Habitacion) obj;
        if (uso == null) {
            if (other.uso != null)
                return false;
        } else if (!uso.equals(other.uso))
            return false;
        if (Double.doubleToLongBits(metrosCuadrados) != Double.doubleToLongBits(other.metrosCuadrados))
            return false;
        if (numVentanas != other.numVentanas)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Habitacion [uso=" + uso + ", metrosCuadrados=" + metrosCuadrados + ", numVentanas=" + numVentanas + "]";
    }

    
}
