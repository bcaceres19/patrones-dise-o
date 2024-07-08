package estructurales.decorator.ejemploUno.decorator;

import estructurales.decorator.ejemploUno.Enemigo;

public class GuerreroEnemigoDecorador extends EnemigoDecorador {
    public GuerreroEnemigoDecorador(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El guerrero ataca");
    }
}
