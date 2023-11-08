/*
Generar un algoritmo que permite calcular y presentar el área de un triángulo. 
Los datos deben ser pedidos al usuario.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class AreaTriangulo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double baseTriangulo, alturaTriangulo, areaTriangulo;
        System.out.println("Ingrese el valor correspondiente a la base del triangulo");
        baseTriangulo = teclado.nextDouble();
        System.out.println("Ingrese el valor correspondiente a la altura del triangulo");
        alturaTriangulo = teclado.nextDouble(); 
        areaTriangulo = (baseTriangulo * alturaTriangulo)/2; 
        System.out.println("El area del triangulo es: " + areaTriangulo);
    }   
}