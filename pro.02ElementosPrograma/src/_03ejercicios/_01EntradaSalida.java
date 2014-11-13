package _03ejercicios;
import java.util.*;
public class _01EntradaSalida {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in); 
        int a, b; 
        System.out.println("Introduce un número entero");
        a = tec.nextInt(); 
        System.out.println("Introduce otro número entero");
        b = tec.nextInt(); 
        System.out.println("Los números introducidos son " + a + " y " + b);
    }
}

/* 
Al introducir un número real crea una excepción en el hilo "main" al ser un
tipo de caracter "int" (entero), que no es compatible con decimales. Lo mismo
ocurre si introducimos un caracter no numérico.
*/

/*
Al eliminar el import "java.util.*" da una excepcion porque necesita importar
la clase "Scanner" para poder recibir datos del teclado y leer éstos.
*/