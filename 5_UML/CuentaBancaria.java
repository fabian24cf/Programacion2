import java.time.*;

    class ClaveSeguridad {
        private String codigo;
        private LocalDateTime ultimaModificacion;
        public ClaveSeguridad(String c, LocalDateTime u){
            this.codigo=c; this.ultimaModificacion=u; }
    }
    class TitularCB {
        private String nombre, dni;
        private CuentaBancaria cuenta;
        public TitularCB(String n,String d){
            this.nombre=n; this.dni=d;
        }
        public void setCuenta(CuentaBancaria c){
            this.cuenta=c; }
    }
    class CuentaBancaria {
        private String cbu;
        private double saldo;
        private final ClaveSeguridad clave;
        private TitularCB titular;
        public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave){
            if(clave==null) throw new IllegalArgumentException("Clave requerida");
            this.cbu=cbu;
            this.saldo=saldo;
            this.clave=clave;
        }
        public void setTitular(TitularCB t){
            this.titular=t; }
    }
