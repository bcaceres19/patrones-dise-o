package creacionales.factory.ejemploDos;

import java.util.HashMap;
import java.util.Objects;

public class EnemigoFactory {

    private HashMap<String, Enemigo> tiposPersonajes = new HashMap<>();

    public EnemigoFactory() {
        this.tiposPersonajes.put("mago", new Mago());
        this.tiposPersonajes.put("guerrero", new Guerrero());
    }

    public Enemigo crearEnemigo(String tipo){
        return this.tiposPersonajes.get(tipo);
    }

}
