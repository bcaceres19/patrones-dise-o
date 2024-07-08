package estructurales.flyweight.assets;

public class Sonidos {

    public Sonidos(String sonido) {
        this.sonido = sonido;
    }

    private String sonido;

    @Override
    public String toString() {
        return "Sonidos{" +
                "sonido='" + sonido + '\'' +
                '}';
    }
}
