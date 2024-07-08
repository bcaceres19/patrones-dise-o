package estructurales.decorator.ejemploUno;

import estructurales.decorator.ejemploUno.decorator.AsesinoEnemigoDecorador;
import estructurales.decorator.ejemploUno.decorator.GuerreroEnemigoDecorador;
import estructurales.decorator.ejemploUno.decorator.MagoEnemigoDecorador;
import estructurales.decorator.ejemploUno.razas.Humano;

public class Main {

    public static void main(String[] args) {
        System.out.println("===============Humano ataque==============");
        Enemigo humanoGuerreo = new GuerreroEnemigoDecorador(new Humano());
        humanoGuerreo.atacar();
        Enemigo humanoMago = new GuerreroEnemigoDecorador(new MagoEnemigoDecorador(new Humano()));
        humanoMago.atacar();
        Enemigo humanoAsesino = new AsesinoEnemigoDecorador(new Humano());
        humanoAsesino.atacar();
    }

}
