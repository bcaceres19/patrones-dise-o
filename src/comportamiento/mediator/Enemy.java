package comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements Combat{

    private String name;

    private Mediator mediator;

    public Enemy(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.add(this);
    }

    private List<Enemy> enemies = new ArrayList<>();

    public Enemy(String name) {
        this.name = name;
    }

    public void add(Enemy enemy){
        enemies.add(enemy);
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "name='" + name + '\'';
    }

    @Override
    public void send() {
        System.out.println("Enviando el mensaje desde " + name);
        mediator.send(this);
    }

    @Override
    public void receive(Combat combat) {
        System.out.println("Mensaje recibido desde " + ((Enemy) combat).getName() + ": " + name + " Modo ataque activado");
    }
}
