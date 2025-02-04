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

public class Perro extends Animal{
    
    public Perro (String nombre, int edad) {
        super(nombre, edad);
    }
}
