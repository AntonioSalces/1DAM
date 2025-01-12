package ej2.clases;

public class Vehiculo {
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;

    public Vehiculo(){
        vehiculosCreados++;
    }

    public void recorrerDistancia(int distancia){
        this.kilometrosRecorridos += distancia;
        kilometrosTotales += distancia;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}
