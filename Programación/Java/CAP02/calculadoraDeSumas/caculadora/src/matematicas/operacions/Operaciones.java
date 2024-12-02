package matematicas.operacions;

public class Operaciones {
    public static int suma (int a, int b) {
        return a + b;
    }

    public static int resta (int a, int b) {
        return suma(a, -b);
    }

    public static int multiplicacion (int a, int b) {
        int cont = 0;
        int res = 0;
        for (res=0; cont<b; cont++) {
            res = res + a;
        }
        return res;
    }

    public static int cociente (int a, int b) {
        int veces = 0;
        while (a>=b) {
            a = resta(a, b);
            veces++;
        }
        return veces;
    }

    public static int resto (int a, int b) {
        while (a>=b) {
            a = resta(a, b);
        }
        return a;
    }


}