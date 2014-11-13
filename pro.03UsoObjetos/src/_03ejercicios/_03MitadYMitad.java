package _03ejercicios;

import pizarra.*;
import figuras.*;

public class _03MitadYMitad {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Rectangulo r1 = new Rectangulo(0, 0, 0, p.getAnchura()/2, p.getAltura());
        Rectangulo r2 = new Rectangulo(2, p.getAnchura()/2, 0, p.getAnchura()/2, p.getAltura());
        p.anyadir(r1);
        p.anyadir(r2);
    }
}