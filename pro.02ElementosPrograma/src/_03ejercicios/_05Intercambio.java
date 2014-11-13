package _03ejercicios;
import java.util.*;
public class _05Intercambio {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        double v1, v2;
        
        System.out.println("Introduce un valor real");
        v1 = tec.nextDouble();
        System.out.println("Introduce otro valor real");
        v2 = tec.nextDouble();
                
        System.out.println("Antes de intercambiar:");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
        // Intercambiamos v1 y v2
        
        double hopity = v1;
        v1 = v2;
        v2 = hopity;
        
        // -----------
        
        System.out.println("Después de intercambiar:");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
    }
}
