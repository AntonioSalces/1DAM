package comparacionEnteros;
import org.junit.Assert;
import org.junit.Test;

public class ComparacionesEnterosTest {
    @Test
    public void testAlMenosUnoPositivoV1() {
        int a = -5;
        int b = 2;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testAlMenosUnoPositivoV2() {
        int a = -5;
        int b = -2;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsDivisibleV1() {
        int a = 4;
        int b = 2;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.esDivisible(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsDivisibleV2() {
        int a = 52;
        int b = 3;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.esDivisible(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsDivisibleV3() {
        int a = 52;
        int b = 0;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.esDivisible(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMayorV1() {
        int a = 5;
        int b = 2;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.esMayor(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMayorV2() {
        int a = 7;
        int b = 15;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.esMayor(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMenorV1() {
        int a = -5;
        int b = 17;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.esMenor(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testEsMenorV2() {
        int a = 18;
        int b = 10;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.esMenor(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSonAmbosParesV1() {
        int a = 18;
        int b = 10;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.sonAmbosPares(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSonAmbosParesV2() {
        int a = 6;
        int b = 1;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.sonAmbosPares(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSonIgualesV1() {
        int a = 2;
        int b = 4;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.sonIguales(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSonIgualesV2() {
        int a = 4;
        int b = 4;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.sonIguales(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSumaEsParV1() {
        int a = 11;
        int b = 23;
        boolean resultadoEsperado = true;

        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSumaEsParV2() {
        int a = 12;
        int b = 23;
        boolean resultadoEsperado = false;

        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
