import org.junit.Assert;
import org.junit.Test;

public class EvaluacionUnidad3Test {
    @Test
    public void sumaVeteranos1(){
        int edadUno = 40;
        int edadDos = 45;
        boolean resultadoEsperado = false;

        boolean resultadoReal = EvaluacionUnidad3.sumaVeteranos(edadUno, edadDos);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void sumaVeteranos2(){
        int edadUno = 41;
        int edadDos = 45;
        boolean resultadoEsperado = true;

        boolean resultadoReal = EvaluacionUnidad3.sumaVeteranos(edadUno, edadDos);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numMayorOMenor1(){
        int numUno = 1;
        int numDos = 5;
        String resultadoEsperado = "El primero es menor.";

        String resultadoReal = EvaluacionUnidad3.numMayorOMenor(numUno, numDos);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numMayorOMenor2(){
        int numUno = 5;
        int numDos = 1;
        String resultadoEsperado = "El primero es mayor.";

        String resultadoReal = EvaluacionUnidad3.numMayorOMenor(numUno, numDos);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numMayorOMenor3(){
        int numUno = 3;
        int numDos = 3;
        String resultadoEsperado = "Ambos son iguales.";

        String resultadoReal = EvaluacionUnidad3.numMayorOMenor(numUno, numDos);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numEspacios1(){
        String frase = "¡Hola mundo!";
        int resultadoEsperado = 1;

        int resultadoReal = EvaluacionUnidad3.numEspacios(frase);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void numEspacios2(){
        String frase = "Adiós, mundo cruel.";
        int resultadoEsperado = 2;

        int resultadoReal = EvaluacionUnidad3.numEspacios(frase);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
