
    class Motor {

        private String tipo, numeroSerie;
        public Motor(String t,String n){
            this.tipo=t; this.numeroSerie=n; }
    }


    class Conductor { private String nombre, licencia;
        private Vehiculo vehiculo; public Conductor(String n,String l){
            this.nombre=n;
            this.licencia=l;
        }
        public void setVehiculo(Vehiculo v){
            this.vehiculo=v; }
    }
    class Vehiculo {

        private String patente, modelo;
        private Motor motor;
        private Conductor conductor;
        public Vehiculo(String p,String m){
            this.patente=p; this.modelo=m;
        }
        public void setMotor(Motor motor){
            this.motor=motor;
        }
        public void setConductor(Conductor c){
            this.conductor=c;
        }
    }

