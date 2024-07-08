package creacionales.prototype;

public class Mago extends Enemigo{

    private int mana;

    public Mago(int salud, int dano) {
        super(salud, dano);
    }

    public Mago(Mago mago) {
        super(mago);
        if(mago != null){
            setMana(mago.getMana());
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public Enemigo clone() {
        return new Mago(this);
    }

    @Override
    public String toString() {
        return "Mago{" +
                "mana=" + mana +
                ", salud=" + salud +
                ", dano=" + dano +
                '}';
    }
}
