package proyectoFinal.hotel.habitaciones;

import proyectoFinal.hotel.economia.Precios;

public class HabitacionDoble extends Habitacion{
    public HabitacionDoble(int numero, String descripcion) {
        super(numero, Precios.PRECIO_DOBLE, descripcion);
    }
}
