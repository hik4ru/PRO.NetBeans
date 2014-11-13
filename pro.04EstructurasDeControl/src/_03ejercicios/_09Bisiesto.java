package _03ejercicios;

import java.util.Scanner;

public class _09Bisiesto {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce anyo: ");
            int anyo = tec.nextInt();
            if(esBisiesto(anyo)) System.out.println("El anyo " + anyo + " es bisiesto");
            else System.out.println("El anyo " + anyo + " no es bisiesto");
    }
    
    public static boolean esBisiesto(int anyo){
        if(anyo % 4 == 0){
            if(anyo % 100 == 0){
                if(anyo % 400 == 0) return true;
                    else return false; 
            } else return true;
        } else return false;
    }
}
