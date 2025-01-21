package ej1;

import ej1.clases.Almacen;
import ej1.clases.Articulo;
import ej1.clases.ArticuloAlimenticio;
import ej1.clases.ArticuloTecnologico;

public class App {
    private static void menu(){
        System.out.print("""
                G E S T I S I M A L
                ===================
                1. Listado
                2. Alta
                3. Baja
                4. Modificación
                5. Entrada de mercancía
                6. Salida de mercancía
                7. Salir
                Introduzca una opción: """);
    }

    private static void altaArticulos(){
        System.out.print("Introduce la descripcion: ");
        String descripcion = System.console().readLine();
        System.out.println();
        System.out.print("Introduce el precio de compra: ");
        float precioCompra = Float.parseFloat(System.console().readLine());
        System.out.println();
        System.out.print("Introduce el precio de venta: ");
        float precioVenta = Float.parseFloat(System.console().readLine());
        System.err.println("""
                Se trata de:
                1. Artículo genérico
                2. Articulo informático
                3. Articulo alimenticio
                """);
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion == 1 || opcion == 2 || opcion == 3) {
            switch (opcion) {
                case 1:
                    almacen.alta(new Articulo(descripcion, precioCompra, precioVenta));
                    break;

                case 2:
                    System.err.print("Introduce el tiempo de garantia (meses): ");
                    int garantia = Integer.parseInt(System.console().readLine());
                    System.err.println();
                    System.err.print("Introduce el tipo de producto: ");
                    String tipo = System.console().readLine();
                    System.out.println();
                    almacen.alta(new ArticuloTecnologico(descripcion, precioCompra, precioVenta, garantia, tipo));
                    break;

                case 3:
                    System.out.print("Introduce la fecha de caducidad (YYYY-MM-DD): ");
                    String fechaCaducidad = System.console().readLine();
                    System.out.println();
                    System.out.print("Introduce la temperatura de consevacion: ");
                    float temperaturaConservacion = Float.parseFloat(System.console().readLine());
                    System.out.println();
                    almacen.alta(new ArticuloAlimenticio(descripcion, precioCompra, precioVenta, fechaCaducidad, temperaturaConservacion));
                
                default:
                    break;
            }
        }
    }

    private static void bajaArticulos(){
        System.out.print("Inserte la descripcion del producto: ");
        String descripcion = System.console().readLine();
        System.out.println();
        almacen.baja(descripcion);
    }

    private static void incrementar(){
        System.out.print("Introduzca la descripción del artículo: ");
        String descripcion = System.console().readLine();
        System.out.println();
        System.out.print("Introduzca en cuanto quiere incrementar el stock: ");
        int stock = Integer.parseInt(System.console().readLine());
        System.out.println();
        almacen.incrementarStock(descripcion, stock);
    }

    private static void decrementar(){
        System.out.print("Introduzca la descripción del artículo: ");
        String descripcion = System.console().readLine();
        System.out.println();
        System.out.print("Introduzca en cuanto quiere decrementar el stock: ");
        int stock = Integer.parseInt(System.console().readLine());
        System.out.println();
        almacen.decremetarStock(descripcion, stock);
    }

    public static Almacen almacen = new Almacen(10);

    public static void main(String[] args){
        int opcion;
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    almacen.listar();
                    break;

                case 2:
                    altaArticulos();
                    break;

                case 3:
                    bajaArticulos();
                    break;

                case 4:
                    almacen.modificar();
                    break;

                case 5:
                    incrementar();
                    break;

                case 6:
                    decrementar();
                    break;
            
                default:
                    break;
            }
        } while (opcion != 7);
    }
}
