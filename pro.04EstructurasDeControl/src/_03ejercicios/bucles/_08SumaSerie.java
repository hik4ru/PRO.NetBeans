package _03ejercicios.bucles;

import java.util.Scanner;

public class _08SumaSerie {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int num = tec.nextInt();
        int contador;
        double suma=0;
        for(contador=1;contador<=num;contador++){
            suma = suma + 1.0/contador;
        }
        System.out.println("Resultado: " + suma);
    }
}
