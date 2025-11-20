package parte1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificamos al cliente del cambio de estado
        if (cliente != null) {
            cliente.notificarCambioEstado(nuevoEstado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
