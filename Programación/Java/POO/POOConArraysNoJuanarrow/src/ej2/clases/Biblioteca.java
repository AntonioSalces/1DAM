package ej2.clases;

public class Biblioteca {
    private Libro[] libreria;
    
    public Biblioteca(int tamanio){
        libreria = new Libro[tamanio];
    }

    public Libro[] getLibreria() {
        return libreria;
    }

    public int encontrarHueco(){
        int hueco = -1;
        int posicion = 0;

        while (hueco == -1 && posicion < libreria.length) {
            if (libreria[posicion] == null) {
                hueco = posicion;
                return hueco;
            }
            posicion++;
        }

        return hueco;
    }

    public Libro agregarLibro (Libro libro){
        int indice = encontrarHueco();

        if (indice == -1) {
            System.out.println("No se puede agregar el libro");
        }else{
            libreria[indice] = libro;
            return libro;
        }

        return libro;
    }

    public void mostrarLibros(){
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i] != null) {
                System.out.println(i+1 + ". " + libreria[i]);
            }
        }
    }

    public void prestarLibro(Libro libro){
        if (libro.getDisponible() == true){
            libro.setDisponible(false);
        }else{
            System.out.println("El libro ya está prestado");
        }
    }

    public void devolverLibro(Libro libro){
        if (libro.getDisponible() == false){
            libro.setDisponible(true);
        }else{
            System.out.println("El libro ya está devuelto");
        }
    }

    public String buscarLibro(String titulo){
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i].getTitulo() == titulo) {
                return "El libro está en la posición " + i;
            }
        }
        return "No se ha encontrado el libro";
    }
}
