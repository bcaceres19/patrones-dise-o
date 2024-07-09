package comportamiento.strategy;

public class UnarmedAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " health before warrior attack: " + player.getHealth());
        System.out.println("Unarmed attacking");
        player.setHealth(player.getHealth());
        System.out.println(player.getName() + " health after warrior attack " + player.getHealth());
    }
}
