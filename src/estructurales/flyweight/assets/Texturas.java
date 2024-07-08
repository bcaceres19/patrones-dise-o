package estructurales.flyweight.assets;

public class Texturas {

    public Texturas(String texturas) {
        this.texturas = texturas;
    }

    private String texturas;

    @Override
    public String toString() {
        return "Texturas{" +
                "texturas='" + texturas + '\'' +
                '}';
    }
}
