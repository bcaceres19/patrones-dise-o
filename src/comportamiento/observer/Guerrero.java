package comportamiento.observer;

public class Guerrero extends Enemy implements MyObserver{

    public Guerrero(String name) {
        super(name);
        setActive(false);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " guerreo en un ataque");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName() + " guerrero esta activo");
    }

    @Override
    public void update() {
        activate();
        attack();
    }
}
