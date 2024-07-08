package estructurales.adapter.ejemploUno;

public class Guerrero implements Enemigo{
    @Override
    public void ataque() {
        System.out.println("Guerrero ataca!");
    }

    @Override
    public void dano() {
        System.out.println("Guerrero hace daño!");
    }
}
