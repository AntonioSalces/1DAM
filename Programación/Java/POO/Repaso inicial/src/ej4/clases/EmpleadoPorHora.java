package ej4.clases;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaPorHora){
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario(){
        return getHorasTrabajadas() * getTarifaPorHora();
    }
}
