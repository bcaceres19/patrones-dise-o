package comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilante extends Enemy implements MyObservable{

    public List<MyObserver> observers  = new ArrayList<>();

    public Vigilante(String name) {
        super(name);
        setActive(true);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " vigilante al ataque");
    }

    @Override
    public void activate() {
        System.out.println(getName() + " sending messages");
        broadcast();
    }

    @Override
    public void subscribe(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void broadcast() {
        for (MyObserver observer: observers) {
            observer.update();
        }
    }
}
