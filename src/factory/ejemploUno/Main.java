package factory.ejemploUno;

public class Main {

    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoPago.PAYPAL);
        pago.crearPago();
        pago = pagoFactory.obtenerPago(TipoPago.EFECTIVO);
        pago.crearPago();    }

}
