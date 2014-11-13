package _03ejercicios.Strings;

import java.util.Scanner;

public class _05desplazarDerecha {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce una palabra:");
        String palabra = tec.nextLine();
        
        String trozo1 = palabra.substring(0,palabra.length()-1); 
        String trozo2 = palabra.substring(palabra.length()-1);
        System.out.println(trozo2+trozo1);
    }
}
