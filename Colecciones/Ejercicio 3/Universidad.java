package Ejer3_Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // --- Altas ---

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // --- Búsquedas (por id/código) ---

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    // --- Asignar profesor a curso (usa setProfesor del curso) ---

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null || profesor == null) {
            return false;
        }

        curso.setProfesor(profesor);
        return true;
    }

    // --- Listados ---

    public void listarProfesores() {
        System.out.println("Profesores de la universidad " + nombre + ":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            System.out.println("------------------------");
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de la universidad " + nombre + ":");
        for (Curso c : cursos) {
            c.mostrarInfo();
            System.out.println("------------------------");
        }
    }

    // --- Eliminaciones ---

    // Eliminar curso: rompe la relación con el profesor si lo tuviera
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.setProfesor(null); // rompe vínculo bidireccional
            }
            cursos.remove(curso);
            return true;
        }
        return false;
    }

    // Eliminar profesor: deja profesor = null en los cursos que dictaba
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso c : new ArrayList<>(cursos)) { // copia para evitar ConcurrentModification
                if (c.getProfesor() == profesor) {
                    c.setProfesor(null);
                }
            }
            profesores.remove(profesor);
            return true;
        }
        return false;
    }

    // --- Reporte: cantidad de cursos por profesor ---

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("Reporte: cantidad de cursos por profesor en " + nombre);
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}


