package cincoPuntoVeinte;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String direccion;
    private String numeroContacto;
    private List<Sensor> sensores;

    public Edificio(String direccion, String numeroContacto, List<Sensor> sensores) {
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.sensores = new ArrayList<>();
    }
}
