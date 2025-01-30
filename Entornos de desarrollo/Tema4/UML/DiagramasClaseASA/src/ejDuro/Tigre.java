package ejDuro;

public class Tigre extends Animal implements Carnívoro{

    @Override
    public void cazar() {
        System.out.println("Estoy intentando cazar");
    }

    @Override
    public void relacionarse() {
        System.out.println("Me estoy relacionando");
    }
}

