package comportamiento.mediator;

public class Companion implements Combat{

    private String name;

    private Mediator mediator;

    public Companion(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void send() {
        System.out.println("");
    }

    @Override
    public void receive(Combat combat) {

    }
}
