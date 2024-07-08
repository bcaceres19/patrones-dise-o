package estructurales.bridge.enemigo;

import estructurales.bridge.luchador.GuerreroLuchadorImpl;
import estructurales.bridge.luchador.Luchador;

public class Guerrero extends Enemigo  {

    public Guerrero() {
        setLuchador(new GuerreroLuchadorImpl());
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
        System.out.println("Guerrero:");
        getLuchador().atacar();
    }

    public void defender() {
        System.out.println("Guerrero:");
        getLuchador().defender();
    }

    @Override
    public Luchador getLuchador() {
        return super.getLuchador();
    }

    @Override
    public Enemigo setLuchador(Luchador luchador) {
        return super.setLuchador(luchador);
    }
}
