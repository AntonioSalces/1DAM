package umlACodigo;

public class Tigre extends Animal implements ICarnivoro{
    public Tigre(Especie especie, int numeroAdultos, Granja granja) {
        super(especie, granja, numeroAdultos);
    }

    public void relacionarse() {
        System.out.println("Me estoy relacionando");
    }

    @Override
    public void cazar() {
        System.out.println("Estoy cazando");
    }
}
