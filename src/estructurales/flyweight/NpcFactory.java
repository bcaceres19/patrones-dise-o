package estructurales.flyweight;

import estructurales.flyweight.assets.AssetsPrefab;
import estructurales.flyweight.assets.Prefab;

public class NpcFactory {

    public static Npc crearNpc(Prefab prefab){
        Prefab prefabNew = AssetsPrefab.getPrefab(prefab);
        Npc npc = new Npc(prefabNew);
        return npc;
    }

}
