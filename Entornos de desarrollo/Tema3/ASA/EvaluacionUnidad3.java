public class EvaluacionUnidad3 {
    /*
     * Evaluación de la unidad 3
     * 
     * Instrucciones de realización
     * 
     * Hay que aplicar el patrón de testing
     * n 3 pasos: Arrange, Act, Assert.
     * 
     * Haz tantos tests como consideres
     * oportuno (mínimo 2 para cada función)
     * 
     * Si alguna función no supera los test,
     * depura para encontrar errores lógicos y
     * soluciónalos.
     * 
     * Este módulo no es el de programación,
     * aquí lo más importante son los tests y
     * es lo que más puntúa. Si alguna función
     * se te atranca, haz solamente los
     * tests y pasa a la siguiente y deja la
     * corrección del error para el final.
     */

    /*
     * Ejercicio 1
     * Estamos desarrollando una aplicación para
     * registrar equipos de volley playa.
     * En los torneos de volley playa, una de las
     * categorías es la de "juveniles".
     * Para participar en la categoría de juveniles,
     * la suma de las edades de los jugadores del
     * equipo debe ser menor o igual a 35 años.

     * Implementa una función que compruebe si dos
     * jugadores cumplen este requisito. La función
     * recibirá 2 números enteros que representan
     * las edades y devolverá un booleano indicando
     * si su suma es menor o igual a 35.
     * 
     * Ejemplo:
     * si recibe: 17, 15
     * debe devolver: true

     * Tareas:

     * Diseña los tests que consideres necesarios.
     * Justifica los valores de prueba elegidos.
     */
    public static boolean sumaEdades(int ageOne, int ageTwo){
        if (ageOne + ageTwo <= 35) {
            return true;
        }else{
            return false;
        }
    }





    /*
     * Ejercicio 2
     * Necesitamos una función a la reciba 2
     * números enteros y devuelta un String
     * que diga si el primero es mayor que 5, 
     * el segundo es mayor que 5 o ambos son mayores 5.
     * 
     * Ejemplo:
     * si recibe: 6, 8
     * debe devolver: "ambos son mayores que 5"
     */
    public static String numerosMayoresQueCinco(int numOne, int numTwo){
        if (numOne > 5 && numTwo > 5) {
            return "Ambos son mayores que cinco";
        }else if (numOne <= 5 && numTwo > 5){
            return "El segundo es mayor que 5";
        }else if (numOne > 5 && numTwo <= 5){
            return "El primero es mayor que 5";
        }else {
            return "Ninguno es mayor que 5";
        }
    }



    

    /*
     * Ejercicio 3
     * Haz tests para la siguiente función que cuenta
     * cuántas vocales (incluyendo mayúsculas y
     * vocales con tildes: a, e, i, o, u, á, é, í, ó, ú)
     * contiene una frase.
     * 
     * Si encuentras errores, corrige el código hasta
     * que supere todos los tests. No contaremos la "y"
     * como vocal.
     * 
     * Ejemplo: Si recibe la frase "Unió calma y pasión."
     * debe devolver 5.
     */
    public static int cuentaVocales(String phrase) {
        int vocals = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = Character.toLowerCase(phrase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                vocals++;
            }
        }
        // El código original tenía un fallo. Devolvía "vocales -1", lo he corregido para que de un resultado correcto.
        return vocals;
    }
}          