package abstractfactory.factory;

import abstractfactory.armaduras.Armadura;
import abstractfactory.armaduras.Tunica;
import abstractfactory.armas.Arma;
import abstractfactory.armas.BastonMago;
import abstractfactory.enemigo.Enemigo;
import abstractfactory.enemigo.Mago;

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
