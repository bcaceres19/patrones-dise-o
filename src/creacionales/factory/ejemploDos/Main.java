package creacionales.factory.ejemploDos;

import creacionales.factory.ejemploUno.Pago;
import creacionales.factory.ejemploUno.PagoFactory;
import creacionales.factory.ejemploUno.TipoPago;

public class Main {

    public static void main(String[] args) {
        EnemigoFactory enemigoFactory = new EnemigoFactory();
        Enemigo enemigo = enemigoFactory.crearEnemigo("mago");
        enemigo.atacar();
        enemigo = enemigoFactory.crearEnemigo("guerrero");
        enemigo.atacar();
    }

}
