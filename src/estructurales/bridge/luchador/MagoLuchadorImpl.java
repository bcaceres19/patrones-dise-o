package estructurales.bridge.luchador;

public class MagoLuchadorImpl implements Luchador{
    @Override
    public void atacar() {
        System.out.println("El mago ataca");
    }

    @Override
    public void defender() {
        System.out.println("El mago defiende");
    }
}
