import java.time.LocalDateTime;

class UsuarioFD {

        private String nombre, email;
        public UsuarioFD(String n,String e){
            this.nombre=n; this.email=e; }
    }


    class FirmaDigital {
        private String codigoHash;
        private LocalDateTime fecha;
        private UsuarioFD usuario; // agregación
        public FirmaDigital(String codigoHash, LocalDateTime fecha, UsuarioFD usuario){
            this.codigoHash=codigoHash;
            this.fecha=fecha;
            this.usuario=usuario;
        }
    }
    class Documento {

        private String titulo, contenido;
        private final FirmaDigital firma;
        public Documento(String t,String c,FirmaDigital f){
            if (f==null) throw new IllegalArgumentException("Firma requerida");
            this.titulo=t; this.contenido=c;
            this.firma=f; }
    }

