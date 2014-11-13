package _03ejercicios;

import figuras.Rectangulo;
import pizarra.Pizarra;

public class _04DosPartes {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Rectangulo r1 = new Rectangulo(0, 0, 0, p.getAnchura(), p.getAltura());
        Rectangulo r2 = new Rectangulo(2, 0, p.getAltura()/4, p.getAnchura(), p.getAltura());
        p.anyadir(r1);
        p.anyadir(r2);
    }
}
