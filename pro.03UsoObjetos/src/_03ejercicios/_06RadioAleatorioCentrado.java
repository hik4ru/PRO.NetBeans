package _03ejercicios;

import pizarra.*;
import figuras.*;

public class _06RadioAleatorioCentrado {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Circulo c = new Circulo(p.getAnchura()/2,p.getAltura()/2,(int)(Math.random()*151)+50);
        p.anyadir(c);
    }
}
