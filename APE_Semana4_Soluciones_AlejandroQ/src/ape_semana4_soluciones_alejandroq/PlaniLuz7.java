/*
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class PlaniLuz7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double kilovatioxhora, kilovatiosCons, planilla;
        int edad;
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        kilovatioxhora = teclado.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        kilovatiosCons = teclado.nextDouble();
        System.out.println("Dame tu edad");
        edad = teclado.nextInt();
        planilla = kilovatioxhora*kilovatiosCons;
        if (edad >= 65) {
            planilla = planilla - (planilla*10/100);
            System.out.println("El valor de la planilla es: " + planilla);
        }
        else {
            System.out.println("El valor de la planilla es: " + planilla);
        }
    }
}
