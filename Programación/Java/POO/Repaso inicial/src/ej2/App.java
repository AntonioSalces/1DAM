package ej2;

import ej2.clases.CuentaBancaria;

public class App {
    public static void main(String[] args) {
        CuentaBancaria antonio = new CuentaBancaria("1234567890", 0, "Antonio");
        int opcion;
        do {
        System.out.println("Indica que quiere hacer:");
        System.out.println("1. Operar con la cuenta");
        System.out.println("2. Salir");
        opcion = Integer.parseInt(System.console().readLine());
        switch (opcion) {
            case 1:
                antonio.operarCuenta();
                break;
            default:
                break;
        }
        } while (opcion != 2);
    }
}
