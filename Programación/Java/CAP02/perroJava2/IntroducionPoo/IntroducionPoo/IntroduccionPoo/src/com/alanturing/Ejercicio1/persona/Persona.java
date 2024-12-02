package com.alanturing.Ejercicio1.persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni; //Dni es String porque tenemos que añadir una letra al finar 

    public Persona(String nombre, String apellidos, int edad, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void Saludar(){
        System.out.printf("Hola soy %s %s, tengo %d años\n",getNombre(),getApellidos(),getEdad());
    }
}
