package parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        File archivo = new File("ejemplo.txt");

        try (Scanner scanner = new Scanner(archivo)) {
            System.out.println("Contenido del archivo:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
    }
}
