package ecuacion;

import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
            double a,b,c,x,x1,x2,r,i,interruptor=0;
            
            if(args.length==3){
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                c = Double.parseDouble(args[2]);
            } else if(args.length==0){
            System.out.println("Introduce A");
            a = tec.nextDouble();
            System.out.println("Introduce B");
            b = tec.nextDouble();
            System.out.println("Introduce C");
            c = tec.nextDouble();
            } else {
                a=0;b=0;c=0;
                interruptor=1;
            }
                
            if (interruptor==0){
            if (a==0 && b==0 && c==0)
                System.out.println("Ecuación infinita");
            else {
                if (a==0 && b==0 && c!=0) 
                    System.out.println("Ecuación incorrecta");
                else {
                    if (a==0 && b!=0){
                        x = (-c)/b;
                        System.out.println("Ecuación de primer grado. Resultado: " + x);
                    } else {
                        if (calcularDiscriminante(a,b,c) == 0) {
                            x = ((-b)+Math.pow(calcularDiscriminante(a,b,c),-2))/2*a; 
                            System.out.println("Resultado: " + x);
                        } if (calcularDiscriminante(a,b,c) > 0){
                            x1 = ((-b)+Math.pow(calcularDiscriminante(a,b,c),-2))/2*a;
                            x2 = ((-b)-Math.pow(calcularDiscriminante(a,b,c),-2))/2*a;
                            System.out.println("Resultado 1: " + x1);
                            System.out.println("Resultado 2: " + x2);
                        } else {
                            r = (-b)/2*a;
                            i = (Math.pow(b,2)-4*a*c)/2*a;
                            System.out.println("Resultado 1: " + r + " + " + i+"i");
                            System.out.println("Resultado 2: " + r + " - " + i+"i");
                        }
                    }
                }
            }
            } else {System.out.println("Los datos proporcionados el programa son incorrectos. \n" +
"Uso: Ecuacion coeficiente_a coeficiente_b coeficiente_c");}
                    
    }
    public static double calcularDiscriminante(double a,double b,double c) {
        double dsc = Math.pow(b,2)-4*a*c;
        return dsc;
    }
    
}
