package ej2.dentro;

public class Superclase {
    public boolean superclasePublico;
    private boolean superclasePrivado;
    protected boolean superclaseProtegido;
    boolean superclasePaquete;

    public void probarVisibilidadSuperclase(){
        superclasePublico = true;
        superclasePrivado = true;
        superclaseProtegido = true;
        superclasePaquete = true;
    }
}
