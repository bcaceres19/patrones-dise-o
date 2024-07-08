package estructurales.decorator.ejemploUno.decorator;

import estructurales.decorator.ejemploUno.Enemigo;

public abstract class EnemigoDecorador implements Enemigo {

    protected Enemigo enemigo;

    public EnemigoDecorador(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public void atacar() {
        enemigo.atacar();
    }
}
