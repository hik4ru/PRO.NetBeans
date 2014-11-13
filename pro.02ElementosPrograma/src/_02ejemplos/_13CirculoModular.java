package _02ejemplos;

import java.util.*;

/**
 * Clase para ilustrar el funcionamiento de métodos
 * @author Hikaru
 */

public class _13CirculoModular {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce un radio: ");
        double radio = tec.nextDouble();
        
        double longitud = longitudCircunferencia(radio);
        System.out.println("Longitud de la circunferencia " + longitud);
        //La llamada a un método se puede hacer "al vuelo"
        System.out.println("Area del circulo: " + areaCirculo(radio));
        System.out.println("Volumen de la esfera: " + volumenEsfera(radio));
    }
    
    /**
     * Calcula la longitud de una circunferencia dado su radio.
     * @param radio el radio de la circunferencia
     * @return la longitud de la circunferencia
     */
    
    public static double longitudCircunferencia(double radio){
        double longitud = 2 * Math.PI * radio;
        return longitud;
    }
    
    //Los nombres de módulos y variables de otros modulos no están relacionados
    //Lo mismo con las variables de diferentes módulos
    
    public static double areaCirculo(double r){
        double resultado = Math.PI * r * r;
        return resultado;
    }
    
    public static double volumenEsfera(double r){
        return (4/3.0) * Math.PI * Math.pow(r, 3)
    }
}
