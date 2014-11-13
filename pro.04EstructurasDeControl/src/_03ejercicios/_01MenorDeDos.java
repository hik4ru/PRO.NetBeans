package _03ejercicios;

import java.util.*;

public class _01MenorDeDos {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int numero1 = tec.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = tec.nextInt();
        
        if (numero1 > numero2)
            System.out.println(numero2);
        else
            if (numero1 < numero2)
                System.out.println(numero1);
        if (numero1 == numero2)
            System.out.println("Son iguales");
    }
}
