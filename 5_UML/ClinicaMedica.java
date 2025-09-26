import java.time.*;

    class Paciente {

        private String nombre, obraSocial;
        public Paciente(String n,String o){
            this.nombre=n; this.obraSocial=o; }
    }


    class Profesional {

        private String nombre, especialidad;
        public Profesional(String n,String e){
            this.nombre=n; this.especialidad=e; }
    }

    class CitaMedica {

        private LocalDate fecha;
        private LocalTime hora; private Paciente paciente;
        private Profesional profesional;
        public CitaMedica(LocalDate f, LocalTime h, Paciente p, Profesional pr){
            this.fecha=f; this.hora=h; this.paciente=p; this.profesional=pr; }
    }

