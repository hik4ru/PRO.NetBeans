package _03ejercicios;

import java.util.*;

public class _15Redondear2 {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número con decimales");
        double numero = tec.nextDouble();
        double multiplicado = numero * 100;
        double rounded = Math.round(multiplicado);
        double redondeado = rounded / 100;
        System.out.println("El numero " + numero +
                " redondeado a dos decimales es " + redondeado);
        
    }
}
