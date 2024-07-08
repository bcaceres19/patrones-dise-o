package estructurales.flyweight;

import estructurales.flyweight.assets.Prefab;

public class Npc {

    private static final int MAX_SALUD = 100;

    private static int id = 1;
    private String nombre;

    private int salud;

    private Coordenadas coordenadas;

    private Prefab prefab;


    public Npc(Prefab prefab) {
        this.nombre = "NPC"+id;
        this.salud = MAX_SALUD;
        this.coordenadas = Coordenadas.getCoordenadas();
        this.prefab = prefab;
        id++;
    }

    public void showNpc(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Salud: " + salud);
        System.out.println(coordenadas);
        System.out.println("=== Prefab ===");
        System.out.println(prefab);
    }
}
