package _02ejemplos;
import java.util.Scanner;
public class _03EntradaTeclado {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = tec.nextLine();
        // El comando tec.nextLine lee todo lo que introduzca el usuario hasta el salto de línea
        
        System.out.println("Introduzca su edad");
        int edad = tec.nextInt();
        
        System.out.println("Te llamas " + nombre + " y tienes " + edad+ " años");
    }
}
