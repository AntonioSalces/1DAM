package ej5.clases;

public class Pizza {
    private String tipo;
    private String tamaño;
    private boolean servida;
    private static int totalPedidas;
    private static int totalServidas;

    public Pizza(String tipo, String tamaño){
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.servida = false;
        totalPedidas++;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public void sirve(){
        if (!servida) {
            servida = true;
            totalServidas++;
        }else
            System.out.println("esa pizza ya se ha servido");
        
    }

    @Override
    public String toString() {
        return String.format("pizza %s %s, %s", tipo, tamaño, servida?"servida":"pedida");
    }
}

