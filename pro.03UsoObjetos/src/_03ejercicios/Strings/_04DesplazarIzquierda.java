package _03ejercicios.Strings;

import java.util.*;

public class _04DesplazarIzquierda {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce una palabra");
            String cosa = tec.next();
            String palabro1 = cosa.substring(0,1);
            String palabro2 = cosa.substring(1);
            
            System.out.println(palabro2+palabro1);
    }
}
