

    class PlacaMadre {

        private String modelo, chipset;
        public PlacaMadre(String m,String c){
            this.modelo=m;
            this.chipset=c; }
    }

    class Propietario {
        private String nombre, dni;
        private Computadora computadora;
        public Propietario(String n,String d){
            this.nombre=n; this.dni=d;
        }
        public void setComputadora(Computadora c){
            this.computadora=c; }
    }
    class Computadora {
        private String marca, numeroSerie;
        private final PlacaMadre placaMadre;
        private Propietario propietario;
        public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
            if (placaMadre==null) throw new IllegalArgumentException("Placa madre requerida");
            this.marca=marca; this.numeroSerie=numeroSerie;
            this.placaMadre=placaMadre;
        }
        public void setPropietario(Propietario propietario){
            this.propietario = propietario;
        }
    }

