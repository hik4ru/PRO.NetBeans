package _03ejercicios;
import java.util.*;
public class _07Superficie {
    public static void main(String args[]){
            Scanner tec = new Scanner(System.in);
            Double longitud, anchura;
            System.out.println("Introduce la longitud");
            longitud = tec.nextDouble();
            System.out.println("Introduce la anchura");
            anchura = tec.nextDouble();
            System.out.println("La superficie resultante es " + longitud*anchura);
    }
}
