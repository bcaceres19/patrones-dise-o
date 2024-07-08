package estructurales.bridge.luchador;

public class GuerreroLuchadorImpl implements Luchador{
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }

    @Override
    public void defender() {
        System.out.println("El guerrero defiende");
    }
}
