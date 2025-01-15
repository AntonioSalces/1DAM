package ej9.clases;

public class Movil extends Terminal{
    private double costeLlamada;
    private String tarifa;

    public Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
        this.costeLlamada = 0;
    }

    public double sumarTarifa(){
        return switch(tarifa){
            case "rata"->0.06;
            case "mono"->0.12;
            case "bisonte"->0.30;
            default->0;
        };
    }

    @Override
    public void llama(Terminal t, int duracion){
        super.llama(t, duracion);
        costeLlamada += ((double)duracion/60)*sumarTarifa();
    }

    @Override
    public String toString() {
        return String.format("%s - tarificados %.2f euros", super.toString(), costeLlamada);
    }
}
