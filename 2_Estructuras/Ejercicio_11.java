
public class Ejercicio_11 {
    static double descuentoEspecial= 0.10;

    public static void main (String[]arg) {
/*
11. Cálculo de descuento especial usando variable global.

Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un métod calcularDescuentoEspecial(double precio)
que use la variable global para calcular el descuento especial del 10%.
Dentro del métod, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
*/

    double  precio = 234.45;
    calcularDescuentoEspecial(precio);
    }
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
        System.out.printf("Descuento aplicado: $ %.2f\n", descuentoAplicado);
        System.out.printf("Precio final con descuento: $ %.2f\n", precioFinal);

    }

}
