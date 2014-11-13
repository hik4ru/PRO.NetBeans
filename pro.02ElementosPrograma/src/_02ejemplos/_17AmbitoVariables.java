package _02ejemplos;

public class _17AmbitoVariables {
    
    static int g = 0; //g es una variable global   
    
    public static void main(String args[]){
        int a = 0; //local al metodo main
        //solo se puede acceder desde dentro del método
        System.out.println(a);
        
        int b = 0; //local al metodo main
        System.out.println(b);
        
        //int b; Error porque b ya está declarada en main 
        
        inf(a>b){
            int num = 20; //num es local al bloque de código
            System.out.println(num);
        }
        System.out.println(num); //Error porque num es local al blóque de código
        
        System.out.println(b);
        System.out.println(g);
        g = 20
    }
        
    }
    public static void metodo1(int x){
        //System.out.println(a); Error porque metodo1 no tiene acceso a la variable a
        int b = 7; //local a metodo1
        System.out.println(b);
        
    }
    public static void metodo2(int x){
        double b = 5.5;
        //int x; Error porque x ya está declarada en metodo2
        
    }
}
