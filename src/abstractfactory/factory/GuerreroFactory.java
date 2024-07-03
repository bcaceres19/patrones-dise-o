package abstractfactory.factory;

import abstractfactory.armaduras.Armadura;
import abstractfactory.armaduras.ArmaduraPesada;
import abstractfactory.armas.Arma;
import abstractfactory.armas.EspadaGuerrero;
import abstractfactory.enemigo.Enemigo;
import abstractfactory.enemigo.Guerrero;

public class GuerreroFactory extends EnemigoAbstractFactory{
    @Override
    public Enemigo crerEnemigo() {
        return new Guerrero();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraPesada();
    }

    @Override
    public Arma crearArma() {
        return new EspadaGuerrero();
    }
}
