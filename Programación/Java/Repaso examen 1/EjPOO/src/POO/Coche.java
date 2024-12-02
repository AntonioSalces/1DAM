package POO;

public class Coche {
    private String marca;
    private int velocidad;
    private int ruedas;

    public Coche (String marca, int velocidad, int ruedas){
        this.marca = marca;
        this.velocidad = velocidad;
        this.ruedas = ruedas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void informacion(){
        System.out.println("El coche de la marca "+marca+ " tiene "+ruedas+" ruedas y una velocidad máxima de "+velocidad+"km/h");
    }
}
