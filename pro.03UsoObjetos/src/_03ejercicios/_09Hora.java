package _03ejercicios;

import java.util.*;

public class _09Hora {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce la hora:");
        String hora = tec.nextLine();
        
        System.out.println("Hora: " + hora.substring(0,2));
        System.out.println("Minutos: " + hora.substring(3,5));
        System.out.println("Segundos: " + hora.substring(6,8));
    }
}
