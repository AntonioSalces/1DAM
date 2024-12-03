public class StringUtils {
    //Crear la firma, que es todo el contenido menos lo que hay entre las llaves
    public static String reverseWord(String palabra){
        String palabraInvertida = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabraInvertida = palabraInvertida + palabra.charAt(i);
		}   
        return palabraInvertida;
    }

    public static boolean palíndromo(String palabra){
        boolean esPalindromo = false;
        String palabraInvertida = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			palabraInvertida = palabraInvertida + palabra.charAt(i);
		}   

        if (palabra.equals(palabraInvertida)){
            esPalindromo = true;
        }
        return esPalindromo;
    }

    public static int numConsonantes(String palabra){
        int contConsonantes = 0;
        char letra = ' ';
        for (int i = 0; i <= palabra.length()-1; i++){
            letra = palabra.toLowerCase().charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u'){
                contConsonantes++;
            }
        }
        return contConsonantes;
    }

    public static boolean palabraMayuscula(String palabra){
        if (palabra.toUpperCase() == palabra) {
            return true;
        }else{
            return false;
        }
    }
}