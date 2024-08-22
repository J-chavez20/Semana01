
package Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
          Scanner lectura = new Scanner(System.in);
        // Pedimos los datos al usuario
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = lectura.nextLine();
        System.out.print("Ingrese el cargo del empleado: ");
        String cargo = lectura.nextLine();
        System.out.print("Ingrese el ingreso mensual del empleado: ");
        double ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese el gasto mensual del empleado: ");
        double gastoMensual = lectura.nextDouble();
        // Calculamos el ahorro mensual
        double ahorroMensual = ingresoMensual - gastoMensual;
        // Calculamos los ahorros para otros períodos
        double ahorroBimestral = ahorroMensual * 2;
        double ahorroSemestral = ahorroMensual * 6;
        double ahorroAnual = ahorroMensual * 12;
        // salida
        System.out.println("\nResumen del ahorro del empleado:");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ahorro mensual: S/" + ahorroMensual);
        System.out.println("Ahorro bimestral: S/" + ahorroBimestral);
        System.out.println("Ahorro semestral: S/" + ahorroSemestral);
        System.out.println("Ahorro anual: S/" + ahorroAnual);
        lectura.close();   
}
}