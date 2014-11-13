package _03ejercicios.bucles;

import java.util.Scanner;

public class _11Containers2 {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            double peso,total=0;
            int cont=0;
            boolean barcoLleno = false;
            
            do {
                System.out.println("Introduce el peso de los containers");
                peso = tec.nextDouble();
                
                if(total + peso > 700)
                    barcoLleno = true;
                else {
                    total = total + peso;
                    cont++;
                    if(total == 700 || cont == 100)
                        barcoLleno = true;
                }
                
            } while (barcoLleno == false);
            
            System.out.println("Se han introducido " + cont + " containers");
            System.out.println("El peso total hace la suma de " + total + " kgs");
            } 
    }
}
