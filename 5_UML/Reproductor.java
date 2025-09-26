
    class Artista {
    private String nombre, genero;
    public Artista(String n,String g){
        this.nombre=n; this.genero=g; }
    }
    class Cancion {
    private String titulo;
    private Artista artista;
    public Cancion(String t, Artista a){
        this.titulo=t;
        this.artista=a; }
    }
    class Reproductor {
        public void reproducir(Cancion cancion) {
            if (cancion == null) throw new IllegalArgumentException("Canción requerida");

            System.out.println("Reproduciendo canción…");
        }
    }

