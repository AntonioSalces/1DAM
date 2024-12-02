package com.alanturing.Ejercicio1;

import com.alanturing.Ejercicio1.animal.Animal;
import com.alanturing.Ejercicio1.persona.Persona;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona persona = new Persona("Paco", "Aguilar Gutierrez", 29, "72431224E");
        Animal perro = new Animal("Chucho", 8, "Pitbull", persona);
        persona.Saludar();
        perro.imprimirInformacion();
    }
}

/*Hecho por Antonio Lorenzo */