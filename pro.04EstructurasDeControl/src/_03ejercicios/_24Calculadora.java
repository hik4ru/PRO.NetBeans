package _03ejercicios;

import java.util.Scanner;

public class _24Calculadora {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce un número sobre el que se operará");
            double num1 = tec.nextDouble();
            System.out.println("Introduce un operador (suma, resta, multiplicacion, division)");
            char operador = tec.next().charAt(0);
            System.out.println("Introduce el numero que operará");
            double num2 = tec.nextDouble();
            int signo;
            
            switch (operador){
                case '+': System.out.println(num1 + num2);
                    break;
                case '-': System.out.println(num1 - num2);
                    break;
                case '*': System.out.println(num1 * num2);
                    break;
                case '/': System.out.println(num1 / num2);
                    break;
                default: System.out.println("Divisor erróneo");
                    
            /*
            Si se intenta comparar datos de tipo no primitivo (como String)
            dará error, y se tiene que usar NombreDeLaVariable.equals("algo")
            */
            }
    }
}
