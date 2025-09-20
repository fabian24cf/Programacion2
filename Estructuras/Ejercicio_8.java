import java.util.Scanner;

public class Ejercicio_8 {
    /*
    Funciones:
    8. Cálculo del Precio Final con impuesto y descuento.
    Crea un métod calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
    PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
    Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al métod y muestra el precio final.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Precio del Producto: ");
        double PrecioBase = input.nextDouble();
        System.out.println("Ingrese el Procentaje de Impuesto: ");
        double Impuesto = input.nextDouble();
        System.out.println("Ingrese el Porecentaje de Descuento: ");
        double Descuento = input.nextDouble();

        System.out.println("El precio Final del Producto es de: $" + CalculadoraPrecio(PrecioBase,Impuesto,Descuento));

    }
    static double CalculadoraPrecio(double PrecioBase, double Impuesto, double Descuento){
        return PrecioBase + (PrecioBase*(Impuesto / 100)) - (PrecioBase*(Descuento/100));
    }

}
