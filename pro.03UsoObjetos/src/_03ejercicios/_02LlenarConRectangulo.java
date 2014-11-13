package _03ejercicios;

import pizarra.*;
import figuras.*;

public class _02LlenarConRectangulo {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Rectangulo r = new Rectangulo(0, 0, p.getAnchura(), p.getAltura());
        p.anyadir(r);
    }
}
