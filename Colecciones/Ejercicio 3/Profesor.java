package Ejer3_Universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private Especialidad especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, Especialidad especialidad) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("Ingrese Id");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Ingrese Nombre");
        if (especialidad == null) throw new IllegalArgumentException("Ingrese Especialidad");

        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();   // importante: inicializar la lista
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // ---- métodos internos, usados solo por Curso.setProfesor ----
    void agregarCursoInterno(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    void eliminarCursoInterno(Curso c) {
        cursos.remove(c);
    }
    // --------------------------------------------------------------

    public void agregarCurso(Curso c) {
        if (c != null) {
            // setProfesor se encarga de sincronizar ambos lados
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            // Dejar el profesor del curso en null, y el setProfesor
            // actualiza también la lista de este profesor
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ": ");
        if (cursos.isEmpty()) {
            System.out.println("Ninguno");
        } else {
            for (Curso c : cursos) {
                System.out.println("- " + c.getCodigo() + " " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + id + " - " + nombre);
        System.out.println("Especialidad: " + especialidad.getDescripcion());
        System.out.println("Cantidad de cursos: " + cursos.size());
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}

