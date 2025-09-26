
    class Bateria {
        private String modelo;
        private int capacidad;

        public Bateria(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }

    class Usuario {
        private String nombre;
        private String dni;
        private Celular celular; // extremo bidi

        public Usuario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }

        public void setCelular(Celular celular) {
            this.celular = celular;
        }
    }

    public class Celular {
        private String imei;
        private String marca;
        private String modelo;


        private Bateria bateria;

        private Usuario usuario;

        public Celular(String imei, String marca, String modelo) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
        }

        public void setBateria(Bateria bateria) {
            this.bateria = bateria;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }
    }
