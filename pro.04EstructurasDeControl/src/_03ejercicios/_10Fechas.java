package _03ejercicios;

import java.util.*;

public class _10Fechas {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
            System.out.println("Introduce un día");
            int dia1 = tec.nextInt();
            System.out.println("Introduce un mes");
            int mes1 = tec.nextInt();
            System.out.println("Introduce un año con sus cuatro dígitos");
            int ano1 = tec.nextInt();
            
            System.out.println("Introduce un día");
            int dia2 = tec.nextInt();
            System.out.println("Introduce un mes");
            int mes2 = tec.nextInt();
            System.out.println("Introduce un año con sus cuatro dígitos");
            int ano2 = tec.nextInt();
            
            String fecha1 = dia1+"/"+mes1+"/"+ano1;
            String fecha2 = dia2+"/"+mes2+"/"+ano2;
            
            System.out.println("La primera fecha introducida es " + fecha1 +
                    ", y la segunda es " + fecha2);
            /*
            if (ano2 < ano1)
                System.out.println("En orden cronológico, la fecha más antigua es "
                + fecha2);
            else 
                if (ano1 < ano2)
                    System.out.println("En orden cronológico, la fecha más antigua es "
                    + fecha1);
                else
                    if (mes2 < mes1)
                        System.out.println("En orden cronológico, la fecha más antigua es "
                        + fecha2);
                    else
                        if (mes1 < mes2)
                            System.out.println("En orden cronológico, la fecha más antigua es "
                            + fecha1);
                        else
                            if (dia2 < dia1)
                                System.out.println("En orden cronológico, la fecha más antigua es "
                                + fecha2);
                            else
                                if (dia1 < dia2)
                                    System.out.println("En orden cronológico, la fecha más antigua es "
                                    + fecha1);
                                else
                                    System.out.println("Ambas fechas son iguales");
            */
            
            if (ano2 < ano1) System.out.println("En orden cronológico, la fecha más antigua es " + fecha2);
            else if (ano1 < ano2) System.out.println("En orden cronológico, la fecha más antigua es " + fecha1);
            else if (mes2 < mes1) System.out.println("En orden cronológico, la fecha más antigua es " + fecha2);
            else if (mes1 < mes2) System.out.println("En orden cronológico, la fecha más antigua es " + fecha1);
            else if (dia2 < dia1) System.out.println("En orden cronológico, la fecha más antigua es " + fecha2);
            else if (dia1 < dia2) System.out.println("En orden cronológico, la fecha más antigua es " + fecha1);
            else System.out.println("Ambas fechas son iguales");                       
            
                    
            if (ano1 < ano2 || ano1 == ano2 && mes1 < mes2 || ano1 == ano2 && mes1 == mes2 && dia1 < dia2) System.out.println(fecha1);
            else System.out.println(fecha2);
    }
}
