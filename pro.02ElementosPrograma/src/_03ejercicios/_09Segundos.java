package _03ejercicios;
import java.util.*;
public class _09Segundos {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        int cantidad, original, horas, minutos, segundos;
        System.out.println("Introduce una cantidad de segundos");
        cantidad = tec.nextInt();
        
        //mantener valor original en una variable
        original = cantidad;
        
        //horas
        horas = cantidad/3600;
        cantidad = cantidad%3600;
        
        //minutos
        minutos = cantidad/60;
        cantidad = cantidad%60;
        
        //segundos
        segundos = cantidad;
        
        //resultado
        System.out.println(original + " segundos equivalen a " + horas +
        " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}
