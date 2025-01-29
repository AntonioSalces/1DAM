package Ej5_19;

import java.util.ArrayList;
import java.util.List;

public class Ventana {
    private Cabecera cabecera;
    private List<BarraDesplazamiento> barrasDesplazamientos;
    private Panel panel;

    public Ventana() {
        cabecera = new Cabecera();
        barrasDesplazamientos = new ArrayList<>();
        panel = new Panel();
    }
}
