package _02ejemplos;

import figuras.Circulo;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _03EjecutarMetodosDeUnObjeto {
    public static void main(String args[]){
        Pizarra p = new Pizarra("Prueba", 600,400);
        Circulo c = new Circulo(300, 200, 100);
        p.anyadir(c);

        Pizarra q = new Pizarra("Prueba", 600,400);
        Rectangulo r = new Rectangulo(300, 200, 100, 100);
        q.anyadir(r);
    }
}
