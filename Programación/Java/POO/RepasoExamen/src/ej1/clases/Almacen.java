package ej1.clases;

public class Almacen {
    private Articulo[] inventario;
    private int stock;
    private int posicion;

    public Almacen(int tamanio){
        inventario = new Articulo[tamanio];
        posicion = 0;
    }

    public Articulo[] getInventario() {
        return inventario;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void listar(){
    System.out.println("Entrando en el método listar");
    System.out.println("Listado de artículos:");
    for (int i = 0; i < inventario.length; i++) {
        System.out.println("Comprobando posición " + i);
        if (inventario[i] != null) {
            System.out.println("Posición " + i + ": " + inventario[i]);
        } else {
            System.out.println("Posición " + i + ": Vacío");
        }
    }
    System.out.println("Saliendo del método listar");
}

    
    

    public void alta(Articulo n){
        inventario[posicion] = n;
        posicion++;
    }

    public void baja(String descripcion){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].getDescripcion().equals(descripcion)) {
                inventario[i] = null;
            }
        }
        for (int i = 0; i < inventario.length - 1; i++) {
            if (inventario[i] == null) {
                inventario[i] = inventario[i + 1];
                inventario[i + 1] = null;
            }
        }
        posicion--;
    }   

    public void modificar(){
        System.out.print("Introduzca la descripción del artículo a modificar: ");
        System.out.println();
        String descripcion = System.console().readLine();
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getDescripcion().equals(descripcion)) {
                System.out.print("Introduce la nueva descripcion: ");
                String desc = System.console().readLine();
                System.out.println();
                System.out.print("Introduce el nuevo precio de compra: ");
                float precioCompra = Integer.parseInt(System.console().readLine());
                System.out.println();
                System.out.println("Introduce el nuevo precio de venta: ");
                float precioVenta = Integer.parseInt(System.console().readLine());
                System.out.println();
                Articulo articulo = new Articulo(desc, precioCompra, precioVenta);
                inventario[i] = articulo;
            }
        }
    }

    public void incrementarStock(String descripcion, int stock){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getDescripcion().equals(descripcion) && inventario[i] != null) {
                inventario[i].setStock(inventario[i].getStock() + stock);
            }
        }
    }

    public void decremetarStock(String descripcion, int stock){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getDescripcion().equals(descripcion)) {
                inventario[i].setStock(inventario[i].getStock() - stock);
            }
        }
    }
}