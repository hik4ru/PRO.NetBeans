package _03ejercicios.Strings;

import java.util.*;

public class _03Email {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce tu email");
        String email = tec.nextLine();
        
        int arroba = email.indexOf('@');
        String user = email.substring(0, arroba);
        System.out.println("username: " + user);
        
        int punto = email.indexOf('.');
        String subdominio = email.substring(arroba+1, punto);
        System.out.println("subdomain: " + subdominio);
        
        String dominio = email.substring(punto+1);
        System.out.println("domain: " + dominio);
    }
}
