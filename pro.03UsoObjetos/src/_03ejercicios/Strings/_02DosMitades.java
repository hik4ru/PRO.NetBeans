package _03ejercicios.Strings;

import java.util.*;

public class _02DosMitades {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = tec.nextLine();
        System.out.println(frase.substring(0,frase.length()/2));
        System.out.println(frase.substring(frase.length()/2));
    }
}
