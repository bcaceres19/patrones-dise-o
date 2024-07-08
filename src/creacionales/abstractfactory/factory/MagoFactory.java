package creacionales.abstractfactory.factory;

import creacionales.abstractfactory.armaduras.Armadura;
import creacionales.abstractfactory.armaduras.Tunica;
import creacionales.abstractfactory.armas.Arma;
import creacionales.abstractfactory.armas.BastonMago;
import creacionales.abstractfactory.enemigo.Enemigo;
import creacionales.abstractfactory.enemigo.Mago;

public class MagoFactory extends EnemigoAbstractFactory{
    @Override
    public Enemigo crerEnemigo() {
        return new Mago();
    }

    @Override
    public Armadura crearArmadura() {
        return new Tunica();
    }

    @Override
    public Arma crearArma() {
        return new BastonMago();
    }
}
