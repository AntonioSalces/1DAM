package ej10.clases;

public class Ameba {
    private int peso;

    public Ameba(){
        peso = 3;
    }

    public void come(int cantidad){
        peso += cantidad-1;
    }

    public void come(Ameba a){
        peso += a.peso-1;
        a.peso = 0;
    }

    @Override
    public String toString() {
        
        return String.format("Soy una ameba y peso %d microgramos", peso);
    }
}
