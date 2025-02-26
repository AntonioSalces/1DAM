package recordsYEnums;

import java.time.LocalDate;

import recordsYEnums.ej1.ListaTareas;
import recordsYEnums.ej1.Tarea;

public class App {
    public static void main(String[] args) {
        ListaTareas lt = new ListaTareas(2);

        lt.agregarTarea(new Tarea("Clase de coche", "Clase de coche a las 16 pm", LocalDate.of(2025, 02, 26)));
        lt.agregarTarea(new Tarea("Clase de coche", "Clase de coche a las 16 pm", LocalDate.of(2025, 02, 26)));
        lt.agregarTarea(new Tarea("Clase de coche", "Clase de coche a las 16 pm", LocalDate.of(2025, 02, 26)));

        lt.mostrarTareas();
    }
    
}
