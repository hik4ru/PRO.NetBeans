package _03ejercicios;

import java.util.*;

public class _14PenultimaCifra {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = tec.nextInt();
        int cifra = (numero%100)/10;
        System.out.println("La penúltima cifra de " + numero + " es " + cifra);
        
    }
}
