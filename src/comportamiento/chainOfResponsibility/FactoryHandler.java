package comportamiento.chainOfResponsibility;

public interface FactoryHandler {

    void setFactoryHandler(FactoryHandler handler);
    void process(Ingredient ingredient);

}
