package proyectoFinal.hotel.economia;

import java.time.LocalDate;
import java.util.Arrays;

import proyectoFinal.hotel.personas.Cliente;
import proyectoFinal.hotel.personas.Huesped;
import proyectoFinal.hotel.habitaciones.Habitacion;

public class Reserva implements Cobrable{

    private LocalDate fechaInicio;
    private int numeroDias;
    private Cliente cliente;
    private Huesped[] huesped;
    private Habitacion habitacion;

    public Reserva(LocalDate fechaInicio, int numeroDias, Cliente cliente, Huesped[] huesped, Habitacion habitacion) {
        this.fechaInicio = fechaInicio;
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.huesped = huesped.clone();
        this.habitacion = habitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaInicio.plusDays(numeroDias);
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Huesped[] getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped[] huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public double getImporte() {
        return habitacion.getPrecio() * numeroDias;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
        result = prime * result + numeroDias;
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + Arrays.hashCode(huesped);
        result = prime * result + ((habitacion == null) ? 0 : habitacion.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        if (fechaInicio == null) {
            if (other.fechaInicio != null)
                return false;
        } else if (!fechaInicio.equals(other.fechaInicio))
            return false;
        if (numeroDias != other.numeroDias)
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (!Arrays.equals(huesped, other.huesped))
            return false;
        if (habitacion == null) {
            if (other.habitacion != null)
                return false;
        } else if (!habitacion.equals(other.habitacion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Reserva [fechaInicio=" + fechaInicio + ", numeroDias=" + numeroDias + ", cliente=" + cliente
                + ", huesped=" + Arrays.toString(huesped) + ", habitacion=" + habitacion + "]";
    }
}