package parte1;

public class PayPal implements Pago, PagoConDescuento {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal de la cuenta " + email +
                " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Por ejemplo, 5% de descuento
        double montoConDescuento = monto * 0.95;
        System.out.println("Aplicando 5% de descuento con PayPal. Monto final: $" + montoConDescuento);
        return montoConDescuento;
    }
}
