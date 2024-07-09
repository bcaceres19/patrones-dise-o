package comportamiento.strategy;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("1");
        Enemy enemy = new Enemy("1");
        enemy.attack(player);
        System.out.println("==========================");
        enemy.setAttackStrategy(new WarriorAttack());
        enemy.attack(player);
        System.out.println("=============================");
        enemy.setAttackStrategy(new MageAttack());
        enemy.attack(player);
    }

}
