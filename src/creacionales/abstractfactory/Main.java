package creacionales.abstractfactory;

import creacionales.abstractfactory.armaduras.Armadura;
import creacionales.abstractfactory.armas.Arma;
import creacionales.abstractfactory.enemigo.Enemigo;
import creacionales.abstractfactory.factory.EnemigoAbstractFactory;
import creacionales.abstractfactory.factory.GuerreroFactory;
import creacionales.abstractfactory.factory.MagoFactory;

public class Main {

    public static void main(String[] args) {
        EnemigoAbstractFactory factory = new MagoFactory();
        Enemigo mago = factory.crerEnemigo();
        mago.atacar();
        Arma bastonMago = factory.crearArma();
        bastonMago.dano();
        Armadura armaduraMago = factory.crearArmadura();
        armaduraMago.protege();

        factory = new GuerreroFactory();
        Enemigo guerrero = factory.crerEnemigo();
        guerrero.atacar();
        Arma arma = factory.crearArma();
        arma.dano();
        Armadura armadura = factory.crearArmadura();
        armadura.protege();
    }

}
