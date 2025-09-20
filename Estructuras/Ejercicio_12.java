import java.util.Arrays;

public class Ejercicio_12 {


    /*Arrays y Recursividad:

12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.

Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.
✔ Recorrido del array con for-each para mostrar valores.
✔ Modificación de un valor en un array mediante un índice.
✔ Reimpresión del array después de la modificación.
*/
    public static void main(String[] args) {
        double[] precios = {34.5, 23.5, 12.4, 67.8, 89.7};
        Arrays.stream(precios).forEach(System.out::println);

        precios[2] = 456.5;
        System.out.println(precios[2]);
        Arrays.stream(precios).forEach(System.out::println);

    }
}
