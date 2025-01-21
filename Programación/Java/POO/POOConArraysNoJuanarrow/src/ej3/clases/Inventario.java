package ej3.clases;

public class Inventario {
    private Producto[] almacen;
    private int posicion;

    public Inventario(int tamanio){
        almacen = new Producto[tamanio];
        posicion = 0;
    }

    public void agregarProducto(){
        if (posicion >= almacen.length) {
            System.out.println("No hay más espacio en el almacen.");
        } else {
            System.out.println("""
                AÑADIR PRODUCTO
                ===============""");
            System.out.print("Indica el nombre del producto: ");
            String nombre = System.console().readLine();
            System.out.print("Indica el precio del producto: ");
            float precio = Float.parseFloat(System.console().readLine());
            System.out.print("Indica el stock del producto: ");
            int stock = Integer.parseInt(System.console().readLine());

            almacen[posicion] = new Producto(nombre, precio, stock);
            posicion++;
            System.out.println("Producto agregado correctamente.\n");
        }
    }

    public void quitarProducto(){
        System.out.println("""
                ELIMINAR PRODUCTO
                =================""");
        System.out.print("Indica el nombre del producto a eliminar: ");
        String nombre = System.console().readLine();
        int contador = 0;

        while (contador < posicion) {
            if (almacen[contador] != null && almacen[contador].getNombre().equals(nombre)) {
                for (int i = contador; i < posicion - 1; i++) {
                    almacen[i] = almacen[i + 1];
                }
                almacen[posicion - 1] = null;  // Limpiar la última posición
                posicion--;
                System.out.println("Producto eliminado correctamente.\n");
                return;
            }
            contador++;
        }
        System.out.println("Producto no encontrado.\n");
    }

    public void actualizarStock(){
        System.out.println("""
                ACTUALIZAR STOCK
                ================""");
        System.out.print("Indica el producto a modificar el stock: ");
        String nombre = System.console().readLine();
        
        for (int i = 0; i < posicion; i++) {
            if (almacen[i] != null && almacen[i].getNombre().equals(nombre)) {
                System.out.print("Indica el nuevo stock del producto: ");
                almacen[i].setCantidadEnStock(Integer.parseInt(System.console().readLine()));
                System.out.println("Stock actualizado correctamente.\n");
                return;
            }
        }
        System.out.println("Producto no encontrado.\n");
    }

    public void productosConBajoStock(){
        System.out.println("""
                PRODUCTOS CON BAJO STOCK
                ========================""");
        boolean hayBajoStock = false;
        for (int i = 0; i < posicion; i++) {
            if (almacen[i] != null && almacen[i].getCantidadEnStock() < 5) {
                System.out.println(almacen[i]);
                hayBajoStock = true;
            }
        }
        if (!hayBajoStock) {
            System.out.println("No hay productos con bajo stock.\n");
        }
    }

    public void buscarPorNombre(){
        System.out.println("""
                BUSCAR POR NOMBRE
                =================""");
        System.out.print("Indica a continuación el producto que buscas: ");
        String producto = System.console().readLine();
        
        boolean encontrado = false;
        for (int i = 0; i < posicion; i++) {
            if (almacen[i] != null && almacen[i].getNombre().equals(producto)) {
                System.out.println(almacen[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.\n");
        }
    }

    public void calcularValorInventario(){
        System.out.println("""
                CALCULAR VALOR INVENTARIO
                =========================""");
        float valor = 0;
        for (int i = 0; i < posicion; i++) {
            if (almacen[i] != null) {
                valor += almacen[i].getPrecio() * almacen[i].getCantidadEnStock();
            }
        }
        System.out.println("El valor total del inventario es: " + valor + "\n");
    }

    public void listar(){
        System.out.println("""
                LISTA DE PRODUCTOS
                ==================""");
        if (posicion == 0) {
            System.out.println("El inventario está vacío.\n");
            return;
        }
        for (int i = 0; i < posicion; i++) {
            if (almacen[i] != null) {
                System.out.println(almacen[i]);
            }
        }
        System.out.println();
    }
}
