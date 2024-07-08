package estructurales.decorator.ejemploUno.razas;

import estructurales.decorator.ejemploUno.Enemigo;

public class Orco implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("Orco ataca");
    }
}
