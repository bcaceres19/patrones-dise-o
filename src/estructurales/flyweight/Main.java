package estructurales.flyweight;

import estructurales.flyweight.assets.Animacion;
import estructurales.flyweight.assets.Prefab;
import estructurales.flyweight.assets.Sonidos;
import estructurales.flyweight.assets.Texturas;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animacion> animations = Arrays.asList(
                new Animacion("walk"),
                new Animacion("run")
        );
        List<Texturas> textures = Arrays.asList(
                new Texturas("texture1"),
                new Texturas("texture2")
        );
        List<Sonidos> sounds = Arrays.asList(
                new Sonidos("bla"),
                new Sonidos("ble")
        );
        Prefab prefab1 = new Prefab(animations, textures, sounds);
        Npc npc1 = new Npc(prefab1);
        Npc npc2 = new Npc(prefab1);
        System.out.println("=== NPC 1 ==");
        npc1.showNpc();
        System.out.println("=== NPC 2 ==");
        npc2.showNpc();
        List<Animacion> animations2 = Arrays.asList(
                new Animacion("jump"),
                new Animacion("dance")
        );
        List<Texturas> textures2 = Arrays.asList(
                new Texturas("texture3"),
                new Texturas("texture4")
        );
        List<Sonidos> sounds2 = Arrays.asList(
                new Sonidos("bli"),
                new Sonidos("blu")
        );
        Prefab prefab2 = new Prefab(animations2, textures2, sounds2);
        Npc npc3 = new Npc(prefab2);
        System.out.println("=== NPC 3 ==");
        npc3.showNpc();
    }

}
