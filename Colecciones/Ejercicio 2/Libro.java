package Ejer2_Biblioteca;

public class Libro {
    private String isbn;
    private String titulo;
    private int añoPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int añoPublicacion, Autor autor) {
        if (isbn == null || isbn.isBlank()) throw new IllegalArgumentException("Identificador Obligatorio");
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Titulo Obligatotio");
        if (añoPublicacion <= 0) throw new IllegalArgumentException("Ingrese un año valido");
        if (autor == null) throw new IllegalArgumentException("Autor obligatorio");

        this.isbn = isbn;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Titulo Obligatotio");
        this.titulo = titulo;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion <= 0) throw new IllegalArgumentException("Ingrese un año valido");
        this.añoPublicacion = añoPublicacion;
    }

    public void setAutor(Autor autor) {
        if (autor == null) throw new IllegalArgumentException("Autor obligatorio");
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Libro{" +
                "isbn='" + isbn + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Año dePublicacion=" + añoPublicacion +
                ", Autor=" + autor +
                '}');
    }

    @Override
    public String toString() {
        return titulo + " — " + isbn + " (" + añoPublicacion + ") - " +
                (autor != null ? autor.toString() : "Autor desconocido");

    }
}