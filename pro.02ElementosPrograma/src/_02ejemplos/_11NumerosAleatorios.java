package _02ejemplos;
import java.util.*;
public class _11NumerosAleatorios {
    public static void main(String args[]){
        
        //Numero en el intervalo [0,1[
        System.out.println(Math.random());
        
        //Numero real entre [0,5[
        System.out.println(Math.random()*5);
        
        //Numero real entre [1,6[
        System.out.println(Math.random()*5 + 1);
        
        //Numero entero entre [1,6[
        System.out.println((int)(Math.random()*5 + 1));
        
        //Numero entero entre [1,6[
        System.out.println((int)(Math.ceil(Math.random()*6)));
        
        //Numero entero entre [a,b[
        int a, b;
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número");
        a = tec.nextInt();
        System.out.println("Introduce otro número");
        b = tec.nextInt();
        System.out.println((int)(a + Math.random() * (b - a + 1)));
        
        
    }
}
