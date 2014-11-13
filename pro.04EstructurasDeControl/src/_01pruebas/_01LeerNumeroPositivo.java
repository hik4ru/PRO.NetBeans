package _01pruebas;

import java.util.Scanner;

public class _01LeerNumeroPositivo {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número positivo");
        int num = tec.nextInt();
        
        while(num<0){
            System.out.println("El número introducido es negativo");
            System.out.println("Introduce un número positivo");
            num = tec.nextInt();
        }
        System.out.println("El número introducido es: " + num);
        
        //----------------
        
        do {
            System.out.println("Introduce un número positivo");
            num = tec.nextInt();
            //Si la variable se declara dentro de las llaves, fuera no existiría
        } while (num<0)
                System.out.println("El número introducido es: " + num);
    }
}
