/*
 * Crea la clase Vehiculo, así como las clases Bicicleta y 
 * Coche como subclases de la primera. Para la clase 
 * Vehiculo, crea los atributos de clase vehiculosCreados y 
 * kilometrosTotales, así como el atributo de instancia 
 * kilometrosRecorridos. Crea también algún método 
 * específico para cada una de las subclases.
Prueba las clases creadas mediante un programa con un 
menú como el que se muestra en el ejemplo:
Ejemplo:
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
1
¿Cuántos kilómetros quiere recorrer? 20
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
2
Estoy haciendo el caballito
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
3
¿Cuántos kilómetros quiere recorrer? 300
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
1
¿Cuántos kilómetros quiere recorrer? 26
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
5
La bicicleta lleva recorridos
46 Km
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
3
¿Cuántos kilómetros quiere recorrer? 300
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
1
¿Cuántos kilómetros quiere recorrer? 26
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
5
La bicicleta lleva recorridos
46 Km
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
7
Los vehículos llevan recorridos
346 Km
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
8
 */

package ej2;

import ej2.clases.Bicicleta;
import ej2.clases.Coche;
import ej2.clases.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        int opcion;
        do {
            System.out.println();
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());
            int km;

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuántos kilómetros quiere recorrer?");
                    km = Integer.parseInt(System.console().readLine());
                    bicicleta.recorrerDistancia(km);
                    break;

                case 2:
                    System.out.println(bicicleta.caballito());
                    break;

                case 3:
                    System.out.println("¿Cuántos kilómetros quiere recorrer?");
                    km = Integer.parseInt(System.console().readLine());
                    coche.recorrerDistancia(km);
                    break;

                case 4: 
                    System.out.println(coche.quemarRueda()); 
                    break;

                case 5:
                    System.out.println("La bicicleta lleva recorridos " + bicicleta.getKilometrosRecorridos() + " kilometros.");
                    break;

                case 6:
                    System.out.println("El coche lleva recorridos " + coche.getKilometrosRecorridos() + " kilometros.");
                    break;

                case 7:
                    System.out.println("Ambos vehículos llevan en total " + Vehiculo.getKilometrosTotales() + " kilometros.");
                    break;
                    
                default:
                    break;
            }
        } while (opcion != 8);
    }
}
