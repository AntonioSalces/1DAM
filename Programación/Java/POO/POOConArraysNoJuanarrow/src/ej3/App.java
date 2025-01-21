package ej3;

import ej3.clases.Inventario;

public class App {
    private static void menu(){
        System.out.println("""
                1. Agregar producto
                2. Eliminar producto
                3. Actualizar stock
                4. Consultar productos con bajo stock (<5)
                5. Consultar por nombre
                6. Calcular valor total inventario
                7. Listar inventario
                8. Salir
                """);
    }

    private static Inventario almacen = new Inventario(5);

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    almacen.agregarProducto();
                    break;

                case 2: 
                    almacen.quitarProducto();
                    break;

                case 3:
                    almacen.actualizarStock();
                    break;

                case 4:
                    almacen.productosConBajoStock();
                    break;

                case 5:
                    almacen.buscarPorNombre();
                    break;

                case 6:
                    almacen.calcularValorInventario();
                    break;

                case 7:
                    almacen.listar();
                    break;

                default:
                    break;
            }
        } while (opcion != 8);
    }
}
