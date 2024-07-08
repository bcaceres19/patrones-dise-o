package estructurales.decorator.ejemploUno.decorator;

import estructurales.decorator.ejemploUno.Enemigo;

public class AsesinoEnemigoDecorador extends EnemigoDecorador{
    public AsesinoEnemigoDecorador(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El asesino ataca");
    }
}
