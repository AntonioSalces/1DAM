package ej3.clases;

public class Ave extends Animal{
    private int tamañoAla;
    private boolean puedeVolar;

    public int getTamañoAla() {
        return tamañoAla;
    }

    public void setTamañoAla(int tamañoAla) {
        this.tamañoAla = tamañoAla;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public String medirAla(String animal, int tamaño){
        return "Me mide " + this.tamañoAla + " centímetros";
    }
}
