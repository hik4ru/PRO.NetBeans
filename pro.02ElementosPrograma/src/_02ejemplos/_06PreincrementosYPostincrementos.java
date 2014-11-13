package _02ejemplos;

public class _06PreincrementosYPostincrementos {
    public static void main(String args[]){
        int a = 3, b, c= 5, d;
        b = a++;
        d= ++b + c++;
        System.out.println( "a = " + a);
        System.out.println( "b = " + b);
        System.out.println( "c = " + c);
        System.out.println( "d = " + d);
    }
}
