package parte1;

public class MainParte1 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "juan@example.com");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 10000));

        System.out.println("Total del pedido sin descuento: $" + pedido.calcularTotal());

        // Elegimos un medio de pago
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9999-0000", "Juan Pérez");
        double montoConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(montoConDescuento);

        // Cambiamos el estado del pedido para ver la notificación al cliente
        pedido.cambiarEstado("PAGADO");
        pedido.cambiarEstado("ENVIADO");
    }
}
