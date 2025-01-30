package ejDuro;

public class Vaca extends Animal implements Hervíboro{

    @Override
    public void buscarPlantas() {
        System.out.println("Estoy buscando plantas");
    }

    @Override
    public void relacionarse() {
        System.out.println("Me estoy relacionando");
    }
}
