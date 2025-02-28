package listas;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ej1<E extends Comparable<E>> extends AbstractList<E>{
    private final ArrayList<E> lista;

    public Ej1() {
        lista = new ArrayList<>();
    }

    public Ej1(Collection<? extends E> collection) {
        lista = new ArrayList<>(collection);
        Collections.sort(lista);
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public E get(int index) {
        return lista.get(index);
    }

    @Override
    public boolean add (E e) {
        int index = Collections.binarySearch(lista, e);
        if (index < 0) {
            index = -(index+1);
        }

        lista.add(index, e);
        return true;
    }

    @Override
    public E remove(int index) {
        return lista.remove(index);
    }

    @Override
    public void clear() {
        lista.clear();;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for(E e : c) {
            modified = modified || add(e);
        }
        return modified;
    }

    
    
}
