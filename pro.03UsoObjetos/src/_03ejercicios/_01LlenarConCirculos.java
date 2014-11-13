package _03ejercicios;

import figuras.*;
import pizarra.*;

public class _01LlenarConCirculos {
    public static void main(String args[]){
        Pizarra p = new Pizarra("Llenar con objetos",300,300);
        Circulo c = new Circulo(150,150,150);
        p.anyadir(c);
        

    }
}
