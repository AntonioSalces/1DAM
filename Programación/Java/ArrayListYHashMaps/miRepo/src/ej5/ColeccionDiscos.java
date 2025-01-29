package ej5;

import java.util.ArrayList;

public class ColeccionDiscos {
    private ArrayList<Disco> discos;

    public ColeccionDiscos (int tamanio) {
        discos = new ArrayList<Disco>();
    }

    public Disco[] listar () {
        Disco[] ret = new Disco[discos.size()];
        discos.toArray(ret);
        return ret;
    }

    public Disco crear (Disco d) {
        discos.add(d);
        return d;
    }

    public Disco consultarPorID (String id) {
        int index = discos.indexOf(new Disco(id));
        return index==-1?null:discos.get(index);
    }

    public Disco actualizar(String id, Disco d) {
        int index = discos.indexOf(new Disco(id));
        if(index!=-1){
            Disco anterior = discos.get(index);
            discos.set(index, d);
            return anterior;
        }
        return null;
    }

    public Disco borrar (String id) {
        int index = discos.indexOf(new Disco(id));
        if (index != -1) {
           Disco anterior = discos.get(index);
           discos.remove(index);
           return anterior; 
        }
        return null;
    }
}
