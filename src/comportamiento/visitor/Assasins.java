package comportamiento.visitor;

public class Assasins implements Visitable{

    private String name;

    public Assasins(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stoalthAttack(){
        System.out.println(getName() + "stoalth Attack");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
