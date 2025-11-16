package Ejer3_Universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;   // relación 1 a N

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // SETTER que mantiene la relación bidireccional
    public void setProfesor(Profesor nuevoProfesor) {
        // Si no cambia el profesor, no hacemos nada
        if (this.profesor == nuevoProfesor) {
            return;
        }

        // 1) Quitarme del profesor anterior (si había)
        if (this.profesor != null) {
            this.profesor.eliminarCursoInterno(this);
        }

        // 2) Actualizar referencia interna
        this.profesor = nuevoProfesor;

        // 3) Agregarme al nuevo profesor (si no es null)
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " - " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: (sin asignar)");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + (profesor != null ? profesor.getNombre() : "null") +
                '}';
    }
}

