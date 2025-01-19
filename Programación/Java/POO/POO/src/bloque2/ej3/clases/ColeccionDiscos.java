package bloque2.ej3.clases;

public class ColeccionDiscos {
    private Disco[] discos;

    public ColeccionDiscos(int tamanio){
        discos = new Disco[tamanio];
    }

    private static int encontrarHueco(Disco[] disco){
        int hueco = -1;
        int posicion = 0;

        while(posicion < disco.length && disco[posicion] != null){
            posicion++;
        }
        if (posicion != disco.length){
            hueco = posicion;
        }

        return hueco;
    }

    public Disco crear(Disco d){
        int posicion = encontrarHueco(discos);

        if (posicion != -1) {
            discos[posicion] = d;
            return d;
        }

        return null;
    }

    public static int encontrarDisco(Disco[] discos, String id) {
        int posicion = 0;
        boolean encontrado = false;
        while (!encontrado && posicion < discos.length) {
            if (discos[posicion] != null && discos[posicion].getCodigo().equals(id)) {
                encontrado = true;
            } else {
                posicion++;
            }
        }
        return encontrado ? posicion : -1;
    }

    public Disco modificarDisco(String id, Disco d){
        int posicion = encontrarDisco(discos, id);
        if(posicion!=-1){
            discos[posicion]=d;
            return d;
        }
        return null;
    }
    

    public Disco[] consultar(){
        return discos;
    }
}

