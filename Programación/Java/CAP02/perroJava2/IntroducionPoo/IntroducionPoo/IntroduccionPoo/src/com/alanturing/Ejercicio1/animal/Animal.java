package com.alanturing.Ejercicio1.animal;

import com.alanturing.Ejercicio1.persona.Persona;

public class Animal{
    private String nombre;
    private int edad;
    private String raza;
    private Persona dueno; //Esto seria dueño pero recordar no usar ñ

    public Animal(String nombre, int edad,String raza, Persona persona){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.dueno = persona;
    }

    /**
     * Recordar que los setters solo los ponemos para aquellas variables que se pueden modificar, en nombre
     * puedo llamar a una persona que se llame francisco de formas diferentes como Paco, paquillo, pacomermela etc..
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Con los getters obtenemos el valor de la variable ya que al ser private necesitamos utilizar estos metodos para obtener
     * su valor
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * En los restantes variables no usamos setters debido a que los siguientes variables no se pueden modificar en la vida real
     * aunque tu para ligar con una tia quieras aparentar mas edad la edad que tienes es la que aparece en tu dni es decir tu edad real
     * @return
     */

    public int getEdad() {
        return edad;
    }

    /**
     * Lo mismo pasa con la raza puedes decir que eres negro cuando eres blanco, o en este caso de los perros tu perro no puede ser un 
     * chiguagua y un labrador
     * @return
     */
    public String getRaza() {
        return raza;
    }


    //Ponemos tipo void porque no devuelve nada solo imprime mensaje
    public void Saludar(){
        System.out.printf("Wau Wau Wau Wau");
    }

    public void Caminar(){
        System.out.printf("Llevo caminando %d metros y estoy cansadoo..",500);
    }

    public void imprimirInformacion(){
        System.out.printf("Hola me llamo %s, tengo %d años, soy de raza %s y mi dueño es: %s", getNombre(), getEdad(), getRaza(), dueno.getNombre());
    }
}