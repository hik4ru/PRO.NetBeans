package _03ejercicios;

import java.util.*;

public class _15Redondear {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número con decimales");
        double numero = tec.nextDouble();
        double multiplicado = numero * 10;
        double rounded = Math.round(multiplicado);
        double redondeado = rounded/10;
        System.out.println("El numero " + numero +
                " redondeado a un decimal es " + redondeado);
        
    }
}
