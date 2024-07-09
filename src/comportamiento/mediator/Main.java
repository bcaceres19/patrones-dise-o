package comportamiento.mediator;

public class Main {

    public static void main(String[] args) {
        /* Forma sin mediator
        Enemy enemy1  =new Enemy("1");
        Enemy enemy2  =new Enemy("2");
        Enemy enemy3  =new Enemy("3");
        enemy1.add(enemy2);
        enemy1.add(enemy3);
        enemy2.add(enemy1);
        enemy2.add(enemy3);
        enemy3.add(enemy1);
        enemy3.add(enemy2);
        enemy1.send();*/
        //Forma con mediator
        Mediator mediator = new Mediator();
        Enemy enemy1  =new Enemy("1",mediator);
        Enemy enemy2  =new Enemy("2",mediator);
        Enemy enemy3  =new Enemy("3",mediator);
        enemy1.send();
    }

}
