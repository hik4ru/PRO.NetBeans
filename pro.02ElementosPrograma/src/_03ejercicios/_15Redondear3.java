package _03ejercicios;

import java.util.*;

public class _15Redondear3 {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número con decimales");
        double numero = tec.nextDouble();
        System.out.println("¿A cuántos decimales quieres redondearlo?");
        int decimales = tec.nextInt();
        double multiplicado = numero * Math.pow(10, decimales);
        double rounded = Math.round(multiplicado);
        double redondeado = rounded / Math.pow(10, decimales);
        System.out.println("El numero " + numero +
                " redondeado a dos decimales es " + redondeado);
        
    }
}
