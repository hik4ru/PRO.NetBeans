package _03ejercicios;

import java.util.Scanner;

public class _18Taxi {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("¿Cuántas horas ha durado el recorrido?");
            int hora = tec.nextInt();
            System.out.println("¿Cuántos minutos, además de las horas, ha durado el recorrido?");
            int minutos = tec.nextInt();
            System.out.println("¿Qué día de la semana se ha realizado el trayecto? (Del 1 al 7)");
            int dia = tec.nextInt();
            System.out.println("¿Cuántos kilómetros se han recorrido?");
            double longitud = tec.nextDouble();
            double precio;
            
            if (dia < 6) {
                if (hora >= 6 && hora < 22) {
                    precio = longitud * 0.73;
                    if (precio < 2.95) precio = 2.95;
                } else {
                    precio = longitud * 0.84;
                    if (precio < 4) precio = 4; 
                }
            } else {
                precio = longitud * 0.93;
            }
            
            System.out.println("El precio de tu trayecto es de " + precio + " euros");
            
            /*
            public class _18Taxi {
            final static double PRECIODIA = 0.73;
            final static double PRECIONOCHE = 0.84;
            final static double PRECIOFS = 0.93;
            final static double MINIMODIA = 2.95
            final static double MINIMONOCHE = 4
            
            System.out.println("¿Cuántas horas ha durado el recorrido?");
            int h = tec.nextInt();
            System.out.println("¿Cuántos minutos, además de las horas, ha durado el recorrido?");
            int m = tec.nextInt();
            System.out.println("¿Qué día de la semana se ha realizado el trayecto? (Del 1 al 7)");
            int d = tec.nextInt();
            System.out.println("¿Cuántos kilómetros se han recorrido?");
            double km = tec.nextDouble();
            
            //Tipo de tarifa
            boolean esFinSemana = (d == 6 || d == 7);
            //if (d == 6 || d == 7) esFinSemana = true;
            //else esFinSemana = false;
            boolean esDiurna = (h >= 6 && (h < 22 || h == 22 && m == 0));
            
            //Calculamos la carrera
            double importe;
            if (esFinSemana) importe = km * PRECIOFS;
            else
                if (esDiurna) importe = km * PRECIODIA;
            else importe = km * PRECIONOCHE;
            
            //Aplicamos minimo si corresponde
            if (esDiurna) {
                if (importe < MINIMODIA) importe = MINIMODIA;
            } else
                if (importe < MINIMONOCHE) importe = MINIMONOCHE;
            
            */
            

    }
}
