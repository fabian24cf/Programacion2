package parte1;

public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("Notificando a " + nombre + " (" + email + "): el estado de su pedido ahora es '" + nuevoEstado + "'.");
    }

    public String getNombre() {
        return nombre;
    }
}
