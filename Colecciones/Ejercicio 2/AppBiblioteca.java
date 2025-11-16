package Ejer2_Biblioteca;

public class AppBiblioteca {
    public static void main(String[] args) {

        // 1) Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2) Crear al menos tres autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A3", "Julio Cortázar", "Argentina");

        // 3) Agregar 5 libros asociados a alguno de los autores
        biblioteca.agregarLibro("111", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("222", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("333", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("444", "Rayuela", 1963, autor3);
        biblioteca.agregarLibro("555", "Bestiario", 1951, autor3);

        // 4) Listar todos los libros
        System.out.println("4) Listar todos los libros:");
        biblioteca.listarLibros();

        // 5) Buscar un libro por su ISBN
        System.out.println("\n5) Buscar libro por ISBN 333:");
        Libro buscado = biblioteca.buscarPorIsbn("333");
        System.out.println(buscado != null ? buscado : "No se encontró el libro.");

        // 6) Filtrar libros por año específico
        System.out.println("\n6) Libros publicados en 1963:");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(1963)) {
            System.out.println(l);
        }

        // 7) Eliminar un libro por su ISBN y listar restantes
        System.out.println("\n7) Eliminar libro con ISBN 222:");
        boolean eliminado = biblioteca.eliminarPorIsbn("222");
        System.out.println(eliminado ? "Libro eliminado." : "No se encontró el libro.");
        System.out.println("Libros restantes:");
        biblioteca.listarLibros();

        // 8) Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\n8) Cantidad total de libros:");
        System.out.println(biblioteca.obtenerCantidadLibros());

        // 9) Listar todos los autores de los libros disponibles
        System.out.println("\n9) Autores disponibles en la biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
