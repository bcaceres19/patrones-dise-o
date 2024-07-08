package estructurales.flyweight.assets;

import java.util.ArrayList;
import java.util.List;

public class Prefab {
    private static int id = 1;
    private String nombre;
    private List<Animacion> animaciones = new ArrayList<>();
    private List<Texturas> texturas = new ArrayList<>();
    private List<Sonidos> sonidos = new ArrayList<>();

    public Prefab( List<Animacion> animaciones, List<Texturas> texturas, List<Sonidos> sonidos) {
        this.nombre = "Prefab"+id;
        this.animaciones = animaciones;
        this.texturas = texturas;
        this.sonidos = sonidos;
        id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Prefab{" +
                "nombre='" + nombre + '\'' +
                ", animaciones=" + animaciones +
                ", texturas=" + texturas +
                ", sonidos=" + sonidos +
                '}';
    }
}
