package bloque2.ej4.clases;

import bloque2.ej3.clases.ColeccionDiscos;
import bloque2.ej3.clases.Disco;

public class ColeccionDiscosConFiltro extends ColeccionDiscos implements ListadosFiltros{
    public ColeccionDiscosConFiltro(int tamanio){
        super(tamanio);
    }

    @Override
    public Disco[] consultarPorAutor(String autor) {
        Disco[] discosFiltrados = new Disco[discos.length];
        int ultimo = 0;
        for(int i = 0; i < discos.length; i++){
            if(discos[i].getAutor().equals(autor)){
                discosFiltrados[ultimo]= discos[i];
                ultimo++;
            }
        }
        return discosFiltrados;
    }

    @Override
    public Disco[] consultarPorTitulo(String titulo) {
        Disco[] discosFiltrados = new Disco[discos.length];
        int ultimo = 0;
        for(int i = 0; i < discos.length; i++){
            if(discos[i].getTitulo().equals(titulo)){
                discosFiltrados[ultimo]= discos[i];
                ultimo++;
            }
        }
        return discosFiltrados;
    }

    @Override
    public Disco[] consultarPorGenero(String genero) {
        Disco[] discosFiltrados = new Disco[discos.length];
        int ultimo = 0;
        for(int i = 0; i < discos.length; i++){
            if(discos[i].getGenero().equals(genero)){
                discosFiltrados[ultimo]= discos[i];
                ultimo++;
            }
        }
        return discosFiltrados;
    }

    @Override
    public Disco[] consultarPorDuracion(int minDuracion, int maxDuracion) {
        Disco[] discosFiltrados = new Disco[discos.length];
        int ultimo = 0;
        for(int i = 0; i < discos.length; i++){
            if(discos[i].getDuracion()>=minDuracion &&
            discos[i].getDuracion()<=maxDuracion){
                discosFiltrados[ultimo]= discos[i];
                ultimo++;
            }
        }
        return discosFiltrados;
    }   
}
