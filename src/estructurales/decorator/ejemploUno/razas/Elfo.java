package estructurales.decorator.ejemploUno.razas;

import estructurales.decorator.ejemploUno.Enemigo;

public class Elfo implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("Elfo atacando...");
    }
}
