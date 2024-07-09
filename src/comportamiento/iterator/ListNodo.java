package comportamiento.iterator;

import java.util.Iterator;

public class ListNodo<T> implements Iterator<Nodo<T>> {

    private Nodo<T> cabeza, cola;
    private int tamano, posicion;
    private Nodo<T> get(int pos){
        if(pos>tamano || pos<0 || isEmpty()){
            return null;
        }
        int contador = 0;
        Nodo<T> nodo =cabeza;
        while(contador<pos){
            nodo = nodo.getNext();
            contador++;
        }
        return nodo;
    }

    public ListNodo() {
        tamano = posicion = 0;
    }

    public ListNodo(Nodo<T> node) {
        this.cabeza = node;
        this.cola = node;
        posicion = 0;
        tamano = 1;
    }

    public boolean isEmpty(){
        return tamano == 0;
    }

    public void addaVacio(T valor){
        Nodo<T> nodo = new Nodo<>(valor);
        this.cabeza = nodo;
        this.cola = nodo;
        tamano = 1;
    }

    public void addInit(T valor){
        if(isEmpty()){
            addaVacio(valor);
            return;
        }
        Nodo<T> nodo = new Nodo<>(valor);
        nodo.setNext(cabeza);
        cabeza = nodo;
        tamano++;
    }

    public void addEnd(T valor){
        if(isEmpty()){
            addaVacio(valor);
            return;
        }
        Nodo<T> nodo = new Nodo<>(valor);
        cola.setNext(cabeza);
        cola = nodo;
        tamano++;
    }

    @Override
    public boolean hasNext() {
        if(posicion < tamano){
            return true;
        }
        return false;
    }

    @Override
    public Nodo<T> next() {
        Nodo<T> next = get(posicion);
        posicion++;
        return next;
    }
}
