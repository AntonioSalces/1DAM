package ej2.fuera;

import ej2.dentro.Superclase;

public class ClaseHerenciaFuera extends Superclase {
    public boolean claseHerenciaFueraPublico;
    private boolean claseHerenciaFueraPrivado;
    protected boolean claseHerenciaFueraProtegido;
    boolean claseHerenciaFueraPaquete;

    public void probarVisibilidadSuperclase(){
        superclasePublico = true;
        superclaseProtegido = true;
    }
}
