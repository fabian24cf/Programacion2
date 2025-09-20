import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
    /*
    9. Composición de funciones para calcular costo de envío y total de compra.
    a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
    Nacional: $5 por kg - Internacional: $10 por kg.
    b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
    Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el Precio del Producto: ");
        double precioProducto = input.nextDouble();
        System.out.println("Ingrese el peso del Producto: ");
        double pesoProducto = input.nextDouble();
        input.nextLine();
        System.out.println("Indique si el envio es Nacional o Internacional: ");
        String zonaEnvio = input.nextLine().toLowerCase().trim();

        double total= CalcTotalCompra(pesoProducto,zonaEnvio,precioProducto);
        System.out.printf("El costo total del Envio es de: $%.2f\n",total);
        }

    static double CalcTotalCompra ( double peso, String zona,double precioProducto){
        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        } else {
            System.out.println("Debe seleccionar una Zona Valida");
            return 0;
        }
        return costoEnvio + precioProducto;
    }
}
