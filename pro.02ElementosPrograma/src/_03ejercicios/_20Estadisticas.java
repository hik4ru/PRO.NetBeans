package _03ejercicios;

import java.util.*;

public class _20Estadisticas {
    
    /**
     * Dados tres valores reales introducidos por el usuario
     * calcular y mostrar su media
     * @param args 
     */
    
    public static void main(String args[]){
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce valor 1");
        double valor1 = tec.nextDouble();
        System.out.println("Introduce valor 2");
        double valor2 = tec.nextDouble();
        System.out.println("Introduce valor 3");
        double valor3 = tec.nextDouble();
        
        System.out.println("Introduce valor 1");
        
        //Media
        double media = (valor1+valor2+valor3)/3
        System.out.format("La media es %-5.2f \n",(valor1+valor2+valor3)/3);
        
        //Varianza
        double varianza = (Math.pow((media-valor1),2)+Math.pow((media-valor2),2)+Math.pow((media-valor3),2))/3;
        System.out.println("La varianza es " + varianza);
        
        //Desviación típica
        double desv = Math.sqrt(varianza);
        System.out.println("La desviación típica es " + desv);
    }
}
