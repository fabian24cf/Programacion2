package parte2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            double a = scanner.nextDouble();

            System.out.print("Ingrese el divisor: ");
            double b = scanner.nextDouble();

            double resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar números válidos.");
        } finally {
            System.out.println("Fin de la división segura.");
            scanner.close();
        }
    }
}
