package _03ejercicios;

import java.util.Scanner;

public class _17Editorial {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Tipo de publicación: ");
        String tipo = tec.next();
        System.out.println("Cantidad: ");
        int cantidad = tec.nextInt();
        System.out.println("Precio unitario: ");
        double precio = tec.nextDouble();
        
        double coste = calcularCoste(tipo,precio,cantidad);
        System.out.println("Coste del pedido " + coste);
            
    }
    
    public static double calcularCoste(String tipo, double precio, int unidades){
        double descuento = 0;
        if(tipo.toLowerCase().equals("libro")) {
            if (unidades <= 5) descuento = 0;
            else if (unidades <= 10) descuento = 10;
            else if (unidades <= 20) descuento = 15;
            else descuento = 20;
                
        } else if (tipo.toLowerCase().equals("libro")) {
            if (unidades <= 5) descuento = 0;
            else if (unidades <= 10) descuento = 15;
            else if (unidades <= 20) descuento = 20;
            else descuento = 25;
            
        } else {
            return 0;
        }
        double coste = precio * unidades;
        coste = coste - coste * descuento/100;
        return coste;
    }
}
