package estructurales.facade;

public class BancoTrabajo implements Herreria{
    @Override
    public void trabajo(String nombre) {
        System.out.println("Trabajando banco de trabajo");
    }

    @Override
    public boolean buscar(String nombre) {
        return Inventory.busqueda(nombre, false);
    }

    @Override
    public void remover(String nombre) {
         Inventory.remover(nombre, false);

    }

    @Override
    public void trabajar(String nombre) {
        System.out.println("Improving " + nombre);

    }
}
