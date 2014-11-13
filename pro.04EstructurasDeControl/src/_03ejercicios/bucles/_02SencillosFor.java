package _03ejercicios.bucles;

import java.util.Scanner;

public class _02SencillosFor {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int max = tec.nextInt();
        System.out.println("Impares hasta N");
        imparesHastaN(max);
        System.out.println("N impares");
        nImpares(max);
        System.out.println("Cuenta atrás");
        cuentaAtras(max);
        System.out.println("Suma N primeros");
        sumaNPrimeros(max);
        System.out.println("Mostrar divisores N");
        mostrarDivisoresN(max);
        System.out.println("Suma divisores N");
        sumaDivisoresN(max);
        
    }
    
    public static void imparesHastaN(int max){
        for(int n=1;n<max;n=n+2)
            System.out.println(n);
    }
    
    public static void nImpares(int max) {
        for(int num=1,cont=0;cont<max;num=num+2,cont++)
            System.out.println(num);
    }
    
    public static void cuentaAtras(int max) {
        for(;max>=0;max--)
            System.out.println(max);
    }
    
    public static void sumaNPrimeros(int max) {
        int suma=0;
        for(int cont=1;cont<=max;suma=suma+cont,cont++){}
        System.out.println(suma);
    }
    
    public static void mostrarDivisoresN(int max) {
        for(int cont=1;cont<=max;cont++)
            if(max%cont==0)
                System.out.println(cont);
    }
    
    public static void sumaDivisoresN(int max) {
        int suma=0;
        for(int cont=1;cont<max;cont++)
            if(max%cont==0){
                suma=suma+cont;
             }
        System.out.println(suma);
                
    }
}
