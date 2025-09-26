import java.time.LocalDate;

class Foto {
    private byte[] imagen;
    private String formato;
    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen; this.formato = formato;
    }
}
class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // extremo bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }
}

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private final Foto foto;     // composición
    private Titular titular;     // extremo bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        if (foto == null) throw new IllegalArgumentException("Foto obligatoria");
        this.numero = numero; this.fechaEmision = fechaEmision; this.foto = foto;
    }
    public void setTitular(Titular titular) { this.titular = titular; }
}


