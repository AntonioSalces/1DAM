package bloque2.ej3;

import bloque2.ej3.clases.ColeccionDiscos;
import bloque2.ej3.clases.Disco;

public class App {
    public static void menu(){
        System.out.print("""
                COLECCIÓN DE DISCOS
                ===================
                1. Listado
                2. Nuevo disco
                3. Modificar
                4. Borrar
                5. Salir
                Introduzca una opción: """);
    }

    public static void listar(ColeccionDiscos coleccion){
        Disco[] discos = coleccion.consultar();
        for (int i = 0; i < discos.length; i++)
            if (discos != null)
            System.out.println(discos[i]);
    }

    private static void crear(){
        System.out.println("""
                NUEVO DISCO
                ===========
                Por favor, introduzca los datos del disco.
                """);
        System.out.print("Título: ");
        String titulo = System.console().readLine();
        System.out.print("Autor: ");
        String autor = System.console().readLine();
        System.out.print("Genero: ");
        String genero = System.console().readLine();
        System.out.print("Duración: ");
        int duracion = Integer.parseInt(System.console().readLine());
        Disco d = coleccion.crear(new Disco(autor, titulo, genero, duracion));
        if(d==null){
            System.out.println("No hay suficiente espacion en la colección para un nuevo disco");
        }
        else{
            System.out.printf("Disco %s creado corréctamente%n", d.getCodigo());
        }
    }



    private static ColeccionDiscos coleccion = new ColeccionDiscos(4);

    public static void main(String[] args) {
        
        Disco disco1 = new Disco("a", "a", "a", 3);
        Disco disco2 = new Disco("b", "b", "b", 6);
        Disco disco3 = new Disco("c", "c", "c", 9);
        coleccion.crear(disco1);
        coleccion.crear(disco2);
        coleccion.crear(disco3);
        
        int opcion;
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    listar(coleccion);
                    break;

                case 2:
                    crear();
                    break;
            
                default:
                    break;
            }
        } while (opcion != 5);
        
    }

    
}

