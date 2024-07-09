package comportamiento.strategy;

public class Enemy {

    private String name;

    private AttackStrategy attackStrategy;

    public Enemy(String name) {
        this.name = name;
        this.attackStrategy = new UnarmedAttack();
    }

    public void attack(Player player){
        /* forma sin patron stratey
        if(type.equalsIgnoreCase("warrior")){
            System.out.println("warrior attack");
        }else if(type.equalsIgnoreCase("mage attack")){
            System.out.println("mage attack");
        }else{
            System.out.println("unarmed attack");
        }*/
        attackStrategy.attack(player);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
