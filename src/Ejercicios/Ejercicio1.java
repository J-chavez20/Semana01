
package Ejercicios;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = lectura.next();
        System.out.print("Ingrese el nombre del producto: ");
        String nomproducto = lectura.next();
        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = lectura.nextDouble();
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = lectura.nextInt();
        // Calculamos los valores
        double subtotal = precioUnitario * cantidad;
        double igv = subtotal * 0.18; // IGV del 18% aplicado al subtotal
        double totalPagar = subtotal - igv;
        // Imprimimos los resultados
        System.out.println("\nResumen de la compra:");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Producto: " + nomproducto);
        System.out.println("Subtotal: S/" + subtotal);
        System.out.println("IGV: S/" + igv);
        System.out.println("Total a pagar: S/" + totalPagar);

        lectura.close();
    }
    
}
