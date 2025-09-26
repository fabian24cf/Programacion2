public class Libro {

    class Autor {
        private String nombre; private String nacionalidad;
        public Autor(String nombre, String nacionalidad) { this.nombre = nombre; this.nacionalidad = nacionalidad; }
    }


    class Editorial {
        private String nombre; private String direccion;
        public Editorial(String nombre, String direccion) { this.nombre = nombre; this.direccion = direccion; }
    }


    class Libro {
        private String titulo; private String isbn;
        private Autor autor; // unidireccional
        private Editorial editorial; // agregación


        public Libro(String titulo, String isbn, Autor autor) {
            this.titulo = titulo; this.isbn = isbn; this.autor = autor;
        }
        public void setEditorial(Editorial editorial) { this.editorial = editorial; }
    }
}
