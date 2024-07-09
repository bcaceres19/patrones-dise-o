package comportamiento.observer;

public class Mage extends Enemy implements MyObserver{

    public Mage(String name) {
        super(name);
        setActive(false);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " mago en un ataque");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName() + " mago esta activo");
    }

    @Override
    public void update() {
        activate();
        attack();
    }
}
