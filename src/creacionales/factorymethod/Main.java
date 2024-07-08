package creacionales.factorymethod;


public class Main {

    public static void main(String[] args) {
        Enemigo guerrero = new GuerreroFactory().crearEnemigo();
        guerrero.atacar();
        Enemigo mago = new MagoFactory().crearEnemigo();
        mago.atacar();
    }

}
