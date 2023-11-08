/*
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. 
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class Prestamo6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double MontoPrestamo, InteresMensual, PagoMensual;
        System.out.println("Ingresa el monto del prestamo");
        MontoPrestamo = teclado.nextDouble();
        System.out.println("Ingresa el valor del interes mensual");
        InteresMensual = teclado.nextDouble();
        PagoMensual = (MontoPrestamo/12) + InteresMensual;
        System.out.println("El valor del pago mensual es: " + PagoMensual);
    }
}