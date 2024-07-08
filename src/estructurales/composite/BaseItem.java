package estructurales.composite;

import java.util.List;

public abstract class BaseItem {

    protected String nombre;

    protected int valor;

    protected List<BaseItem> items;

    public BaseItem(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public abstract void add(BaseItem baseItem);
    public  abstract void delete(BaseItem baseItem);
    public abstract int getValor();

}
