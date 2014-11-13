package _03ejercicios;

import pizarra.*;
import figuras.*;

public class _08AgrandarCirculo {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Circulo c = new Circulo(Figura.ROJO,0,0,(int)Math.random()*101+100);
        p.anyadir(c);
        
        p.esperar(1000);
        
        c.setRadio((int)(c.getRadio()*1.5));

    }
}
