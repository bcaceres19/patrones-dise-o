package comportamiento.memento;

import javax.sound.midi.MetaMessage;
import java.util.ArrayList;
import java.util.List;

public class MementoManager {

    private List<Memento> mementos = new ArrayList<>();

    private int index;

    public MementoManager() {
        index = 0;
    }

    public void save(Memento memento){
        mementos.add(memento);
    }

    public Memento undo(){
        if(mementos.isEmpty() || index == mementos.size()){
            throw new IndexOutOfBoundsException("No states");
        }
        Memento memento = mementos.get(index);
        index++;
        return memento;
    }

    public Memento redo(){
        if(mementos.isEmpty() || index == mementos.size()){
            throw new IndexOutOfBoundsException("No states");
        }
        Memento memento = mementos.get(index);
        index--;
        return memento;
    }


}
