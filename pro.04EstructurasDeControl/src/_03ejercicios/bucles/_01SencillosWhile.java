package _03ejercicios.bucles;

import java.util.Scanner;

public class _01SencillosWhile {
    
    static Scanner tec = new Scanner(System.in);
    
    public static void main(String args[]){
        System.out.println("Introduce un número");
        int max = tec.nextInt();
        System.out.println("Impares hasta N");
        imparesHastaN(max);
        System.out.println("N números impares");
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
        int num = 1;
        while (num < max) {
            System.out.println(num);
            num = num + 2;
        }
    }
    public static void nImpares(int max) {
        int num = 1;
        int cont = 0;
        while (cont < max){
            System.out.println(num);
            num = num +2;
            cont++;
        }
    }
    public static void cuentaAtras(int num) {
        while (num >= 0){
            System.out.println(num);
            num--;
        }
    }
    public static void sumaNPrimeros(int max) {
        int cont = 1, suma = 0;
        while (cont <= max){
            suma = suma + cont;
            cont++;
        }
        System.out.println(suma);
    }
    public static void mostrarDivisoresN(int max) {
        int cont = 1;
        while (cont <= max){
            if (max%cont==0){
                System.out.println(cont);
                cont++;
            } else cont++;
        }
    }
    public static void sumaDivisoresN(int max) {
        int cont = 1,suma = 0;
        while (cont < max){
            if (max % cont==0){
                suma = suma + cont;
                cont++;
            } else cont++;
        }
        System.out.println(suma);
    }
}
