package comportamiento.iterator;

public class Nodo<T> {
    private T elemento;
    private Nodo<T> next;

    public Nodo(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "elemento=" + elemento;

    }
}
