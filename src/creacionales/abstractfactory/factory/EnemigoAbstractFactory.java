package creacionales.abstractfactory.factory;

import creacionales.abstractfactory.armaduras.Armadura;
import creacionales.abstractfactory.armas.Arma;
import creacionales.abstractfactory.enemigo.Enemigo;

public abstract class EnemigoAbstractFactory {

    public abstract Enemigo crerEnemigo();

    public abstract Armadura crearArmadura();

    public abstract Arma crearArma();

}
