package coche;

import excepciones.HondaException;

public class Coche {
    private int ruedas;
    private int puertas;
    private String marca;

    public Coche (int ruedas, int puertas, String marca) throws HondaException{
        try {
            if (marca == "Honda") throw new HondaException("Ese coche es una mierda.");
        } catch (Exception HondaException) {
            throw new HondaException("Ese coche es una mierda.");
        }
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }
    
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(short ruedas) {
        this.ruedas = ruedas;
    }

    public void informacion(String[] args) {
        System.out.printf("El coche tiene %d ruedas, %d puertas y es de la marca %s", ruedas, puertas, marca);
    }
}
