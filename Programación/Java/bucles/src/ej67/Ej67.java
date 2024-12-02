package ej67;

public class Ej67 {
    public static void imprimirEscaleras(){
        System.out.print("Introduzca el número de escalones: ");
        int numEscalones = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de cada escalón (debe de ser 4 o múltiplo de 4): ");
        int altEscalones = Integer.parseInt(System.console().readLine());
        String numAst = "****";
        for (int i = 1; i <= numEscalones; i++){
            for (int j = 1; j <= altEscalones; j++){
                System.out.println(numAst);
                if (j / altEscalones != 0){
                    numAst+="****";
                }
            }
        }
    }

    public static void escaleras(){
        try {
        imprimirEscaleras();
        }catch (NumberFormatException e)  {
            System.out.println("Introduce un número válido.");
            imprimirEscaleras();  
        }catch (Exception e){
            System.out.print("Ha ocurrido un error desconocido.");
        }
    }
}
