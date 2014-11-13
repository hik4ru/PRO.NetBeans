package _02ejemplos;

import java.util.Scanner;

public class _05LeerEdades {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
            
            System.out.println("¿Cuántas edades quieres introducir?");
            int limite = tec.nextInt();
            int cont = 0; //Numero de valores introducidos por el usuario
            int suma = 0; //Suma de los valores introducidos por el usuario
            
            while (cont < limite){
            System.out.println("Introduce edad:");
            int edad = tec.nextInt();
            cont++;
            suma = suma + edad;
            }
            
            System.out.println("Media de las edades introducidas: " + (double)suma/cont);
            
    }
}
