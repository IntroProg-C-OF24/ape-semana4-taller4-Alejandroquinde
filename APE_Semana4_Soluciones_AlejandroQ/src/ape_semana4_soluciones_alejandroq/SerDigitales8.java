/*
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape_semana4_soluciones_alejandroq;
import java.util.Scanner;
public class SerDigitales8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoNetflix, costoYouP, costoDropbox, costoSpotify, planilla;
        int edad;
        System.out.println("Ingresa el valor del costo de Netflix");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de Youtube Premium");
        costoYouP = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de Dropbox");
        costoDropbox = teclado.nextDouble();
        System.out.println("Ingresa el valor del costo de Spotify");
        costoSpotify = teclado.nextDouble();
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();
        planilla = costoNetflix + costoYouP + costoDropbox + costoSpotify;
        if (edad < 30) {
            planilla = planilla - (planilla * 30/100);
            System.out.println("El valor total de la planilla es: " + planilla);
        }
        else {
            System.out.println("El valor total de la planilla es: " + planilla); 
        }
    }   
}