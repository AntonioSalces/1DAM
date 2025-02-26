package interfaces.ej1;

public abstract class Documento implements Validable{
    protected int size;

    public Documento(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
