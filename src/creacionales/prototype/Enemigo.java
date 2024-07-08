package creacionales.prototype;

public abstract class Enemigo {

    protected int salud;
    protected int dano;

    public Enemigo(int salud, int dano) {
        this.salud = salud;
        this.dano = dano;
    }

    public Enemigo(Enemigo enemigo) {
        if(enemigo != null){
            setSalud(enemigo.getSalud());
            setDano(enemigo.getDano());
        }
    }

    public abstract Enemigo clone();

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "salud=" + salud +
                ", dano=" + dano +
                '}';
    }
}
