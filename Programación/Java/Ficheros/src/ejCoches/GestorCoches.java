package ejCoches;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class GestorCoches {
    ArrayList<Coche> coches;

    public GestorCoches() throws FileNotFoundException, IOException {
        coches = ArchivoCoches.leerCocheDesdeArchivo();
    }
    
    public ArrayList<Coche> getCoches() {
        return coches;
    }

    private boolean comprobarID(int id) {
        for(Coche c : coches) {
            if (c.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public boolean aniadirCoche(Coche c) throws IOException {
        if (!comprobarID(c.getId())) {
            coches.add(c);
            ArchivoCoches.escribirCochesEnArchivo(coches);
            return true;
        }
        return false;
    }

    public String listarCoches() {
        String ret = "";
        for(Coche c : coches) {
            ret += c.toString() + "\n";
        }
        return ret;
    }

    public Coche buscarPorID(int id) throws CocheNotExistException {
        for (Coche c : coches) {
            if (c.getId() == id) {
                return c;
            }
        }
        throw new CocheNotExistException();
    }

    public boolean eliminarCoche(int id ) throws CocheNotExistException, IOException {
        for (Coche c : coches) {
            if (c.getId() == id) {
                coches.remove(c);
                ArchivoCoches.escribirCochesEnArchivo(coches);
                return true;
            }
        }
        throw new CocheNotExistException();
    }


}
