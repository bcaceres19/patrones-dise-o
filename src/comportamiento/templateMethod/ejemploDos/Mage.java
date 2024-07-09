package comportamiento.templateMethod.ejemploDos;

public class Mage extends EnemyTemplate{
    @Override
    public void setSkills() {
        System.out.println("Health: 100, Mana:200, Stamina:100");
    }

    @Override
    public void attack() {
        System.out.println("Mage attack");
    }

    @Override
    public void protect() {
        System.out.println("Mage protect");
    }

    @Override
    public void resultd() {
        System.out.println("Mage has sobrevived");
    }
}
