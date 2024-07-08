package estructurales.composite;

public class Main {

    public static void main(String[] args) {
        BaseItem inventario = new Contenedor("Inventario");
        BaseItem bolsaMonedas = new Contenedor("Bolsa Monedas");
        BaseItem bolsaPociones = new Contenedor("Bolsa Posiones");

        BaseItem monedas = new Item(100, "Monedas");
        bolsaMonedas.add(monedas);
        BaseItem pocionesMagica = new Item(50, "Pociones magicas");
        BaseItem pocionesSalud = new Item(25, "Pociones salud");
        bolsaPociones.add(pocionesMagica);
        bolsaPociones.add(pocionesSalud);


        BaseItem espada = new Item(300, "Espada");
        BaseItem escudo = new Item(245, "Escudo");

        inventario.add(bolsaMonedas);
        inventario.add(bolsaPociones);
        inventario.add(espada);
        inventario.add(escudo);

        System.out.println("Inventario total: " + inventario.getValor());

    }

}
