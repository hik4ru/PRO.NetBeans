package _02ejemplos;

public class _15MetodoSinResultado {
    public static void main(String args[]){
        saludar("Juan");
        saludar("Miguel");
        saludar("Ana");
    }
    
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
}
