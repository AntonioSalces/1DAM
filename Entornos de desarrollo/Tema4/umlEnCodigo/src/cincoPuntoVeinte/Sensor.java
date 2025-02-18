package cincoPuntoVeinte;

public class Sensor {
    private String fabricante;
    private int numeroModelo;
    private int factorEscala;
    private String unidadMedida;
    private int intervaloMuestreo;
    private String ubicación;
    private String estado;
    private int valorActual;
    private int umbralAlarma;

    public Sensor(String fabricante, int numeroModelo, int factorEscala, String unidadMedida, int intervaloMuestreo, String ubicación, String estado, int valorActual, int umbralAlarma) {
        this.fabricante = fabricante;
        this.numeroModelo = numeroModelo;
        this.factorEscala = factorEscala;
        this.unidadMedida = unidadMedida;
        this.intervaloMuestreo = intervaloMuestreo;
        this.ubicación = ubicación;
        this.estado = estado;
        this.valorActual = valorActual;
        this.umbralAlarma = umbralAlarma;
    }
}
