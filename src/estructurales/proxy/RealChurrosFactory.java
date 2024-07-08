package estructurales.proxy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RealChurrosFactory implements Factory{

    List<String> churrosMachine;

    @Override
    public List<String> initializerFactory() {
        churrosMachine = new ArrayList<>();
        for(int i = 0; i<5;i++){
            System.out.println("Maquina " + i + " iniciando");
            churrosMachine.add("Maquina " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return churrosMachine;
    }
}
