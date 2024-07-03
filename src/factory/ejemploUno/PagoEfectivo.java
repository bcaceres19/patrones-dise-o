package factory.ejemploUno;

public class PagoEfectivo implements Pago{
    @Override
    public void crearPago() {
        System.out.println("Pago de efectivo");
    }
}
