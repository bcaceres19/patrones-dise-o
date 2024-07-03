package abstractfactory.armaduras;

public class ArmaduraPesada implements Armadura{
    @Override
    public void protege() {
        System.out.println("La armadura protege");
    }
}
