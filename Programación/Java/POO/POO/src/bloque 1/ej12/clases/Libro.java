package ej12.clases;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String isbn, String titulo, int añoPubicacion){
        super(isbn, titulo, añoPubicacion);
        prestado = false;
    }

    @Override
    public void presta(){
        prestado = true;
    }

    @Override
    public void devuelve(){
        prestado = false;
    }

    @Override
    public boolean estaPrestado(){
        return prestado;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), prestado?" (prestado)":" (no prestado)");
    }
}
