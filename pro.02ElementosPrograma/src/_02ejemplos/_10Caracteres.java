package _02ejemplos;

public class _10Caracteres {
    public static void main(String args[]){
        //Una variable entera y una de tipo char
        int num = 65;
        char letra = 'M';
        System.out.println(num);
        System.out.println(letra);
        
        //Un entero se puede interpretar como un carácter
        System.out.println((char)num);
        //Un carácter se puede interpretar como un número
        System.out.println((int)letra);
        
        //Para transformar un carácter a otro formato hay que poner entre
        //comillas el tipo al que queremos que se transforme
        
        /*
        Esto nos serviría, por ejemplo para poder realizar un aumento
        a una letra y obtener la siguiente en el alfabeto
        */
        letra ++;
        System.out.println(letra);
        //pasar una letra de minúscula a mayúscula
        char minuscula = 'p';
        char mayuscula = (char) (minuscula - 32);
        char mayuscula1 = (char) ('a' - 'A');
        
        //Secuencias de escape
        //Para que se muestre Él dijo "hola"
        System.out.println("Él dijo \"hola\"");
        
    }
}
