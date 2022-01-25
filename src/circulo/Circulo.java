/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;
import java.util.Scanner;

/**
 *
 * @author monse
 */
public class Circulo {

    final static double PI=3.1416;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            // TODO Apéndice de método generado automáticamente
            try
            {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce el radio:");
		double r=s.nextDouble();
		CalculaArea(r);
                CalculaLongitud(r);
            }
            catch (Exception e)
            {
                    System.out.println(e.getMessage());
            }
            
	
    }
    public static void CalculaArea(double r) {
        double area=(PI*r*r);
	System.out.printf("El valor del área del círculo es %f\n", area);
        System.out.printf("El valor del área del círculo es %d\n", Math.round(area));
    }
    public static void CalculaLongitud(double r){
        double longitud=2*PI*r;
        System.out.printf("El valor de la longitud del círculo es %f\n",longitud);
        System.out.printf("El valor de la longitud del círculo es %d\n",Math.round(longitud));
    }
}
