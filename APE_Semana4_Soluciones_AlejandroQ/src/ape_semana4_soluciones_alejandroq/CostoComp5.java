/*
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class CostoComp5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double CostoCPU, CostoTecl, CostoPant, Costoraton, total;
        System.out.println("Ingresa el costo del CPU");
        CostoCPU = teclado.nextDouble();
        System.out.println("Ingresa el costo del teclado");
        CostoTecl = teclado.nextDouble();
        System.out.println("Ingresa el costo de la pantalla");
        CostoPant = teclado.nextDouble();
        System.out.println("Ingresa el costo de el raton");
        Costoraton = teclado.nextDouble();
        total = CostoCPU + CostoTecl + CostoPant + Costoraton;
        System.out.println("El valor de la computadora de escritorio es: " + total);
    }   
}