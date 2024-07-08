package creacionales.abstractfactory.factory;

import creacionales.abstractfactory.armaduras.Armadura;
import creacionales.abstractfactory.armaduras.ArmaduraPesada;
import creacionales.abstractfactory.armas.Arma;
import creacionales.abstractfactory.armas.EspadaGuerrero;
import creacionales.abstractfactory.enemigo.Enemigo;
import creacionales.abstractfactory.enemigo.Guerrero;

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
