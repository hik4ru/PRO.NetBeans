package _03ejercicios;

import java.util.*;

public class _02MenorDeTres {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int numero1 = tec.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = tec.nextInt();
        System.out.println("Introduce otro número más");
        int numero3 = tec.nextInt();
        
        if (numero1 < numero2 && numero1 < numero3)
            System.out.println(numero1);
        else
            if (numero2 < numero1 && numero2 < numero3)
                System.out.println(numero2);
            else
                System.out.println(numero3);
    }
}
