package ej4.clases;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(){
        this.nombre = "";
        this.salario = 0.0;
    }

    public Empleado(String nombre){
        this.nombre = nombre;
        this.salario = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;   
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }
}
