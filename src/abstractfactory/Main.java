package abstractfactory;

import abstractfactory.armaduras.Armadura;
import abstractfactory.armas.Arma;
import abstractfactory.enemigo.Enemigo;
import abstractfactory.factory.EnemigoAbstractFactory;
import abstractfactory.factory.GuerreroFactory;
import abstractfactory.factory.MagoFactory;

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
