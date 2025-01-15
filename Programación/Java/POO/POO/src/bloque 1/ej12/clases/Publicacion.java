package ej12.clases;

public abstract class Publicacion {
    private String isbn;
    private String titulo; 
    private int añoPubicacion;
    
    public Publicacion(String isbn, String titulo, int añoPubicacion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.añoPubicacion = añoPubicacion;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, título: %s, año de publicación: %d", isbn, titulo, añoPubicacion);
    }
}
