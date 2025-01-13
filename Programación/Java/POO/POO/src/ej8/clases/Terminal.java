package ej8.clases;

public class Terminal {
    private int numero;

    public Terminal(int numero){
        this.numero = numero;
    }

    @Override
    public toString(){
        return String.format("%s", numero);
    }
}