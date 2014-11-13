package _03ejercicios;
import java.util.*;
public class _18Ejercicio {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce la masa");
        double masa = tec.nextDouble();
        double energia = masa * Math.pow(2.997925E8,2);
        System.out.println("La energía resultante es " + energia);
        
    }
}
