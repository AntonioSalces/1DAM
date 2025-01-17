package bloque2.ej4juanan.clases;

import bloque2.ej3juanan.clases.Disco;

public interface ListadosFiltros {
    public Disco[] consultarPorAutor(String autor);
    public Disco[] consultarPorTitulo(String titulo);
    public Disco[] consultarPorGenero(String genero);
    public Disco[] consultarPorDuracion(int minDuracion, int maxDuracion);
}
