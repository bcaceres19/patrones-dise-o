package comportamiento.visitor;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("last warrior");
        Mage mage = new Mage("last mage");
        Assasins assasins = new Assasins("last assasins");
        EnemyVisitor visitor = new EnemyVisitor();
        visitor.visit(warrior);
        visitor.visit(mage);
        visitor.visit(assasins);

    }

}
