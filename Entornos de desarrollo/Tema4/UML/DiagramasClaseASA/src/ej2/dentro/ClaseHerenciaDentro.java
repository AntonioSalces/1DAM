package ej2.dentro;

public class ClaseHerenciaDentro extends Superclase{
    public boolean claseHerenciaDentroPublico;
    private boolean claseHerenciaDentroPrivado;
    protected boolean claseHerenciaDentroProtegido;
    boolean claseHerenciaDentroPaquete;

    public void probarVisibilidadSuperclase(){
        superclasePublico = true;
        superclaseProtegido = true;
        superclasePaquete = true;
    }
}
