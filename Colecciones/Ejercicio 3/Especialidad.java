package Ejer3_Universidad;

public enum Especialidad {
    MATEMATICA("Matemática"),
    INFORMATICA("Informática"),
    LENGUA("Lengua y Literatura");

    private final String descripcion;

    Especialidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

