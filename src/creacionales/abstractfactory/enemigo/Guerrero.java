package creacionales.abstractfactory.enemigo;


public class Guerrero implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El gurrero ataca");
    }
}
