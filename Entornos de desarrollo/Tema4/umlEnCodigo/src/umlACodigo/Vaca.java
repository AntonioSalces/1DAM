package umlACodigo;

public class Vaca extends Animal implements IHerviboro{
    public Vaca(Especie especie, int numeroAdultos, Granja granja) {
        super(especie, granja, numeroAdultos);
    }

    public void relacionarse() {
        System.out.println("Me estoy relacionando");
    }

    @Override
    public void buscarPlantas() {
        System.out.println("Estoy buscando plantas");
    }
}
