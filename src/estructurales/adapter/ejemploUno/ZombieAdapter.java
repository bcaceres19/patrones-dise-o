package estructurales.adapter.ejemploUno;

public class ZombieAdapter implements Enemigo{

    //Clase que voy a adaptar
    private Zombie zombie;
    private Guerrero guerrero;

    public ZombieAdapter() {
        this.zombie = new Zombie();
        this.guerrero = new Guerrero();
    }

    @Override
    public void ataque() {
        int valor = (int) (Math.random() * 10);
        if(valor % 2 == 0){
            zombie.morder();
        }else{
            zombie.golpear();
        }
        guerrero.dano();
    }

    @Override
    public void dano() {
        guerrero.ataque();
        int valor = (int) (Math.random() * 10);
        if(valor % 2 == 0){
            zombie.danoCabeza();
        }else{
            zombie.danoCuerpo();
        }
    }
}
