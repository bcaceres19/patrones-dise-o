package comportamiento.visitor;

public class Mage implements Visitable{

    private String name;

    public Mage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void elementalAttack(){
        System.out.println(getName() + "Elemental Attack");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
