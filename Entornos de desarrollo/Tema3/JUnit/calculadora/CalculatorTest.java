package calculadora;

import org.junit.Assert;

import org.junit.Test;
    /*
     * Usar un assert
     * 
     * Los assert son métodos que trae la librería
     * JUnit que permiten comprobar si el resultado
     * es correcto.
     * 
     * en el caso de la funcion suma, comparamos el
     * resultado que esperamos con el resultado que
     * realmente devuelve la función
    */

public class CalculatorTest {
    @Test
    public void testSuma_2_y_3() {
        //Arrange
        int sumando1 = 2;
        int sumando2 = 3;
        int sumaTotal = 5;
        Calculator calculator = new Calculator();

        //Act
        int resultadoReal = calculator.suma(sumando1, sumando2);

        //Assert
        Assert.assertEquals(sumaTotal, resultadoReal);
    }



    @Test
    public void testSuma_12_y_menos7() {
        //Arrange
        int sumando1 = 12;
        int sumando2 = -7;
        int sumaTotal = 5;
        Calculator calculator = new Calculator();

        //Act
        int resultadoReal = calculator.suma(sumando1, sumando2);

        //Assert
        Assert.assertEquals(sumaTotal, resultadoReal);
    }



    @Test
    public void testResta_12_y_5() {
        //Arrange
        int minuendo = 12;
        int sustraendo = 5;
        int diferencia = 7;

        //Act
        Calculator calculator = new Calculator();
        int resultadoReal = calculator.resta(minuendo, sustraendo);

        //Assert
        Assert.assertEquals(diferencia, resultadoReal);
    }

    @Test
    public void testResta_7_y_menos7() {
        //Arrange
        int minuendo = 7;
        int sustraendo = -7;
        int diferencia = 14;

        //Act
        Calculator calculator = new Calculator();
        int resultadoReal = calculator.resta(minuendo, sustraendo);

        //Assert
        Assert.assertEquals(diferencia, resultadoReal);
    }



    @Test
    public void testMultiplicacion_7_y_9() {
        //Arrange
        int factor1 = 7;
        int factor2 = 9;
        int producto = 63;

        //Act
        Calculator calculator = new Calculator();
        int resultadoReal = calculator.multiplica(factor1, factor2);

        //Assert
        Assert.assertEquals(producto, resultadoReal);
    }

    @Test
    public void testMultiplicacion_5_y_2() {
        //Arrange
        int factor1 = 5;
        int factor2 = 2;
        int producto = 10;

        //Act
        Calculator calculator = new Calculator();
        int resultadoReal = calculator.multiplica(factor1, factor2);

        //Assert
        Assert.assertEquals(producto, resultadoReal);
    }


    @Test
    public void testDivision_27_y_3() {
        //Arrange
        int dividendo = 27;
        int divisor = 3;
        int cociente = 9;

        //Act
        Calculator calculator = new Calculator();
        int resultadoReal = calculator.divide(dividendo, divisor);

        //Assert
        Assert.assertEquals(cociente, resultadoReal);
    }

    @Test
    public void testDivision_84_y_7() {
        //Arrange
        int dividendo = 84;
        int divisor = 7;
        int cociente = 12;

        //Act
        Calculator calculator = new Calculator();
        int resultadoReal = calculator.divide(dividendo, divisor);

        //Assert
        Assert.assertEquals(cociente, resultadoReal);
    }
}