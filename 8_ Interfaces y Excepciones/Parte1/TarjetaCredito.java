package parte1;

public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito de " + titular +
                " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Por ejemplo, 10% de descuento
        double montoConDescuento = monto * 0.90;
        System.out.println("Aplicando 10% de descuento con Tarjeta de Crédito. Monto final: $" + montoConDescuento);
        return montoConDescuento;
    }
}
