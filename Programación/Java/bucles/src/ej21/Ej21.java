/*
Realiza un programa que vaya pidiendo números hasta que se 
cuantos números se han introducido, la media de los impares y el 
sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */

package ej21;

public class Ej21 {
    public static void numerosPareseImpares() {
        double numero = 0;
        double impar = 0;
        int contadorGeneral = 0;
        int contadorImpares = 0;
        double aux1 = 0;
        double aux2 = 0;
        System.out.println("Por favor, vaya introduciendo números enteros.%n Puede terminar mediante la introducción de un número negativo.");
        while (numero >= 0) {
            numero = Integer.parseInt(System.console().readLine());
            contadorGeneral++;
            if (numero % 2 == 0) {
                aux1 = numero;
                if (aux1 > aux2) {
                    aux2 = aux1;
                }
            }else{
                impar += numero;
                contadorImpares++;
                if (numero<0) {
                    impar+=numero;
                }
                impar /= contadorImpares;
            }
        }
        contadorGeneral--;

        System.out.println("Ha introducido "+contadorGeneral+" números positivos");
        System.out.printf("La media de los impares es de %.2f%n",impar);
        System.out.printf("El máximo de los pares es %.2f",aux2);
    }
}
