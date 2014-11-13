package _03ejercicios;

import figuras.Circulo;
import pizarra.Pizarra;

public class _07RadioAleatorio {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Circulo c = new Circulo(1,0,0,(int)(Math.random()*151)+50);
        p.anyadir(c);
    }
}
