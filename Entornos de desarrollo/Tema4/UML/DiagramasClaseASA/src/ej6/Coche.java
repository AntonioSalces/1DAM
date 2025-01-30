package ej6;

public class Coche implements iVehiculo{
    @Override
    public void desplazarse(double x, double y) {
        System.out.printf("Estoy conduciendo hacia %.2f y %.2f", x, y);
    }
}
