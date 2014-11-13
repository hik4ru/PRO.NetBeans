package _03ejercicios;
import java.util.Scanner;
public class _04Por2 {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        int a;
        System.out.println("Introduce un número");
        a = tec.nextInt();
        System.out.println("El doble de " + a + " es " + a*2);
        
        //Otra forma
        int b = a*2;
        System.out.println("El doble de " + a + " es " + b);
        
        //Otra más
        int a, b;
        a = tec.nextInt();
        b = a*2;
        System.out.println("El doble de " + a + " es " + b);
    }
}
