public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    private static int siguienteId = 1;
    private static final double SALARIO_BASE = 100000;

    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= siguienteId){
            siguienteId = id + 1;
        }

    }
    public Empleado(String nombre, String puesto){
        this.id = siguienteId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_BASE;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija){
        this.salario += cantidadFija;
    }

    @Override
    public String toString(){
        return String.format("Empleado{id=%d, nombre='%s', puesto='%s', salario=%.2f}", id, nombre, puesto, salario);
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

}
