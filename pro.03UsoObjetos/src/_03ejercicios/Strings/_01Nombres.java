package _03ejercicios.Strings;

import java.util.*;

public class _01Nombres {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce nombre completo:");
        String nombreCompleto = tec.nextLine();
        
        System.out.println("Inicial: " + inicial(nombreCompleto));
        System.out.println("Última letra: " + ultima(nombreCompleto));
        System.out.println("Nombre: " + primeraPalabra(nombreCompleto));
        System.out.println("Primer apellido: " + segundaPalabra(nombreCompleto));
        System.out.println("Segundo apellido: " + terceraPalabra(nombreCompleto));
    }
    public static char inicial(String texto){
        return texto.toUpperCase().charAt(0);
    }
    public static char ultima(String texto){
        int ultimaPosicion = texto.length()-1;
        return texto.toUpperCase().charAt(ultimaPosicion);
    }
    public static String primeraPalabra(String texto){
        int posPrimerEspacio = texto.indexOf(' ');
        String primeraPalabra = texto.substring(0,posPrimerEspacio);
        return primeraPalabra;
        //return texto.substring(0,texto.indexOf(' '));
    }
    public static String segundaPalabra(String texto){
        int posPrimerEspacio = texto.indexOf(' ');
        int posSegundoEspacio = texto.indexOf(' ', posPrimerEspacio+1);
        String segundaPalabra = texto.substring(posPrimerEspacio+1, posSegundoEspacio);
        return segundaPalabra;
    }
    public static String terceraPalabra(String texto){
        int posUltimoEspacio = texto.lastIndexOf(' ');
        return texto.substring(posUltimoEspacio+1);
    }
}
