package estructurales.decorator.ejemploUno.decorator;

import estructurales.decorator.ejemploUno.Enemigo;

public class MagoEnemigoDecorador extends EnemigoDecorador{
    public MagoEnemigoDecorador(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El mago ataca");
    }
}
