package ej3;

import ej3.clases.Circulo;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Áre del circulo: " + circulo.calcularArea());
    }
}
