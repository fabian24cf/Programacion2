package Ejer2_Biblioteca;

public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        if(id == null || id.isBlank()) throw new IllegalArgumentException("Id Obligatorio");
        if(nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre Obligatorio");
        if(nacionalidad == null || nacionalidad.isBlank()) throw new IllegalArgumentException("Nacionalidad Obligatorio");

        this.id = id.trim();
        this.nombre = nombre.trim();
        this.nacionalidad = nacionalidad.trim();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre Obligatorio");
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        if(nacionalidad == null || nacionalidad.isBlank()) throw new IllegalArgumentException("Nacionalidad Obligatorio");
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public void mostrarInfo(){
        System.out.println("Autor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
