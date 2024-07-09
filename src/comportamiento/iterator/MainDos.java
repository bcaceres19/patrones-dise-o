package comportamiento.iterator;

public class MainDos {

    public static void main(String[] args) {
        ListNodo<String> listNodo = new ListNodo<>(new Nodo<>("hola"));
        listNodo.addEnd("que");
        listNodo.addEnd("go");
        while (listNodo.hasNext()){
            System.out.println(listNodo.next());
        }
    }

}
