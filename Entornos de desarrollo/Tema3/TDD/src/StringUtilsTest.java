import org.junit.Test;
import org.junit.Assert;

public class StringUtilsTest {
    
    @Test
    public void reverseWordV1(){
        //Arrange
        String palabra = "amigo";
        String resultadoEsperado = "ogima";

        //Act
        String resultadoReal = StringUtils.reverseWord(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void reverseWordV2(){
        //Arrange
        String palabra = "anticonstitucionalmente";
        String resultadoEsperado = "etnemlanoicutitsnocitna";

        //Act
        String resultadoReal = StringUtils.reverseWord(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraPalindromaV1(){
        //Arrange
        String palabra = "amigo";
        boolean resultadoEsperado = false;

        //Act
        boolean resultadoReal = StringUtils.palíndromo(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraPalindromaV2(){
        //Arrange
        String palabra = "reconocer";
        boolean resultadoEsperado = true;
        
        //Act
        boolean resultadoReal = StringUtils.palíndromo(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numConsonantesV1(){
        //Arrange
        String palabra = "amigo";
        int resultadoEsperado = 2;

        //Act
        int resultadoReal = StringUtils.numConsonantes(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numConsonantesV2(){
        //Arrange
        String palabra = "transgredir";
        int resultadoEsperado = 8;

        //Act
        int resultadoReal = StringUtils.numConsonantes(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraMayusculaV1(){
        //Arrange
        String palabra = "HOLA";
        boolean resultadoEsperado = true;

        //Act
        boolean resultadoReal = StringUtils.palabraMayuscula(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraMayusculaV2(){
        //Arrange
        String palabra = "hola";
        boolean resultadoEsperado = false;

        //Act
        boolean resultadoReal = StringUtils.palabraMayuscula(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraMayusculaV3(){
        //Arrange
        String palabra = "HoLA";
        boolean resultadoEsperado = false;

        //Act
        boolean resultadoReal = StringUtils.palabraMayuscula(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
