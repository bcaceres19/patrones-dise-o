package comportamiento.templateMethod;

public class ConcreteTemplate extends Template{
    @Override
    public void step1() {
        System.out.println("Step 1 clase A");
    }

    @Override
    public void step2() {
        System.out.println("Step 2 clase A");
    }

    @Override
    public void stepN() {
        System.out.println("Step N clase A");
    }
}
