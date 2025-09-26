public class Mascotas {

    String nombre;
    String especie;
    int edad;


public void monstrarInfo(){
    System.out.println("Nombre Mascota: " + nombre);
    System.out.println("Especie:" + especie);
    System.out.println("Edad: " + edad);
    }
public int cumplirAños(int año){
    edad += año;
    return edad;
    }


}
