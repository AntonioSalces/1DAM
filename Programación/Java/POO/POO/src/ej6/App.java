package ej6;

import ej6.clases.Tiempo;

public class App {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0, 30, 40);
        Tiempo t2 = new Tiempo(0, 35, 20);
        Tiempo t3 = new Tiempo(1, 20, 30);
        System.out.println(t3 + " + " + t1 + " = " + t3.suma(t1));
        System.out.println(t1 + " - " + t2 + " = " + t1.restar(t2));

    }
}
