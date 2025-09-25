import java.util.Scanner;

public class Introduccion_POO {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
/*
Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
 */

        Estudiantes alumno = new Estudiantes();

        // Asignar valores con setters
        alumno.setNombre("Fabian Ignacio");
        alumno.setApellido("Cardozo");
        alumno.setCurso("5to F");
        alumno.setCalificacion(8);

        // Mostrar información inicial
        alumno.mostrarInfo();

        // Subir calificación
        alumno.subirCalificacion(3);
        System.out.println("Calificación después de subir: " + alumno.getCalificacion());

        // Bajar calificación
        alumno.bajarCalificacion(2);
        System.out.println("Calificación después de bajar: " + alumno.getCalificacion());

    /*2. Registro de Mascotas
    a. Crear una clase Mascota con los atributos: nombre, especie, edad.
    Métodos requeridos: mostrarInfo(), cumplirAnios().
    Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
     */

        Mascotas perro= new Mascotas();

        perro.nombre = "Firulais";
        perro.especie = "Caniche Toy";
        perro.edad = 5;

        perro.monstrarInfo();
        perro.cumplirAños(2);
        perro.monstrarInfo();


/*3.
Encapsulamiento con la Clase Libro

a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.

 */
        Libro libro1 = new Libro();


        libro1.setTitulo("Platero y yo");
        libro1.setAutor("Juan Ramon Jimenez");


        boolean ok1 = libro1.setAnioPublicacion(-2);
        System.out.println("¿Se aceptó -2? " + ok1);


        boolean ok2 = libro1.setAnioPublicacion(1914);
        System.out.println("¿Se aceptó 1914? " + ok2);


        libro1.getInfo();

/*4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos),
y mostrar su estado.
 */
Gallina gal1 = new Gallina(123, 2, 4);
Gallina gal2 = new Gallina(456, 3, 2);

    gal1.mostrarEstado();
    gal2.mostrarEstado();

    gal1.ponerHuevo();
    gal1.envejecer();
    gal1.mostrarEstado();

    gal2.ponerHuevo();
    gal2.envejecer();
    gal2.mostrarEstado();



/* 5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar
correctamente. Mostrar el estado al final.
 */


         NaveEspacial nave = new NaveEspacial("Andrómeda", 50.0);

           nave.despegar();
           nave.avanzar(120);         // intenta avanzar sin recargar
           nave.recargarCombustible(40); // recarga correctamente
           nave.avanzar(120);         // ahora sí puede avanzar
           nave.mostrarEstado();      // estado final


    }
}