public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public void setNombre(String nom) {
        nombre = nom;
    }
    public void setApellido(String ape) {
        apellido = ape;
    }
    public void setCurso(String cur) {
        curso = cur;
    }
    public void setCalificacion(double calif) {
        calificacion = calif;
    }
    public void mostrarInfo() {
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("-------------------------");
    }
    public void subirCalificacion(double puntos) {
        calificacion = calificacion + puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion = calificacion - puntos;

    }
    public double getCalificacion() {
        return calificacion;
    }
}
