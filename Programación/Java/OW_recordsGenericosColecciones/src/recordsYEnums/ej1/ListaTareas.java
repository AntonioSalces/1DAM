package recordsYEnums.ej1;

import java.util.Arrays;

public class ListaTareas {
    private Tarea[] tareas;
    private int numeroTareas;

    public ListaTareas() {
        tareas = new Tarea[10];
        numeroTareas = 0;
    }

    public ListaTareas(int tamanio) {
        tareas = new Tarea[tamanio];
        numeroTareas = 0;
    }

    public ListaTareas(Tarea[] t) {
        tareas = t.clone();
        numeroTareas = t.length;
    }

    public int getNumeroTareas() {
        return numeroTareas;
    }

    public void setNumeroTareas(int numeroTareas) {
        this.numeroTareas = numeroTareas;
    }

    public Tarea[] getTareas() {
        return tareas.clone();
    }

    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas.clone();
    }

    public Tarea agregarTarea(Tarea t) {
        if (numeroTareas >= tareas.length) {
            tareas = Arrays.copyOf(tareas, numeroTareas + 10);
        }

        tareas[numeroTareas++] = t;

        return t;
    }

    public void mostrarTareas() {
        System.out.println("TAREAS");
        System.out.println("======");
        for (int i = 0; i < numeroTareas; i++) {
            System.out.println(tareas[i]);
        }
    }
}
