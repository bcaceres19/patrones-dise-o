package estructurales.bridge;

import estructurales.bridge.enemigo.Guerrero;
import estructurales.bridge.enemigo.Mago;
import estructurales.bridge.luchador.GuerreroLuchadorImpl;
import estructurales.bridge.luchador.MagoLuchadorImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Guerrero");
        Guerrero guerrero = new Guerrero();
        guerrero.atacar();
        guerrero.defender();
        guerrero.setLuchador(new MagoLuchadorImpl());
        guerrero.atacar();
        guerrero.defender();
        System.out.println("Mago");
        Mago mago = new Mago();
        mago.atacar();
        mago.defender();
        mago.setLuchador(new GuerreroLuchadorImpl());
        mago.atacar();
        mago.defender();
    }

}
