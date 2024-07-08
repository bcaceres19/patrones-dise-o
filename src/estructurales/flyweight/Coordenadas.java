package estructurales.flyweight;

public class Coordenadas {

    private int posX, posY, posZ;

    public Coordenadas() {
        posX = (int)(Math.random() * 100);
        posY = (int)(Math.random() * 100);
        posZ = (int)(Math.random() * 100);
    }

    public static Coordenadas getCoordenadas(){
        return new Coordenadas();
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", posZ=" + posZ +
                '}';
    }
}
