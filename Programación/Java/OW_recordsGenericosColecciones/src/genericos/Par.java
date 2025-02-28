package genericos;

public class Par<T, U>{
    private T o1;
    private U o2;
    
    public Par(T o1, U o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public T getO1() {
        return o1;
    }

    public void setO1(T o1) {
        this.o1 = o1;
    }

    public U getO2() {
        return o2;
    }

    public void setO2(U o2) {
        this.o2 = o2;
    }

    public static <T,U> Par<T, U> of (T o1, U o2) {
        return new Par<>(o1, o2);
    }

    @Override
    public String toString() {
        return "Par [o1=" + o1 + ", o2=" + o2 + "]";
    }

    
}
