package abstractfactory.armas;

public class BastonMago implements Arma {
    @Override
    public void dano() {
        System.out.println("Hizo daño el baston del mago");
    }
}
