package ej1.clases;

import java.awt.Color;
import java.util.Date;

public class Persona {
    private String nombre;
    private String apellidos;
    private float altura;
    private float peso;
    private Date fechaNacimiento;
    private Color colorPelo;
    private String saludo;

    public void crecer(float cantidad){
        altura += cantidad;
    }

    public void saludar(){
        System.err.println(saludo);
    }

    public void decir(String frase){
        System.out.println(frase);
    }

    public void bautizar(String nuevoNombre, String nuevosApellidos){
        
    }

    public int preguntarEdad(){

        return 0;
    }
}
