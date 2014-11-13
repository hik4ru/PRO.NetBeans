package _03ejercicios;

import java.util.Scanner;

public class _22DiasDelMes {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce el numero de un mes para saber cuantos dias tiene");
            int mes = tec.nextInt();
            
            switch (mes){
                
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: System.out.println("31 dias");
                    break;
                case 2: System.out.println("28 dias, 29 en año bisiesto");
                    break;
                case 4:
                case 6:
                case 9:
                case 11: System.out.println("30 dias");
                    break;
                default: System.out.println("Mes erróneo");
            }
    }
}
