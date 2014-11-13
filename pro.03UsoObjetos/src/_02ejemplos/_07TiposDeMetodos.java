package _02ejemplos;

import java.util.*;

public class _07TiposDeMetodos {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        String frase = "Hola radiola me pones un ejemplo ke ase";
        System.out.println(frase);
        
        // charAt devuelve el valor de un caracter respecto a un índice
        // El número en charAt indicaría el número del caracter que se quiere indicar
        System.out.println("charAt: " + frase.charAt(0));
        
        // indexOf devuelve el valor en el que empieza la palabra indicada
        System.out.println("indexOf de 'radiola': " + frase.indexOf("radiola"));
    }
}
