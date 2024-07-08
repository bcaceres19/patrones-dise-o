package estructurales.composite;

public class Item extends BaseItem{

    public Item(int valor, String nombre) {
        super(valor, nombre);
    }

    @Override
    public void add(BaseItem baseItem) {
        System.out.println("Se añade");
    }

    @Override
    public void delete(BaseItem baseItem) {
        System.out.println("Se elimina");
    }

    @Override
    public int getValor() {
        return valor;
    }
}
