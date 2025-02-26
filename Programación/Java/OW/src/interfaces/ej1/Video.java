package interfaces.ej1;

public abstract class Video implements Validable{
    protected int length;

    public Video(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
