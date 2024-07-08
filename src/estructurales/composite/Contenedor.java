package estructurales.composite;

import java.util.ArrayList;

public class Contenedor extends BaseItem {
    public Contenedor(String nombre) {
        super(0, nombre);
        items = new ArrayList<>();
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    @Override
    public void delete(BaseItem baseItem) {
        items.remove(baseItem);
    }

    @Override
    public int getValor() {
        int resultado = valor;
        for(BaseItem item : items){
            resultado += item.getValor();
        }
        return resultado;
    }
}
