package ej3.clases;

public class Animal {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String comer(String comida){
        return "Estoy comiendo " + comida;
    }

    public String dormir(){
        return "Estoy durmiendo";
    }

    public String conseguirColor(){
        return "Soy de color " + this.color;
    }
}
