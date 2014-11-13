package _02ejemplos;

import figuras.*;

public class _06StaticVsNoStatic {
    public static void main(String args[]){
        Circulo c1 = new Circulo(100,100,50);
        double c1area = Circulo.area(2);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Area: " + Circulo.area(c1.getRadio()));

    }
}
