
    class UsuarioQR {
    private String nombre, email;
    public UsuarioQR(String n,String e){
        this.nombre=n;
        this.email=e; }
    }
    class CodigoQR {
    private String valor;
    private UsuarioQR usuario;
    public CodigoQR(String v, UsuarioQR u){
        this.valor=v;
        this.usuario=u; }
    }
    class GeneradorQR {
    public void generar(String valor, UsuarioQR usuario){
        CodigoQR qr = new CodigoQR(valor, usuario);
    }
}

