package comportamiento.visitor;

public interface Visitor {

    void visit(Warrior warrior);

    void visit(Mage mage);

    void visit(Assasins assasins);

}
