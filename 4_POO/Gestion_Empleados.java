
public class Gestion_Empleados {
    public static void  main(String[]args){

       Empleado e1 = new Empleado(100, "Ana Pérez", "Desarrolladora", 500000);
       Empleado e2 = new Empleado("Luis Gómez", "QA");
       Empleado e3 = new Empleado("Sofía Díaz", "Soporte");

       e1.actualizarSalario(10);
       e2.actualizarSalario(20000);
       e3.actualizarSalario(5);

       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);

       System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
