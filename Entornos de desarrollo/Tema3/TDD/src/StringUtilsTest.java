import org.junit.Test;
import org.junit.Assert;

public class StringUtilsTest {
    
    @Test
    public void reverseWordAmigo(){
        //Arrange
        String palabra = "amigo";
        String resultadoEsperado = "ogima";

        //Act
        String resultadoReal = StringUtils.reverseWord(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraPalindromaV1(){
        String palabra = "amigo";
        boolean resultadoEsperado = false;

        boolean resultadoReal = StringUtils.palíndromo(palabra);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void palabraPalindromaV2(){
        String palabra = "reconocer";
        boolean resultadoEsperado = true;

        boolean resultadoReal = StringUtils.palíndromo(palabra);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numerConsonantes(){
        String palabra = "amigo";
        int resultadoEsperado = 2;

        int resultadoReal = StringUtils.numConsonantes(palabra);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
