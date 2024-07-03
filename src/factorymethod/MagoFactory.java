package factorymethod;

public class MagoFactory extends EnemigoFactory{
    @Override
    public Enemigo crearEnemigo() {
        return new Mago();
    }
}
