package _03ejercicios.bucles;

import java.util.Scanner;

public class _07Divisores {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce un número");
            int num = tec.nextInt();
            int cont = 1,contdiv = 0;
            System.out.println("Tres primeros divisores:");
            while(cont<=num && contdiv<3){
                    if(num%cont==0){
                        System.out.println(cont);
                        cont++;
                        contdiv++;
                    } else
                        cont++;
                }
    }
}
