package Ejer2_Biblioteca;

// Enum para categoría del libro
public enum Categoria {
    NOVELA("Novela"),
    CIENCIA("Ciencia"),
    INFANTIL("Infantil");

    private String descripcion;

    Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
