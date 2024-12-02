package ej36;

public class Ej36 {

    public static int longitud (int valor){
        int _longitud = 0;
        while (valor!=0) {
            valor/=10;
            _longitud++;
        }
        return _longitud;
    }

    public static int voltear (int valor){
        int volteado = 0;
        while (valor!=0){
            volteado = (volteado * 10) + (valor%10);
            valor/=10;
        }
        return volteado;
    }

    public static void capicua () {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        final int NUMORIGINAL = num;
        num = num * 10 + 1;
        num = voltear(num);
        num = num * 10 + 1;
        num = voltear(num);
        int numVolteado = voltear(num);
        boolean esCapicua = true;
        while (num != 0) {
            if (num % 10 == numVolteado % 10){
                num/=10;
                numVolteado/=10;
            }else{
                esCapicua=false;
                num = num / (int)Math.pow(10, longitud(num));
            }
        }
        if (esCapicua == true) {
            System.err.printf("El %d es capicúa", NUMORIGINAL);
        }else{
            System.err.printf("El %d no es capicúa", NUMORIGINAL);
        }
    }
}
