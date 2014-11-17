package _03ejercicios.bucles;

import figuras.Circulo;
import pizarra.Pizarra;
import figuras.Figura;

public class _19CirculoCambiaColor {
    public static void main(String args[]){
        Pizarra p = new Pizarra("Circulo cambia de color",800,600);
        
        int colorAleatorio = (int) (Math.random() * 4);
        Circulo c = new Circulo(colorAleatorio, 400,300,200);
        p.anyadir(c);
        
        while(c.getColor() != Figura.ROJO){
            colorAleatorio = (int) (Math.random() * 4);
            c.setColor(colorAleatorio);
            p.esperar(250);
        }
    }
}
