package tp7;

public class Main {

    public static void main(String[] args) {
        System.out.println("===== KATA 1: Vehículos =====");
        ejecutarKata1();

        System.out.println("\n===== KATA 2: Figuras =====");
        ejecutarKata2();

        System.out.println("\n===== KATA 3: Empleados =====");
        ejecutarKata3();

        System.out.println("\n===== KATA 4: Animales =====");
        ejecutarKata4();
    }

    private static void ejecutarKata1() {
        Auto auto = new Auto("Ford", "Fiesta", 5);
        auto.mostrarInfo();
    }

    private static void ejecutarKata2() {
        Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }

    private static void ejecutarKata3() {
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 150000),
            new EmpleadoTemporal("Luis", 120, 1500)
        };

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println(" → Es un empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" → Es un empleado temporal");
            }
        }
    }

    private static void ejecutarKata4() {
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("------");
        }
    }
}
