package factory.ejemploDos;

public class Guerrero implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("Ataca el guerrero");
    }
}
