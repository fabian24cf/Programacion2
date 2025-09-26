import java.time.*;

    class ClienteR {

        private String nombre, telefono;
        public ClienteR(String n,String t){
            this.nombre=n; this.telefono=t; }
    }


    class Mesa {

        private int numero, capacidad;
        public Mesa(int n,int c){
            this.numero=n;
            this.capacidad=c; }
    }
    class Reserva {
        private LocalDate fecha;
        private LocalTime hora;
        private ClienteR cliente;
        private Mesa mesa;
        public Reserva(LocalDate fecha, LocalTime hora, ClienteR cliente){
            this.fecha=fecha;
            this.hora=hora;
            this.cliente=cliente;
        }
        public void setMesa(Mesa mesa){
            this.mesa = mesa;
        }
    }

