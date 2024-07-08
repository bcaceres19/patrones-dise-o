package creacionales.singleton;

public class Main {

    public static void main(String[] args) {
        Thread threadBrahian = new Thread(new RunBrahian());
        Thread threadMarlon = new Thread(new RunMarlon());
        threadBrahian.start();
        threadMarlon.start();
    }

    static class RunBrahian implements Runnable{

        @Override
        public void run() {
            Player p =  Player.getPlayer("Brahian");
            System.out.println(p );
        }
    }

    static class RunMarlon implements Runnable{

        @Override
        public void run() {
            Player p =  Player.getPlayer("Marlon");
            System.out.println(p );
        }
    }

}
