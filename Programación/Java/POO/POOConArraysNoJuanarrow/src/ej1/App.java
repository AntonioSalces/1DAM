package ej1;
import ej1.clases.Agenda;

public class App {
    private static void menu() {
        System.out.println("""
                AGENDA
                ======
                1. Agregar un contacto
                2. Eliminar un contacto
                3. Mostrar la agenda
                4. Buscar un contacto
                5. Salir""");
    }
    public static void main(String[] args) throws Exception {
        Agenda miAgenda = new Agenda(5);

        int opcion;

        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            String nombre;
            switch (opcion) {
                case 1:
                    System.out.println("¿A quien quiere agregar?");
                    nombre = System.console().readLine();
                    miAgenda.agregarContacto(nombre);
                    break;

                case 2:
                    System.out.println("¿A quién quiere eliminar?");
                    nombre = System.console().readLine();
                    miAgenda.eliminarContacto(nombre);
                    break;
                    
                case 3:
                    miAgenda.mostrarContactos();
                    break;

                case 4:
                    System.out.println("¿A quien quiere encontar?");
                    nombre = System.console().readLine();
                    miAgenda.buscarContacto(nombre);
                    break;
            
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
