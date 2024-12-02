package operacionesMixtas;
import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {
    @Test
    public void testBooleanComoTextoV1() {
        boolean valor = true;
        String resultadoEsperado = "verdadero";

        String resultadoReal = OperacionesMixtas.booleanComoTexto(valor);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testBooleanComoTextoV2() {
        boolean valor = false;
        String resultadoEsperado = "falso";

        String resultadoReal = OperacionesMixtas.booleanComoTexto(valor);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testCambiarTextoAMayusculasV1() {
        boolean aMayusculas = true;
        String texto = "Hola";
        String resultadoEsperado = "HOLA";

        String resultadoReal = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testCambiarTextoAMayusculasV2() {
        boolean aMayusculas = false;
        String texto = "Hola";
        String resultadoEsperado = "hola";

        String resultadoReal = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testConcatenarNumeroTextoV1() {
        int numero = 5;
        String texto = "manzanas";
        String resultadoEsperado = "5 manzanas";

        String resultadoReal = OperacionesMixtas.concatenarNumeroTexto(numero, texto);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testConcatenarNumeroTextoV2() {
        int numero = 8;
        String texto = "manzanas rojas";
        String resultadoEsperado = "8 manzanas rojas";

        String resultadoReal = OperacionesMixtas.concatenarNumeroTexto(numero, texto);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }


    @Test
    public void testConcatenarTextosV1() {
        String texto1 = "Hola,";
        String texto2 = "Mundo";
        String resultadoEsperado = "Hola, Mundo";

        String resultadoReal = OperacionesMixtas.concatenarTextos(texto1, texto2);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testConcatenarTextosV2() {
        String texto1 = "He sacado en Entornos de Desarrollo un";
        String texto2 = "10";
        String resultadoEsperado = "He sacado en Entornos de Desarrollo un 10";

        String resultadoReal = OperacionesMixtas.concatenarTextos(texto1, texto2);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testDescripcionConFloatV1() {
        float valor1 = 3.14f;
        float valor2 = 2.71f;
        String resultadoEsperado = "Los valores son: 3.14€ y 2.71€";

        String resultadoReal = OperacionesMixtas.descripcionConFloat(valor1, valor2);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testDescripcionConFloatV2() {
        float valor1 = -3.32f;
        float valor2 = -76.34f;
        String resultadoEsperado = "Los valores son: -3.32€ y -76.34€";

        String resultadoReal = OperacionesMixtas.descripcionConFloat(valor1, valor2);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testDescripcionNumeroV1() {
        int numero = 5;
        String resultadoEsperado = "El número es positivo";

        String resultadoReal = OperacionesMixtas.descripcionNumero(numero);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testDescripcionNumeroV2() {
        int numero = -7;
        String resultadoEsperado = "El número es negativo";

        String resultadoReal = OperacionesMixtas.descripcionNumero(numero);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testDescripcionNumeroV3() {
        int numero = 0;
        String resultadoEsperado = "El número es cero";

        String resultadoReal = OperacionesMixtas.descripcionNumero(numero);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFormatearNumeroV1() {
        float numero = 17.89945f;
        int decimales = 2;
        String resultadoEsperado = "17,90";

        String resultadoReal = OperacionesMixtas.formatearNumero(numero, decimales);
        
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFormatearNumeroV2() {
        float numero = 15.556f;
        int decimales = 2;
        String resultadoEsperado = "15,56";

        String resultadoReal = OperacionesMixtas.formatearNumero(numero, decimales);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}