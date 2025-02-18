package umlACodigo;

public abstract class Animal {
    protected Especie especie;
    public static int numeroAdultos;
    private Granja granja;

    public Animal(Especie especie, Granja granja, int numeroAdultos) {
        this.especie = especie;
        this.granja = granja;
        Animal.numeroAdultos = numeroAdultos;
    }

    public abstract void relacionarse();
}
