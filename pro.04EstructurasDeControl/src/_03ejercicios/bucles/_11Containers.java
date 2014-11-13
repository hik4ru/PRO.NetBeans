package _03ejercicios.bucles;

import java.util.Scanner;

public class _11Containers {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            double peso,total=0;
            int cont=0;
        
            do {
                System.out.println("Introduce el peso de los containers");
                peso = tec.nextDouble();
                total = total + peso;
                cont++;
            } while (total < 700 && cont <=100);
            
            if (total > 700 || cont > 100){
                System.out.println("Se han introducido " + (cont-1) + " containers");
                System.out.println("El peso total hace la suma de " + (total-peso) + " kgs");
                
            } else {
                System.out.println("Se han introducido " + cont + " containers");
                System.out.println("El peso total hace la suma de " + total + " kgs");
            } 
    }
}
