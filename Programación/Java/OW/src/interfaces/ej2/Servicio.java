package interfaces.ej2;

public class Servicio implements Vendible{
    private String nombre;
    private String tipo;
    private int duracion;
    private double precio;
    
    public Servicio(String nombre, String tipo, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
        switch (tipo.toLowerCase()) {
            case "pintura":
                precio = duracion * 0.75;
                break;

            case "electricidad":
                precio = duracion;
                break;

            case "fontaneria":
                precio = duracion * 1.25;
                break;
        
            default:
                precio = duracion * 1.5;
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }
}
