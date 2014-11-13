package _03ejercicios.bucles;

import pizarra.Pizarra;
import figuras.Circulo;

public class _14CirculoMovimientoHorizontal {
    public final static int Desplazamiento = 2;
    public final static int Espera = 10;
    
    public static void main(String args[]){
        Pizarra p = new Pizarra("movimiento horizonal", 300,200);
        Circulo c = new Circulo(20,20,20);
        p.anyadir(c);
        int x=0;
        
        while(x==0){
        while(c.getPosx()+c.getRadio() < p.getAnchura()){
            //int nuevaPosx = c.getPosx() +10;
            //c.setPosx(nuevaPosx);
            c.setPosx(c.getPosx()+Desplazamiento);
            p.esperar(Espera);
        }
        while(c.getPosy()+c.getRadio() < p.getAltura()){
            c.setPosy(c.getPosy()+Desplazamiento);
            p.esperar(Espera);
        }
        while(c.getPosx() - c.getRadio() > 0){
            c.setPosx(c.getPosx()-Desplazamiento);
            p.esperar(Espera);
        }
        while(c.getPosy() - c.getRadio() > 0){
            c.setPosy(c.getPosy()-Desplazamiento);
            p.esperar(Espera);
        }
        }
    }
}
