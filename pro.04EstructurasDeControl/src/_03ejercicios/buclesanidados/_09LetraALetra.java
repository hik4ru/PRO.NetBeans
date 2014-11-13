package _03ejercicios.buclesanidados;

import java.util.Scanner;

public class _09LetraALetra {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
            
            String texto="algo";
            while(!texto.equals("")){
                System.out.println("Introduce texto");
                texto = tec.nextLine();
            
                int longitud = texto.length();
                int cont=0;
                while(cont<longitud){
                    System.out.println(texto.charAt(cont));
                    cont++;
                }
            }
    }
}