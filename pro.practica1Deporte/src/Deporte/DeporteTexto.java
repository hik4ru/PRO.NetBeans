package Deporte;

import static Deporte.Salud.*;
import java.util.*;

public class DeporteTexto {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("¿Eres (H)ombre o (M)ujer?");
        char sexo = tec.next().toUpperCase().charAt(0);
        
        System.out.println("");
        
        System.out.println("Introduce tu edad");
        int edad = tec.nextInt();
        
        System.out.println("");
        
        System.out.println("Introduce tu frecuencia cardíaca en reposo (FCR)");
        int fcr = tec.nextInt();
        
        System.out.println("");
        
        System.out.println("Tu frecuencia cardíaca máxima es " + calcularFCM(edad, sexo));
        System.out.println("Según la intensidad de tu entrenamiento, tu frecuencia cardíaca será:");
        System.out.println("Rango A, Intensidad 50-60%, Acondicionamiento básico: " + (int)calcularFCE(edad,sexo,fcr,50)+"-"+(int)calcularFCE(edad,sexo,fcr,60));
        System.out.println("Rango B, Intensidad 60-70%, Mantenimiento físico y salud: " + (int)calcularFCE(edad,sexo,fcr,60)+"-"+(int)calcularFCE(edad,sexo,fcr,70));
        System.out.println("Rango C, Intensidad 70-80%, Buena condición física: " + (int)calcularFCE(edad,sexo,fcr,70)+"-"+(int)calcularFCE(edad,sexo,fcr,80));
        System.out.println("Rango D, Intensidad 80-90%, Deportistas de alto nivel: " + (int)calcularFCE(edad,sexo,fcr,80)+"-"+(int)calcularFCE(edad,sexo,fcr,90));
        
        System.out.println("");
        
        System.out.println("Introduce tu estatura");
        int estatura = tec.nextInt();
        
        System.out.println("");
                
        System.out.println("Introduce tu peso");
        int peso = tec.nextInt();
        
        System.out.println("");
        
        System.out.format("Tu IMC es %5.2f\n", calcularIMC(peso,estatura)*10000);
        
    }
}
