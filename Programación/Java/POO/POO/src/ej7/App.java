package ej7;

import ej7.clases.Zona;

public class App {
    public static void main(String[] args) {
        Zona z1 = new Zona(1000);
        Zona z2 = new Zona(200);
        Zona z3 = new Zona(15);
        int opcion;
        do {
            System.out.println("EXPLOCOCHES MÁLAGA");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.println("En la zona principal hay " + z1.getEntradasPorVender());
                    System.out.println("En la zona de compra venta hay " + z2.getEntradasPorVender());
                    System.out.println("En la zona VIP hay " + z3.getEntradasPorVender());
                    break;
            
                case 2:
                    System.out.println("1. Principal");
                    System.out.println("2. Compra-venta");
                    System.out.println("3. VIP");
                    System.out.print("Elige una opción: ");
                    int _opcion = Integer.parseInt(System.console().readLine());
                    System.out.print("¿Cuántas entradas quieres?: ");
                    int entradas = Integer.parseInt(System.console().readLine());
                    switch (_opcion) {
                        case 1:
                            z1.vender(entradas);
                            break;

                        case 2:
                            z2.vender(entradas);
                            break;

                        case 3:
                            z3.vender(entradas);
                            break;
                    
                        default:
                            break;
                    }

                default:
                    break;
            }
        } while (opcion != 3);
    }
}
