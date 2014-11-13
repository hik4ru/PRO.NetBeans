package _03ejercicios;

public class _12Dados {
    public static void main(String args[]){

        int dado1 = (int)(Math.ceil(Math.random()*6));
        int dado2 = (int)(Math.ceil(Math.random()*6));
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Puntuación total: " + (dado1 + dado2));
        
    }
}
