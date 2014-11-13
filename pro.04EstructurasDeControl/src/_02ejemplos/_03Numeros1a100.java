package _02ejemplos;

import java.util.Scanner;

public class _03Numeros1a100 {
    public static void main(String args[]) throws InterruptedException{
        Scanner tec = new Scanner(System.in);
        
            int num = 0;
            while (num <= 100){
                
                Thread.sleep(400);
                System.out.println(num);
                num = num + 5;
            }
    }
}
