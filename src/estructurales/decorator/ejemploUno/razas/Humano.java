package estructurales.decorator.ejemploUno.razas;

import estructurales.decorator.ejemploUno.Enemigo;

public class Humano implements Enemigo {


    @Override
    public void atacar() {
        System.out.println("Ataque humano");
    }
}
