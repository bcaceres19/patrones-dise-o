package estructurales.flyweight.assets;

public class Animacion {

    private String animacion;

    public Animacion(String animacion) {
        this.animacion = animacion;
    }

    @Override
    public String toString() {
        return "Animacion{" +
                "animacion='" + animacion + '\'' +
                '}';
    }
}
