
    class Proyecto {
    private String nombre;
    private int duracionMin;
    public Proyecto(String n,int d){
        this.nombre=n;
        this.duracionMin=d;
    }
}
    class Render {
    private String formato;
    private Proyecto proyecto;
    public Render(String f, Proyecto p){
        this.formato=f;
        this.proyecto=p;
    }
}
    class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render r = new Render(formato, proyecto);
    }
}
