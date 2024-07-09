package comportamiento.strategy;

public class MageAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " health before warrior attack: " + player.getHealth());
        System.out.println("Mage attacking");
        player.setHealth(player.getHealth());
        System.out.println(player.getName() + " health after warrior attack " + player.getHealth());

    }
}
