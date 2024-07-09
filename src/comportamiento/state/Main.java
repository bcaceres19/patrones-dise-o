package comportamiento.state;

public class Main {

    public static void main(String[] args) {
        Mission mission = new Mission("1");
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
    }

}
