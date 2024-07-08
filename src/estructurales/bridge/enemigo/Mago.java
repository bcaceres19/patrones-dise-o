package estructurales.bridge.enemigo;

import estructurales.bridge.luchador.MagoLuchadorImpl;

public class Mago extends Enemigo  {

    public Mago() {
        setLuchador(new MagoLuchadorImpl());
    }

    @Override
    public int getSalud() {
        return super.getSalud();
    }

    @Override
    public void setSalud(int salud) {
         super.setSalud(salud);
    }

    public void atacar() {
        System.out.println("Mago:");
        getLuchador().atacar();
    }

    public void defender() {
        System.out.println("Mago:");
        getLuchador().defender();
    }
}
