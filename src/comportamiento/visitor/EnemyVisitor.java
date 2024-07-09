package comportamiento.visitor;

public class EnemyVisitor implements Visitor{
    @Override
    public void visit(Warrior warrior) {
        System.out.println("Visit warrior");
        warrior.powerAttack();
    }

    @Override
    public void visit(Mage mage) {
        System.out.println("Visit mage");
        mage.elementalAttack();
    }

    @Override
    public void visit(Assasins assasins) {
        System.out.println("Visit assasins");
        assasins.stoalthAttack();
    }
}
