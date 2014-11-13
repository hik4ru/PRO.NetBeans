package _02ejemplos;

public class _09Desbordamiento {
    public static void main(String args[]){
        byte a = 127;
        System.out.println(a);
        
        a++;
        System.out.println(a);
        
        /*
        Al estar en el límite numério del tipo "Byte" (127), si aumentamos en 1
        el numerador de la variable "a", esta se desborda y empieza desde abajo
        */
        
    }
}
