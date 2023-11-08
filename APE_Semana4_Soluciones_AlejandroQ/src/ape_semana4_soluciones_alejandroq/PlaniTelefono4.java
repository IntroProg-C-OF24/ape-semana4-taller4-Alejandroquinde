/*
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class PlaniTelefono4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoxmin, minconsumidos, totalPagar;
        System.out.println("Ingresa el valor correspondiente al costo por minuto");
        costoxmin = teclado.nextDouble();
        System.out.println("Ingresa el valor correspondiente a los minutos consumidos en el mes");
        minconsumidos = teclado.nextDouble();
        totalPagar = costoxmin * minconsumidos;
        System.out.println("El valor de la planilla es: $" + totalPagar);
    }   
}