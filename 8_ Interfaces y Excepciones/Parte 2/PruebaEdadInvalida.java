package parte2;

import java.util.Scanner;

public class PruebaEdadInvalida {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad válida.");
        } catch (EdadInvalidaException e) {
            System.out.println("Se produjo una EdadInvalidaException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
