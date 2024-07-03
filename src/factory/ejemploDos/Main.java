package factory.ejemploDos;

import factory.ejemploUno.Pago;
import factory.ejemploUno.PagoFactory;
import factory.ejemploUno.TipoPago;

public class Main {

    public static void main(String[] args) {
        EnemigoFactory enemigoFactory = new EnemigoFactory();
        Enemigo enemigo = enemigoFactory.crearEnemigo("mago");
        enemigo.atacar();
        enemigo = enemigoFactory.crearEnemigo("guerrero");
        enemigo.atacar();
    }

}
