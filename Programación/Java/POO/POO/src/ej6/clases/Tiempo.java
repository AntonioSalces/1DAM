package ej6.clases;

public class Tiempo {
    private int segundos;

    public Tiempo(int segundos){
        this.segundos = segundos;
    }

    public Tiempo(int horas, int minutos, int segundos){
        this.segundos = horas*3600+minutos*60+segundos;
    }

    public int totalAHoras(){
        return segundos/3600;
    }

    public int totalAMinutos(){
        return segundos%3600/60;
    }

    public int totalASegundos(){
        return segundos%60;
    }

    private Tiempo sumar(int segundos){
        Tiempo res = new Tiempo(this.segundos+segundos);
        return new Tiempo(res.totalAHoras(), res.totalAMinutos(), res.totalASegundos());
    }

    public Tiempo suma(Tiempo t){
        return sumar(t.segundos);
    }

    public Tiempo restar(Tiempo t){
        return sumar(-t.segundos);
    }

    @Override
    public String toString() {
        return String.format("%s%dh %dm %ds%s", segundos<0?"-(":"", Math.abs(totalAHoras()), Math.abs(totalAMinutos()), Math.abs(totalASegundos()), segundos<0?")":"");
    }
}
