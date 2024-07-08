package estructurales.adapter.ejemploUno;

public class Mago implements Enemigo {
    @Override
    public void ataque() {
        System.out.println("Mago ataca");
    }

    @Override
    public void dano() {
        System.out.println("Mago inflige daño");
    }
}
