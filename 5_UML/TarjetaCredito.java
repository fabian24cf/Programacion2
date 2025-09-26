
    import java.time.LocalDate;


    class Banco { private String nombre, cuit;
        public Banco(String n, String c){
            this.nombre=n; this.cuit=c; }
    }


    class Cliente {

        private String nombre, dni;
        private TarjetaDeCredito tarjeta;
        public Cliente(String n,String d){
            this.nombre=n; this.dni=d;
        }
        public void setTarjeta(TarjetaDeCredito t){
            this.tarjeta=t; }
    }


    class TarjetaDeCredito {
        private String numero; private LocalDate fechaVencimiento;
        private Cliente cliente; // bidi
        private Banco banco; // agregación


        public TarjetaDeCredito(String numero, LocalDate fechaVencimiento) {
            this.numero = numero; this.fechaVencimiento = fechaVencimiento;
        }
        public void setCliente(Cliente cliente){ this.cliente = cliente; }
        public void setBanco(Banco banco){ this.banco = banco; }
    }

