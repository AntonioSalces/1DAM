package interfaces.ej1;

public class ServicioValidacion {
    private Validable[] ficheros;
    private int numeroFicheros;

    public ServicioValidacion() {
        ficheros = new Validable[10];
        numeroFicheros = 0;
    }

    public ServicioValidacion(Validable[] d) {
        ficheros = d.clone();
        numeroFicheros = d.length;
    }

    public ServicioValidacion(int tamanio) {
        ficheros = new Validable[tamanio];
        numeroFicheros = 0;
    }

    public boolean validarFicheros() {
        boolean ret = true;
        for(int i = 0; i < numeroFicheros; i++) {
            ret = ret && ficheros[i].isValid();
        }
        return ret;
    }

    public static boolean validar(Validable v) {
        return v.isValid();
    }
}
