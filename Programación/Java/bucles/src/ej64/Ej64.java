package ej64;

public class Ej64 {
    public static void pintarRectangulo(int altura, int anchura){
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= anchura; j++){
                if (i == 1 || j == 1 || i == altura || j ==  anchura){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rectangulo (){
        int altura = 3;
        int anchura = 6;
        pintarRectangulo(altura, anchura);
        int seleccion = 0;
        
        while (seleccion != 4) {
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique que quiere hacer con el rectángulo: ");
            seleccion = Integer.parseInt(System.console().readLine());
            switch (seleccion) {
                case 1:
                    altura++;
                    anchura++;
                    break;
                case 2:
                    altura--;
                    anchura--;
                    break;
                case 3:
                    int aux = altura;
                    altura = anchura;
                    anchura = aux;
                case 4:
                    break;
                default:
                    break;
            }
            if (altura == 1 || anchura == 1 && seleccion == 2){
                System.out.println("El rectángulo no se puede achicar más.");
                anchura = 5;
                altura = 2;
            }else{
                pintarRectangulo(altura, anchura);
            }
        }
    }
}
