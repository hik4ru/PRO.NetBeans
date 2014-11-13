package _02ejemplos;
import java.util.*;
public class _07MediaDeTres {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        int a, b, c;
        double d;
        System.out.println("Introduce un número");
        a = tec.nextInt();
        System.out.println("Introduce otro número");
        b = tec.nextInt();
        System.out.println("Introduce otro número más");
        c = tec.nextInt();
        d = (a+b+c)/3.0;
        System.out.println("La media de los tres números anteriores es " +
                d);
        //ahora con la clase Format
        //Primero se anota el texto y luego anotamos las variables que salen
        //%d es un número entero y %f uno real
        //Con %5.2f indicamos que el número tendrá 5 caracteres y 2 de ellos decimales
        //Format no hace directamente el salto de línea, para ello usamos \n o %n al final
        System.out.format("La media de %d, %d y %d es %5.2f\n", a,b,c,d);
        //si ponemos el negativo antes del número de %f lo alineará a la izquierda
        System.out.format("La media de %d, %d y %d es %-5.2f\n", a,b,c,d);
        //Si colocamos un 0 antes del número, rellenará con ceros a la izquierda
        System.out.format("La media de %d, %d y %d es %05.2f\n", a,b,c,d);
    }
}
