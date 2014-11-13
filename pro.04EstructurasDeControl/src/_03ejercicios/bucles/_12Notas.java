package _03ejercicios.bucles;

import java.util.Scanner;

public class _12Notas {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce tus notas");
        double nota,total=0;
        int contador=0,aprobados=0;
        
        do {
            nota = tec.nextDouble();
            if(nota>=0){contador++;
            total = total + nota;
            if(nota>=5)aprobados++;}
        } while (nota>=0);
        System.out.println("Has introducido " + contador + " notas");
        System.out.println("Has aprobado " + aprobados + " examen/es");
        System.out.format("La nota media es de un %4.2f\n",(total/contador));
    }
}
