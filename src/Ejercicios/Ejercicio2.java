
package Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        System.out.print("Sueldo 1: ");
        double Sueldo1 = lectura.nextDouble();
        System.out.print("Sueldo 2: ");
        double Sueldo2 = lectura.nextDouble();
        System.out.print("Sueldo 3: ");
        double Sueldo3 = lectura.nextDouble();
        System.out.print("Sueldo 4: ");
        double Sueldo4 = lectura.nextDouble();
        System.out.print("Sueldo 5: ");
        double Sueldo5 = lectura.nextDouble();
        double sueldototal = (Sueldo1 + Sueldo2 + Sueldo3 + Sueldo4 + Sueldo5);
        double sueldopromedio = sueldototal/5;
        // Salida
        System.out.println("Sueldo Total es: " + sueldototal);
        System.out.println("Sueldo Promedio es: " + sueldopromedio);
        lectura.close();   
}
    }
