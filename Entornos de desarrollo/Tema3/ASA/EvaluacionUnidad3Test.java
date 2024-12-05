import org.junit.Assert;
import org.junit.Test;

public class EvaluacionUnidad3Test {
    // Prueba con los valores dados en el enunciado
    @Test
    public void sumaEdades1(){
        //Arrange
        int ageOne = 17;
        int ageTwo = 15;
        boolean expectedResult = true;

        //Act
        boolean realResult = EvaluacionUnidad3.sumaEdades(ageOne, ageTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba con un valor límite
    @Test
    public void sumaEdades2(){
        //Arrange
        int ageOne = 20;
        int ageTwo = 15;
        boolean expectedResult = true;

        //Act
        boolean realResult = EvaluacionUnidad3.sumaEdades(ageOne, ageTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba con otro valor límite
    @Test
    public void sumaEdades3(){
        //Arrange
        int ageOne = 20;
        int ageTwo = 16;
        boolean expectedResult = false;

        //Act
        boolean realResult = EvaluacionUnidad3.sumaEdades(ageOne, ageTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }


    // Prueba con los valores dados en el enunciado
    @Test
    public void numerosMayoresQueCinco1(){
        //Arrange
        int numOne = 6;
        int numTwo = 8;
        String expectedResult = "Ambos son mayores que cinco";

        //Act
        String realResult = EvaluacionUnidad3.numerosMayoresQueCinco(numOne, numTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba con un valor límite
    @Test
    public void numerosMayoresQueCinco2(){
        //Arrange
        int numOne = 6;
        int numTwo = 6;
        String expectedResult = "Ambos son mayores que cinco";

        //Act
        String realResult = EvaluacionUnidad3.numerosMayoresQueCinco(numOne, numTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba con otro valor límite
    @Test
    public void numerosMayoresQueCinco3(){
        //Arrange
        int numOne = 6;
        int numTwo = 5;
        String expectedResult = "El primero es mayor que 5";

        //Act
        String realResult = EvaluacionUnidad3.numerosMayoresQueCinco(numOne, numTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba con otro valor límite
    @Test
    public void numerosMayoresQueCinco4(){
        //Arrange
        int numOne = 5;
        int numTwo = 6;
        String expectedResult = "El segundo es mayor que 5";

        //Act
        String realResult = EvaluacionUnidad3.numerosMayoresQueCinco(numOne, numTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba con otro valor límite
    @Test
    public void numerosMayoresQueCinco5(){
        //Arrange
        int numOne = 5;
        int numTwo = 5;
        String expectedResult = "Ninguno es mayor que 5";

        //Act
        String realResult = EvaluacionUnidad3.numerosMayoresQueCinco(numOne, numTwo);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }


    // Prueba con los valores dados en el enunciado
    @Test
    public void cuentaVocales1(){
        //Arrange
        String phrase = "Unió calma y pasión.";
        int expectedResult = 8;

        //Act
        int realResult = EvaluacionUnidad3.cuentaVocales(phrase);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba para ver si da fallo si tiene 0 vocales
    @Test
    public void cuentaVocales2(){
        //Arrange
        String phrase = " ";
        int expectedResult = 0;

        //Act
        int realResult = EvaluacionUnidad3.cuentaVocales(phrase);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }

    // Prueba para comprobar si hay algun fallo si mezclas mayúsculas con minúsculas
    @Test
    public void cuentaVocales3(){
        //Arrange
        String phrase = "PrUebA con AlguNas voCalES en MINuscUlA y OtrAs en MInuSculAS";
        int expectedResult = 22;

        //Act
        int realResult = EvaluacionUnidad3.cuentaVocales(phrase);

        //Assert
        Assert.assertEquals(expectedResult, realResult);
    }
}
