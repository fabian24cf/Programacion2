import java.security.PrivateKey;

public class Libro {

private String titulo;
private String autor;
private int anioPublicacion;


private static final int ANIO_MIN = 1450;
private static final int ANIO_MAX = 2025;

// Constructor por defecto
public Libro() {
    titulo = "(sin titulo)";
    autor = "(sin autor)";
    anioPublicacion = ANIO_MIN;
}


public String getTitulo() { return titulo; }
public String getAutor() { return autor; }
public int getAnioPublicacion() { return anioPublicacion; }


public void setTitulo(String tituloArg) {
    if (tituloArg != null && !tituloArg.isEmpty()) {
        titulo = tituloArg;
    }
}

public void setAutor(String autorArg) {
    if (autorArg != null && !autorArg.isEmpty()) {
        autor = autorArg;
    }
}


public boolean setAnioPublicacion(int nuevoAnio) {
    if (nuevoAnio >= ANIO_MIN && nuevoAnio <= ANIO_MAX) {
        anioPublicacion = nuevoAnio;
        return true;
    }

    System.out.println("Año inválido: " + nuevoAnio + " (permitido " + ANIO_MIN + " a " + ANIO_MAX + ")");
    return false;
}

public void getInfo() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Año de publicación: " + anioPublicacion);

}}