package estructurales.proxy;

public class Main {

    public static void main(String[] args) {
        ChurrosCompany churrosCompany = new ChurrosCompany();
        System.out.println("Vendiendo churros");
        System.out.println(churrosCompany.getChurros());
        churrosCompany.sellChurros();
        churrosCompany.sellChurros();
        churrosCompany.sellChurros();
        System.out.println(churrosCompany.getChurros());
        System.out.println("----------------------------");
        System.out.println("Preparando churros");
        churrosCompany.startChurrosFactory();
    }

}
