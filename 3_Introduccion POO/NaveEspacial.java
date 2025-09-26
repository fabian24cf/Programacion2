public class NaveEspacial {
    String nombre;
    double combustible;
    final double LIMITE_COMBUSTIBLE = 100.0; // máximo permitido
    final double CONSUMO_POR_KM = 0.5;        // unidades por km

    NaveEspacial(String n, double c) {
        nombre = n;
        combustible = c;
    }
    void despegar() {
        System.out.println("La nave " + nombre + " ha despegado.");
    }
    void avanzar(double distanciaKm) {
        double necesario = distanciaKm * CONSUMO_POR_KM;
        if (combustible >= necesario) {
            combustible = combustible - necesario;
            System.out.println("🛰Avanzó " + distanciaKm + " km. Combustible consumido: " + necesario);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distanciaKm + " km.");
        }
    }
    void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible = combustible + cantidad;
            System.out.println("Recargó " + cantidad + " unidades. Combustible actual: " + combustible);
        } else {
            System.out.println("⚠No se puede recargar " + cantidad + " unidades. Superaría el límite de " + LIMITE_COMBUSTIBLE);
        }
    }

    void mostrarEstado() {
        System.out.println("Estado de la nave " + nombre + ": Combustible disponible = " + combustible + " unidades");
    }
}


