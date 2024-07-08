package estructurales.proxy;

import java.util.List;

public class ChurrosCompany {

    private Factory churrosFactory;

    private int churros;

    public ChurrosCompany() {
        churrosFactory = new ProxyChurrosFactory();
        churros = 100;
    }

    public void sellChurros() {
        churros -= 1;
    }

    public int getChurros() {
        return churros;
    }

    public List<String> startChurrosFactory() {
        return churrosFactory.initializerFactory();
    }

}
