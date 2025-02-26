package proyectoFinal.hotel.gestion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;

import proyectoFinal.hotel.habitaciones.Habitacion;
import proyectoFinal.hotel.economia.Reserva;
import proyectoFinal.hotel.habitaciones.HabitacionDoble;
import proyectoFinal.hotel.habitaciones.Suite;
import proyectoFinal.hotel.personas.Cliente;
import proyectoFinal.hotel.personas.Huesped;

public class Hotel {
    private Habitacion[] habitaciones;
    private Reserva[] reservas;
    private int cantidadReservas;

    public Hotel() {
        habitaciones = new Habitacion[10];
        reservas = new Reserva[100];
        cantidadReservas = 0;
        init();
    }

    private void init() {
        for(int i = 0; i < 8; i ++) {
            int numero = i + 1;
            String descripcion = "Habitación doble estándar";
            habitaciones[i] = new HabitacionDoble(numero, descripcion);
        }

        String[] nombreSuites = {"Mil y una noches", "Palacio Dorado"};

        Random random = new Random();
        for(int i = 0; i < 2; i++) {
            int numero = 9 + i;
            String descripcion = "Suite de lujo";
            String nombre = "Suite" + nombreSuites[i];
            int plazas = random.nextInt(3) + 3;
            String servicioExtra = "Servicio de minibar, Acceso gratuito al spa";
            habitaciones[i+8] = new Suite(numero, descripcion, nombre, plazas, servicioExtra);
        }
    }

    public Reserva agregarReserva(Cliente cliente, Huesped[] huespedes, LocalDate fechaInicio, int numeroDias, Habitacion habitacion) {
        if (cantidadReservas >= reservas.length){
            reservas = Arrays.copyOf(reservas, cantidadReservas + 10);
        }

        Reserva r = new Reserva(fechaInicio, numeroDias, cliente, huespedes, habitacion);
        reservas[cantidadReservas++] = r;
        return r;
    }

    public void mostrarReservas() {
        if (cantidadReservas == 0) {
            System.out.println("Aún no hay reservas");
        }

        for(int i = 0; i < cantidadReservas; i++) {
            Reserva r = reservas[i];
            System.out.println(reservas[i]);
            System.out.println("RESERVA");
            System.out.println(r.getCliente().getNombre());
            System.out.println(r.getCliente().getDni());
            System.out.println(r.getHuesped().length +1);
            System.out.println(r.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(r.getFechaFin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(r.getNumeroDias());
            System.out.println(r.getImporte());
            System.out.println();
        }
        System.out.println();
    }
}