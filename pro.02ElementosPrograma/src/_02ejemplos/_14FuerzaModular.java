package _02ejemplos;

import java.util.*;

public class _14FuerzaModular {
    public static void main(String args[]){
        
        double masa1 = leerDouble("Introduce masa 1");
        double masa2 = leerDouble("Introduce masa 2");
        double distancia = leerDouble("Introduce distancia");
        
        /*
        System.out.println("Introduce masa 1: ");
        double masa1 = tec.nextDouble();
        System.out.println("Introduce masa 2: ");
        double masa2 = tec.nextDouble();
        System.out.println("Introduce distancia de los objetos");
        double distancia = tec. nextDouble();
        */
                
        double fuerza = fuerza(masa1,masa2,distancia);
        //Al mencionar los elementos del método se cogerán por orden, no por nombre
        
        System.out.println("Fuerza: " + fuerza); 
        System.out.format("Fuerza: %6.2f", fuerza);

    }
    
    //Así pues, m1, m2 y d equivaldrán a masa1, masa2 y distancia porque siguen el mismo orden
    public static double fuerza(double m1, double m2, double d){
            final double G = 6.693E-11;
            return (m1*m2*G) / Math.pow(d,2);
    }
    
    public static double leerDouble(String texto){
        Scanner tec = new Scanner(System.in);
        System.out.println(texto);
        double numero = tec.nextDouble();
        return numero;
        
    }
}
