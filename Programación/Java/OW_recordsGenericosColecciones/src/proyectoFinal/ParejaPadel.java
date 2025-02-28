package proyectoFinal;

public class ParejaPadel extends ParticipanteAbstracto{
    private String nombreJugador1;
    private String nombreJugador2;
    
    public ParejaPadel(String nombre, String nombreJugador1, String nombreJugador2) {
        super(nombre);
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }
}
