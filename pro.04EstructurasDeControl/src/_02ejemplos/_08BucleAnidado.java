package _02ejemplos;

import java.util.Scanner;

public class _08BucleAnidado {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        int num;
        for (int i=1 ; i<=5; i++){
            do{
                System.out.println("Introduce número positivo " + i + ":");
                num = tec.nextInt();
                if(num<=0)
                    System.out.println("Te has equivocado");
            } while (num<=0);
        }
    }
}
