package creacionales.factory.ejemploUno;

public class PagoFactory {

    public Pago obtenerPago(TipoPago tipoPago){
        return  switch (tipoPago){
            case PAYPAL ->  new PagoPayPal();
            case EFECTIVO -> new PagoEfectivo();
        };
    }

}
