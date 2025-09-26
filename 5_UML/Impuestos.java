
    class Contribuyente {
    private String nombre, cuil;
    public Contribuyente(String n,String c){
        this.nombre=n;
        this.cuil=c; }
    }
    class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    public Impuesto(double m, Contribuyente c){
        this.monto=m;
        this.contribuyente=c; }
    }
    class Calculadora {
    public void calcular(Impuesto impuesto){
        if(impuesto==null) throw new IllegalArgumentException("Impuesto requerido");
    }
}
