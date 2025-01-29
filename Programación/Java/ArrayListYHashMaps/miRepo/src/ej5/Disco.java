package ej5;

public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private double duracion;

    private String generarCodigo(int tamanio){
        String codigo = "";
        char MIN_LETRA = 'A';
        char MAX_LETRA = 'Z';
        char MIN_NUMERO = '0';
        char MAX_NUMERO = '9';

        for (int i = 0; i < tamanio; i++) {
            if (Math.random() < 0.5) {
                char letra = (char)(Math.random() * (MAX_LETRA - MIN_LETRA + 1) + MIN_LETRA);
                codigo += letra;
            } else {
                char numero = (char)(Math.random() * (MAX_NUMERO - MIN_NUMERO + 1) + MIN_NUMERO);
                codigo += numero;
            }
        }

        return codigo;
    }

    public Disco(String codigo){
        this.codigo = codigo;
    }

    public Disco(String autor, String titulo, String genero, double duracion){
        codigo = generarCodigo(6);
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCod() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }
    
    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return String.format(
            """
            ------------------------------------------
            Código: %s
            Autor: %s
            Título: %s
            Género: %s
            Duracion: %.2f
            ------------------------------------------
            """, codigo, autor, titulo, genero, duracion);
    }

    @Override
    public boolean equals(Object obj) {
        return this.codigo.equals(((Disco)obj).codigo);
    }
    
}

