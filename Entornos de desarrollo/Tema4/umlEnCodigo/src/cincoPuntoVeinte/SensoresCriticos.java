package cincoPuntoVeinte;

public class SensoresCriticos extends Sensor{
    private int toleranciaIntervalo;

    public SensoresCriticos(String fabricante, int numeroModelo, int factorEscala, String unidadMedida, int intervaloMuestreo, String ubicación, String estado, int valorActual, int umbralAlarma, int toleranciaIntervalo) {
        super(fabricante, numeroModelo, factorEscala, unidadMedida, intervaloMuestreo, ubicación, estado, valorActual, umbralAlarma);
        this.toleranciaIntervalo = toleranciaIntervalo;
    }

    

    
}
