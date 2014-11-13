package _02ejemplos;

import java.util.Scanner;

public class _09BucleAnidado2 {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        int num,i=1;
            do{
                System.out.println("Introduce número positivo " + i + ":");
                num = tec.nextInt();
                if(num<=0)
                    System.out.println("Te has equivocado");
                i++;
            } while (num<=0 && i<=5);
        
    }
}
