package comportamiento.observer;

public class Main {

    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero("1");
        Guerrero guerrero2 = new Guerrero("2");
        Mage mage1 = new Mage("1");
        Mage mage2 = new Mage("2");
        Vigilante vigilante = new Vigilante("vigilante");
        vigilante.subscribe(guerrero1);
        vigilante.subscribe(guerrero2);
        vigilante.subscribe(mage1);
        vigilante.subscribe(mage2);
        vigilante.activate();
        System.out.println("===========================================");
        vigilante.unsubscribe(mage2);
        vigilante.activate();

    }

}
