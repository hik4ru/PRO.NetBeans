package _02ejemplos;

import pizarra.*;
import figuras.*;

public class _04MoverFigura {
    public static void main(String args[]){
        Pizarra p = new Pizarra("Mover figuras", 600, 400);
        Circulo c1 = new Circulo(200, 100, 50);
        Circulo c2 = new Circulo (Figura.ROJO,350,100,50);
        p.anyadir(c1);
        p.anyadir(c2);
        
        p.esperar(2000);
        
        //Cambiamos las figuras de posición
        //c1 bajará y c2 se moverá a la derecha
        c1.setPosy(200);
        c2.setPosx(450);
        
        p.esperar(2000);
        
        //Mover de otro modo
        
        int nuevaPosiciony = c1.getPosy()+100;
        c1.setPosy(nuevaPosiciony);

    }
}
