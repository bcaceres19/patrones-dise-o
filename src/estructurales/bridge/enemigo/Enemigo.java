package estructurales.bridge.enemigo;

import estructurales.bridge.luchador.Luchador;

public abstract class Enemigo {

    protected int salud;
    protected Luchador luchador;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Luchador getLuchador() {
        return luchador;
    }

    public Enemigo setLuchador(Luchador luchador) {
        this.luchador = luchador;
        return this;
    }
}
