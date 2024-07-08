package creacionales.singleton;

public class Player {

    private String nombre;

    private static volatile Player player;

    private Player(String nombre){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.nombre = nombre;
    }

    public static synchronized Player getPlayer(String name){
        if(player == null){
            player = new Player(name);
        }
        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
