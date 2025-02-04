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

public class EjCano {
    public static void main(String[] args) {
        Tienda<Perro> tiendaPerro = new Tienda<>();
        Tienda<Gato> tiendaGato = new Tienda<>();

        tiendaPerro.agrergarMascota(new Perro("barto", 8));
        tiendaGato.agrergarMascota(new Gato("miau", 2));
        tiendaPerro.agrergarMascota(new Perro("ratilla", 3));

        System.out.println("Perros: ");
        tiendaPerro.mostrarMascotas();

        System.out.println("Gatos: ");
        tiendaGato.mostrarMascotas();

    }
}
