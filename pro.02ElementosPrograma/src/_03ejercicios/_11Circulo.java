package _03ejercicios;
import java.util.*;
public class _11Circulo {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        double radio, longitud, area;
        
        System.out.println("Introduzca el radio de un círculo");
        radio = tec.nextDouble();
        longitud = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);
        
        System.out.format("La longitud de la circunferencia es %5.3f y el área del círculo es %5.3f\n",longitud, area);
        
    }
}
