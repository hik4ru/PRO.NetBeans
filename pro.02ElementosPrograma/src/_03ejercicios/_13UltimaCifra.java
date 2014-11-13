package _03ejercicios;
import java.util.*;
public class _13UltimaCifra {
    public static void main(String args[]){
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = tec.nextInt();
        int cifra = numero%10;
        System.out.println("La última cifra de " + numero + " es " + cifra);
        
    }
}
