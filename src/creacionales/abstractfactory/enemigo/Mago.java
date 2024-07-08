package creacionales.abstractfactory.enemigo;

public class Mago implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("El mago ataca");
    }
}
