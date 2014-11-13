package _02ejemplos;

public class _05VariablesYLiterales {
    public static void main(String args[]){
        //declarar variable
        int a;
        
        //declarar e inicializar
        int b = 5;
        
        //declarar varias variables del mismo tipo
        double c, d, e = 5.0;
        long f, g;
        float h, i;
        
        //literales
        a = 5;
        f = 5;
        //aunque hayamos puesto que la variable f es "long", si no colocamos la L al final, java la transforma en "int"
        f = 9995546454545464L;
        //como la variable de tipo int no admite un numero tan largo hay que ponerle la L para que se vuelva "long"
        
        c = 2.5;
        d = 2.5E200;
        //la E significa "*10^", es notación cientifica
        h = 2.5;
        //como la variable h es de tipo "float" y el número no cabe en ese tipo, tenemos que añadir la F al final para volverlo un tipo "double"
        
    }
}
