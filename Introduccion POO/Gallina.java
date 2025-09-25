public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

public Gallina(int id, int edadInicial, int huevosActuales){
    idGallina = id;
    edad = edadInicial;
    huevosPuestos = huevosActuales;
}

void ponerHuevo(){
    huevosPuestos += 1;
}
void envejecer(){
    edad += 1;
}
void mostrarEstado(){
    System.out.println(" Id de Gallina: "+ idGallina);
    System.out.println("Edad: " + edad);
    System.out.println("Huevos Puestos: " + huevosPuestos);
}

}
