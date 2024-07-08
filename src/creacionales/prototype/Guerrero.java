package creacionales.prototype;

public class Guerrero extends Enemigo{



    private int estamina;



    public Guerrero(int salud, int dano, int estamina) {
        super(salud, dano);
        this.estamina = estamina;
    }

    public Guerrero(Guerrero guerrero) {
        super(guerrero);
        if(guerrero != null){
            setEstamina(guerrero.getEstamina());
        }
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "estamina=" + estamina +
                ", salud=" + salud +
                ", dano=" + dano +
                '}';
    }

    @Override
    public Enemigo clone() {
        return new Guerrero(this);
    }

}
