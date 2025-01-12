package ej3.clases;

public class Gato extends Mamifero{
    private boolean arisco;

    public boolean getArisco(){
        return arisco;
    }

    public void setArisco(boolean arisco){
        this.arisco = arisco;
    }

    public String personalidad(){
        if (this.arisco) {
            return "Soy arisco";
        } else{
            return "Soy un gatito bueno";
        }
    }
}
