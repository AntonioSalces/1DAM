/*
 * Ejercicio 4: Tienda de Mascotas (Genéricos + POO)
 * Crea una tienda de mascotas usando genéricos.

 * Requisitos:
 * Crea una clase Mascota con:
 * Atributos: nombre, edad.
 * Constructor y toString().
 * Crea dos clases Perro y Gato que hereden de Mascota.
 * Crea una clase Tienda<T extends Mascota> con:
 * Un ArrayList<T>.
 * Método agregarMascota(T m).
 * Método mostrarMascotas().
 * Desde main(), crea una Tienda<Perro> y una Tienda<Gato>, agrega algunas mascotas y muéstralas.
 */

package ejCano;

import java.util.ArrayList;

public class Tienda<T extends Animal> {
    private ArrayList<T> animales = new ArrayList<>();

    public void agrergarMascota(T m) {
        if (m != null) {
            animales.add(m);
            System.out.println("La mascota se ha agregado correctamente");
        } else {
            System.out.println("No se ha podido agregar tu mascota");
        }
    }

    public void mostrarMascotas() {
        if (animales.isEmpty()) {
            System.out.println("No hay ningún animal ");
        } else {
            for(T animal : animales) {
                System.out.println(animal);
            }
        }
    }
}
