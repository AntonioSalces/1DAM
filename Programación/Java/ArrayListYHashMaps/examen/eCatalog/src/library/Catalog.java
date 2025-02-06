package library;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * Implementación genérica de un catálogo que puede almacenar cualquier tipo de elemento.
 * Mantiene un conjunto de elementos únicos y proporciona operaciones básicas para su gestión.
 * @param <T> tipo de elementos que almacenará el catálogo
 */
public class Catalog<T> implements ICatalog<T> {
    private ArrayList<T> library;

    public Catalog() {
        library = new ArrayList<>();
    }

    public ArrayList<T> getLibrary() {
        return library;
    }

    @Override
    public boolean addItem(T item) {
        if (item==null || library.contains(item)) {
            return false;
        } else {
            library.add(item);
            return true;
        }
    }

    @Override
    public void removeItem(T item) {
        if (library.contains(item)) {
            library.remove(item);
        }
    }

    @Override
    public ArrayList<T> getAllItems() {
        ArrayList<T> copy = (ArrayList) library.clone();
        return copy;
    }
    
} 