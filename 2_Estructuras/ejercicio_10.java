import java.util.Scanner;

public class ejercicio_10 {
    public static void main (String[]arg) {
        Scanner input = new Scanner(System.in);
/*
10. Actualización de stock a partir de venta y recepción de productos.
Crea un métod actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida),
que calcule el nuevo stock después de una venta y recepción de productos:

NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida

Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
*/
        System.out.println("Ingrese el Stock Actual: ");
        int stockActual = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el Stock Vendido: ");
        int stockVendido = input.nextInt();

        System.out.println("Ingrese el Stock Ingresado: ");
        int stockIngresado = input.nextInt();

        int StockActual = actualizacionStock(stockActual, stockVendido, stockIngresado);

        System.out.printf("El Stock actual es de: %d remeras",StockActual);

    }
    static int actualizacionStock(int stockActual, int cantidadVendida,int cantidadRecibida) {
        return (stockActual - cantidadVendida) + cantidadRecibida;

    }
}
