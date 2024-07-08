package estructurales.proxy;

import java.util.List;

public class ProxyChurrosFactory implements Factory{

    private Factory realFactory;

    public ProxyChurrosFactory() {
        System.out.println("Creando la factory proxy");
    }


    @Override
    public List<String> initializerFactory() {
        if(realFactory == null){
            realFactory = new RealChurrosFactory();
        }
        return realFactory.initializerFactory();
    }
}
