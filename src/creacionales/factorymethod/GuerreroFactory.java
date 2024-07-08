package creacionales.factorymethod;


public class GuerreroFactory extends EnemigoFactory {
    @Override
    public Enemigo crearEnemigo() {
        return new Guerrero();
    }

}
