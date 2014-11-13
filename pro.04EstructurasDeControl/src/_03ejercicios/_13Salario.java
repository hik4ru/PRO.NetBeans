package _03ejercicios;

import java.util.Scanner;

public class _13Salario {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce las horas que has trabajado");
            int horas = tec.nextInt();
            double salario, impuestos, ordinarias;
            
            if (horas <= 40){
                salario = horas*6;
                if (salario <= 350)
                    impuestos = salario * 0.98;
                else
                    impuestos = salario * 0.90;
            } else {
            
                horas = horas - 40;
                horas = horas * 10;
                ordinarias = 40 * 6;
                salario = horas + ordinarias;
                if (salario <= 350)
                    impuestos = salario * 0.98;
                else
                    impuestos = salario * 0.90;
            }
            
            System.out.println("Tu salario neto es " + impuestos);
                
                
    }
}
