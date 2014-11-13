package _02ejemplos;

/**
 * Pretendemos hacer un método que reduzca un número a la mitad.
 * Lo vamos a resolver de dos formas, una correcta y una incorrecta.
 * 
 * @author Hikaru
 */

public class _18PasoParametrosPorValor {
    
    public static void main(String args[]){
        
        double x = 40.8;
        System.out.println("Antes de llamar al primer método: " + x);
        reducirALaMitad1(x);
        System.out.println("Después de llamar al primer método: " + x);
        
        System.out.println("Antes de llamar al segundo método: " + x);
        x = reducirALaMitad2(x);
        System.out.println("Después de llamar al segundo método: " + x);
        
    }
    
    public static void reducirALaMitad1(double numero){
        numero = numero / 2;
    }
    
    public static double reducirALaMitad2(double numero){
        return numero / 2;
    }
}
