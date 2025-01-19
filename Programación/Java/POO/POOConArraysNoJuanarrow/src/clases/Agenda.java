package clases;

public class Agenda {
    private String[] contactos;
    private int cantidadContactos;

    public Agenda(int tamanio){
        this.contactos = new String[tamanio];
        this.cantidadContactos = 0;
    }

    public boolean agregarContacto(String nombre){
        if (cantidadContactos < contactos.length) {
            contactos[cantidadContactos] = nombre;
            cantidadContactos++;
            return true;
        }else{
            System.out.println("La agenda ya está llena. Elimine contactos o cree una nueva");
            return false;
        }
    }

    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < cantidadContactos; i++) {
            if (contactos[i].equalsIgnoreCase(nombre)) {
                // Desplazar los elementos a la izquierda para eliminar el contacto
                for (int j = i; j < cantidadContactos - 1; j++) {
                    contactos[j] = contactos[j + 1];
                }
                contactos[cantidadContactos - 1] = null;
                cantidadContactos--;
                System.out.println("El contacto se ha eliminado correctamente");
                return true;
            }
        }
        System.out.println("No se ha podido eliminar el contacto");
        return false;
    }

    public void mostrarContactos(){
        if (cantidadContactos == 0) {
            System.out.println("No hay contactos en la agenda");
        }else {
            System.out.println("Contactos en la agenda: ");
            for (int i = 0; i < cantidadContactos; i++) {
                System.out.println((i + 1) + ". " + contactos[i]);
            }
        }
    }

    public boolean buscarContacto(String nombre){
        for (int i = 0; i < cantidadContactos; i++) {
            if (contactos[i].equalsIgnoreCase(nombre)) {
                System.out.println("El contacto " + nombre + " se ha encontrado en la posición número " + (i+1));
                return true;
            }
        }
        System.out.println("El contacto no está en la agenda");
        return false;
    }


}
