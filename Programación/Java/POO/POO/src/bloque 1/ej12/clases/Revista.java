package ej12.clases;

public class Revista extends Publicacion{
    private int codigo;

    public Revista(String isbn, String titulo, int añoPubicacion, int codigo){
        super(isbn, titulo, añoPubicacion);
        this.codigo = codigo;
    }
}
