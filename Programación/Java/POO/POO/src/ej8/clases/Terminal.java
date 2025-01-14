package ej8.clases;

public class Terminal {
    private String numero;
    private int tiempoEnLlamada;

    public Terminal(String numero){
        this.numero = numero;
        tiempoEnLlamada = 0;
    }

    public void llama(Terminal t, int segundos){
        tiempoEnLlamada += segundos;
        t.tiempoEnLlamada += segundos;
    }

    @Override
    public String toString() {
        return String.format("No %s - %ds de conversación", numero, tiempoEnLlamada);
    }

}
