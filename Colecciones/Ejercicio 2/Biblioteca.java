package Ejer2_Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;

    public Biblioteca(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre obligatorio");
        this.nombre = nombre.trim();
    }

    private final List<Libro> libros= new ArrayList<>();

    public Libro buscarPorIsbn(String isbn) {
        if (isbn == null) return null;
        String clave = isbn.strip();
        for (Libro l : libros) {
            if (l.getIsbn().equals(clave)) return l;
        }
        return null;
    }

    public boolean agregarLibro(Libro l){
        if (l == null) return false;
        if (buscarPorIsbn(l.getIsbn()) != null) return false;
        return libros.add(l);
    }

    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("Biblioeca Vacia");
        return;
        }
        for (Libro l : libros){
            System.out.println(l);
        }
    }

    public boolean eliminarPorIsbn(String isbn){
    if (isbn == null || isbn.isBlank()) return false;
    String clave = isbn.strip();
    return libros.removeIf(l ->l.getIsbn().equals(clave));

    }

    public int obtenerCantidadLibros(){
        return libros.size();
    }
    public List<Libro> filtrarLibrosPorAnio(int año){
        List<Libro> out = new ArrayList<>();
        for (Libro l : libros){
            if (l.getAñoPublicacion()== año) out.add(l);
        }
        return out;
    }
    public void mostrarAutoresDisponibles(){
        if (libros.isEmpty()){
            System.out.println("Sin Autores");
            return;
        }


        ArrayList<Autor> autoresUnicos = new ArrayList<>();

        // Recorro todos los libros (for-each) y voy agregando autores sin repetir
        for (Libro l : libros) {
            Autor a = l.getAutor();
            if (!autoresUnicos.contains(a)) { // usa equals de Autor
                autoresUnicos.add(a);
            }
        }

        System.out.println("Autores disponibles:");
        for (Autor a : autoresUnicos) {
            System.out.println(a);
        }
    }
    public boolean agregarLibro(String isbn, String titulo, int añoPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, añoPublicacion, autor);
        return agregarLibro(libro);
    }


}
