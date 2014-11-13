package _02ejemplos;

import java.util.*;

public class _16MetodoSinResultado {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        //Los decibales se introducen con ,
        System.out.println("Introduce valor real: ");
        double d1 = tec.nextDouble();
        
        cambiarSeparador(tec);
        //Ahora los decimales se introducen con .
        System.out.println("Introduce valor real: ");
        double d2 = tec.nextDouble();

    }
    
    public static void cambiarSeparador(Scanner s){
        s.useLocale(Locale.US);
    }
}
