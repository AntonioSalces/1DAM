    /*
    * Implementa el control de acceso al área restringida de un programa. 
    * Se debe pedir un nombre de usuario y una contraseña. 
    * Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. 
    * El usuario tendrá un máximo de 3 oportunidades. 
    * Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
    * Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap.
    */

    package ej6;

    import java.util.HashMap;

    public class Ej6 {
        public static void main(String[] args) {
            HashMap<String, String> usuarios = new HashMap<String, String>();
            int tries = 3;
            usuarios.put("Nena", "UwU");
            usuarios.put("Nene", "Cabrita");

            while (tries > 0) {
            System.out.println("LOGIN\n-----");
            System.out.print("Usuario: ");
            String usuario = System.console().readLine();
            System.out.println();
            System.out.print("Contraseña: ");
            String contraseña = System.console().readLine();
            System.out.println();
            if (usuarios.get(usuario) != null && usuarios.get(usuario).equals(contraseña)) {
                System.out.println("Bienvenido al área restringida");
                break;
            }else{
                System.out.println("Usuario o contraseña no válidos");        
                tries--;
                System.out.printf("Te quedan %d intentos%n", tries);
            }
            }
            if (tries == 0) {
                System.out.println("Lo siento, no tiene acceso al área restringida");
            }
        }
    }
