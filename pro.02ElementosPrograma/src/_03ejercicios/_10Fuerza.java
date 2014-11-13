package _03ejercicios;
import java.util.*;
public class _10Fuerza {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        double m1, m2, d, d2, f;
        final double G = 6.693E-11;
        /*
        "final" hace que la variable se vuelva una constante, es decir, que no
        se puedan modificar.
        Las constantes deberán estar siempre en mayúscula para que no se confundan
        con las variables.
        */
        
        //introducir una masa
        System.out.println("Introduzca la masa del cuerpo 1 en kilos");
        m1 = tec.nextDouble();
        
        //introducir otra masa
        System.out.println("Introduzca la masa del cuerpo 2 en kilos");
        m2 = tec.nextDouble();
        
        //introducir la distancia
        System.out.println("Introduzca la distancia entre estos cuerpos en metros");
        d = tec.nextDouble();
        
        //calcular la fuerza de atracción
        d2 = Math.pow(d, 2);
        f = (g*m1*m2)/d2;
        System.out.println("La fuerza de atracción entre estos cuerpos es de "
        + f + " newtons.");
    }
}
