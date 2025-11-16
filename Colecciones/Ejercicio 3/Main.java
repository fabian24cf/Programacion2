package Ejer3_Universidad;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1) Crear al menos 3 profesores
        Profesor p1 = new Profesor("P1", "Ana Pérez", Especialidad.INFORMATICA);
        Profesor p2 = new Profesor("P2", "Juan Gómez", Especialidad.MATEMATICA);
        Profesor p3 = new Profesor("P3", "Lucía Díaz", Especialidad.LENGUA);

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // 2) Crear 5 cursos
        Curso c1 = new Curso("C1", "Programación I");
        Curso c2 = new Curso("C2", "Programación II");
        Curso c3 = new Curso("C3", "Análisis Matemático");
        Curso c4 = new Curso("C4", "Álgebra");
        Curso c5 = new Curso("C5", "Comunicación Oral y Escrita");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P1");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P2");
        uni.asignarProfesorACurso("C5", "P3");

        // 4) Listar cursos con su profesor
        uni.listarCursos();

        // 5) Listar profesores con sus cursos
        uni.listarProfesores();
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        // 6) Cambiar el profesor de un curso
        uni.asignarProfesorACurso("C5", "P1"); // ahora C5 lo dicta P1

        // 7) Remover un curso
        uni.eliminarCurso("C4");

        // 8) Remover un profesor
        uni.eliminarProfesor("P2"); // cursos de P2 quedan con profesor = null

        // 9) Reporte
        uni.mostrarReporteCursosPorProfesor();
    }
}


