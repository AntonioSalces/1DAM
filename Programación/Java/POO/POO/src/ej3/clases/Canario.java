package ej3.clases;

public class Canario extends Ave{
    private boolean jugueton;
    private int tamaño;

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setJugueton(boolean jugueton){
        this.jugueton = jugueton;
    }

    public boolean getJugueton(){
        return jugueton;
    }

    public String cantidadVuelo(){
        if (this.tamaño < 10) {
            return "Soy capaz de volar sin parar 2 kilómetros";
        }else if (this.tamaño < 20){
            return "Soy capaz de volar sin parar 3 kilómetros";
        }else{
            return "Soy capaz de volar sin parar 5 kilómetros";
        }  
    }
    
    public String esJugueton(){
        if(this.jugueton == true){
            return "Me encanta jugar";
        }else{
            return "Dejame tranquilo";
        }
    }
}
