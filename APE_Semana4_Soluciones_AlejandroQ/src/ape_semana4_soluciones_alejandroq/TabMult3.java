/*
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por el usuario; 
solo en el caso que el valor del número esté entre 2 y 6.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class TabMult3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Ingresa un numero entre 2 y 6");
        numero = teclado.nextInt();
        if (numero>=2 && numero<=6){
            resultado = numero*1;
            System.out.println(numero + "x 1 = " + resultado);
            resultado = numero*2;
            System.out.println(numero + "x 2 = " + resultado);
            resultado = numero*3;
            System.out.println(numero + "x 3 = " + resultado);
            resultado = numero*4;
            System.out.println(numero + "x 4 = " + resultado);
            resultado = numero*5;
            System.out.println(numero + "x 5 = " + resultado);
            resultado = numero*6;
            System.out.println(numero + "x 6 = " + resultado);
            resultado = numero*7;
            System.out.println(numero + "x 7 = " + resultado);
            resultado = numero*8;
            System.out.println(numero + "x 8 = " + resultado);
            resultado = numero*9;
            System.out.println(numero + "x 9 = " + resultado);
            resultado = numero*10;
            System.out.println(numero + "x 10 = " + resultado);
            resultado = numero*11;
            System.out.println(numero + "x 11 = " + resultado);
            resultado = numero*12;
            System.out.println(numero + "x 12 = " + resultado); 
        }
        else {
            System.out.println("numero incorrecto");
        }    
    }  
}