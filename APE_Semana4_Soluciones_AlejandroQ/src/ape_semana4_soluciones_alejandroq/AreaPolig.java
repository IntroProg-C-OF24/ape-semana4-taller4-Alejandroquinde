/*
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; 
El área de un triángulo rectángulo se calcula multiplicando su base por su altura, y luego dividiendo el resultado entre dos; 
Finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class AreaPolig {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double var1, var2, areaPol;
        System.out.println("Ingresa el valor correspondiente a un lado del cuadrado");
        var1 = teclado.nextDouble();
        System.out.println("Ingresa el valor correspondiente a la altura de un triangulo");
        var2 = teclado.nextDouble();
        areaPol = (((var1*var2)/2)*5) + (var1 * var1);
        System.out.println("El area del poligono vale: " + areaPol);
    }   
}