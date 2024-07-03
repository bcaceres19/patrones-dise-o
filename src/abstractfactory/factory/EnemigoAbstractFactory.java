package abstractfactory.factory;

import abstractfactory.armaduras.Armadura;
import abstractfactory.armas.Arma;
import abstractfactory.enemigo.Enemigo;

public abstract class EnemigoAbstractFactory {

    public abstract Enemigo crerEnemigo();

    public abstract Armadura crearArmadura();

    public abstract Arma crearArma();

}
