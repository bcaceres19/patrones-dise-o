package comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Combat> combats = new ArrayList<>();

    public void add(Combat combat){
        combats.add(combat);
    }

    public void send(Combat combat){
        for(Combat combat1 : combats){
            if(combat1 != combat){
                combat1.receive(combat);
            }
        }
    }

}
