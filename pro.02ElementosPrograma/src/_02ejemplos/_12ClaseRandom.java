package _02ejemplos;

import java.util.Random;

public class _12ClaseRandom {
    public static void main(String args[]){
        
        //La clase Random genera aleatorios de distintos tipos
        Random r = new Random();
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextInt(5));
        //Número entre 0 y el que le damos ↑
        
        //Permite reproducir experimentos indicando una semilla
        Random r2 = new Random(25);
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextInt(5));
    }
}
