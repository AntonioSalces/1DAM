public class EvaluacionUnidad3 {
    /*
     * Evaluación de la unidad 3
     * 
     * Instrucciones de realización
     * 
     * Hay que aplicar el patrón de testing
     *  en 3 pasos: Arrange, Act, Assert.
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
     * Ejercicio 1:
     * Estamos realizando una aplicación para
     * organizar torneos de Pádel. El pádel
     * es un deporte que se juega por parejas,
     * como quizás ya sabías.
     * 
     * Cuando se organiza un torneo hay varias
     * categorías, y una de ellas es la
     * categoría de veteranos. Para poder
     * participar en la categoría de veteranos,
     * la suma de las edades de los 2 jugadores
     * de la pareja debe ser superior a 85.
     * Pues, necesitamos hacer una función que
     * compruebe precisamente eso, que la
     * suma de las edades de los 2 componentes
     * sea superior a 85. Por tanto,
     * recibirá 2 enteros que representarán las
     * edades y devolverá un boolean que
     * indique si suman 85 o más años.
     * 
     * Realiza los tests que consideres oportunos
     * y explica por qué has elegido esos
     * valores de prueba y no otros.
     */
    public static boolean sumaVeteranos(int edadUno, int edadDos) {
        int edadTotal = edadUno + edadDos;
        if (edadTotal > 85) {
            return true;
        }else{
            return false;
        }
    }





    /*
     * Ejercicio 2
     * Necesitamos una función a la reciba 2
     * números enteros y devuelta un String
     * que diga si el primero es mayor, menor
     * o igual que el segundo. Por tanto, los
     * 3 resultados posibles son:
     * 
     * - "El primero es mayor."
     * - "El primero es menor."
     * - "Ambos son iguales."
     */
    public static String numMayorOMenor(int numUno, int numDos) {
        if (numUno < numDos){
            return "El primero es menor.";
        }else if (numUno > numDos){
            return "El primero es mayor.";
        }else{
            return "Ambos son iguales.";
        }
    }






    /*
     * Ejercicio 3
     * Haz tests para la siguiente función que
     * un compañero de tu trabajo ha
     * desarrollado. Si tiene algún error corrígelo,
     * hasta que superes los tests que
     * has diseñado.
     * 
     * Los que tiene que hacer la función es recibir
     * una frase y devolver el número
     * de espacios en blanco que contiene. Por ejemplo:
     * Si recibe la frase: "¡Hola mundo!" debe
     * devolver 1
     * Si recibe la frase "Adiós, mundo cruel."
     * debe devolver 2.
     */
    public static int numEspacios(String frase) {
        int contEspacios = 0;
        for(int i = frase.length()-1; i >= 0; i--){
            if (frase.charAt(i) == ' ') {
                contEspacios++;
            }
        }
        return contEspacios;
    }

}