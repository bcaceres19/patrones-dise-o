package estructurales.facade;

public class Forja implements Herreria{

    public static final String ACCION = "make";

    @Override
    public void trabajo(String nombre) {
        System.out.println("Trabaja");
    }

    @Override
    public boolean buscar(String nombre) {
        return Inventory.busqueda(nombre, true);
    }

    @Override
    public void remover(String nombre) {
        Inventory.remover(nombre, true);
    }

    @Override
    public void trabajar(String nombre) {
        System.out.println("Making " + nombre);
    }
}
