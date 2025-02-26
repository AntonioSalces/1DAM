package asociacionesYHerenciaEj1;

public sealed abstract class Inmueble permits OrientadoAVivienda, Local{
    protected int identificadorInmobiliario;
    protected String direccion;
    protected double precioVenta;
    protected double metrosCuadrados;

    public Inmueble() {
        
    }

    public Inmueble(int id, String direccion, double precio, int metrosCuadrados) {
        this.identificadorInmobiliario = id;
        this.direccion = direccion;
        this.precioVenta = precio;
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + identificadorInmobiliario;
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precioVenta);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(metrosCuadrados);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Inmueble other = (Inmueble) obj;
        if (identificadorInmobiliario != other.identificadorInmobiliario)
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (Double.doubleToLongBits(precioVenta) != Double.doubleToLongBits(other.precioVenta))
            return false;
        if (Double.doubleToLongBits(metrosCuadrados) != Double.doubleToLongBits(other.metrosCuadrados))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Inmueble [identificadorInmobiliario=" + identificadorInmobiliario + ", direccion=" + direccion
                + ", precioVenta=" + precioVenta + ", metrosCuadrados=" + metrosCuadrados + "]";
    }
}
