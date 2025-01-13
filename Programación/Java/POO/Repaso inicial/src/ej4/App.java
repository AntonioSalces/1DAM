package ej4;

import ej4.clases.Empleado;
import ej4.clases.EmpleadoPorHora;

public class App {
    public static void main(String[] args) {
        EmpleadoPorHora porHoras = new EmpleadoPorHora("Antonio Salces Alcaraz", 160, 8);
        Empleado fijo = new Empleado();
        fijo.setSalario(3000);
        System.out.println("El salario del fijo es de " + fijo.getSalario());
        porHoras.setHorasTrabajadas(160);
        porHoras.setTarifaPorHora(8.5);
        System.out.println("El salario del por horas es de " + porHoras.calcularSalario());
    }
}
