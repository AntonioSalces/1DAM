package proyectoFinal.hotel.personas;

public class Cliente extends Huesped{
    private String tarjetaCredito;

    public Cliente(String nombre, String dni, int edad, String tarjetaCredito) {
        super(nombre, dni, edad);
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
}
