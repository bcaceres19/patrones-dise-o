package creacionales.factory.ejemploUno;

public class PagoPayPal implements Pago{
    @Override
    public void crearPago() {
        System.out.println("Pago Paypal");
    }
}
