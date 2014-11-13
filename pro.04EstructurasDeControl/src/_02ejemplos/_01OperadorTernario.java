package _02ejemplos;

import java.util.Scanner;

public class _01OperadorTernario {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce tu edad: ");
            int edad = tec.nextInt();
            
            if (edad >= 18) System.out.println("Eres MAYOR de edad");
            else System.out.println("Eres MENOR de edad");
            
            System.out.println("Eres " + (edad >= 18?"MAYOR":"MENOR") + " de edad");
    }
}
