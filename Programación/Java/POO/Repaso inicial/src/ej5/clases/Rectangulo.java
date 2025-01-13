package ej5.clases;

public class Rectangulo implements Dibujable {
    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    @Override
    public void dibujar(){
        System.out.println("Estoy dibujando un cuadrado de " + getAncho() + " x " + getLargo());
    }
}

