package _03ejercicios;
import java.util.*;
public class _08Medidas {
    public static void main(String args[]){
        Double pies, yardas, pulgadas, centimetros, metros;
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce una distancia en pies");
        pies = tec.nextDouble();
        yardas = pies/3;
        pulgadas = pies*12;
        centimetros = pulgadas*2.54;
        metros = centimetros/100;
        System.out.println(pies + " pie(s) equivalen a " + yardas + " yardas, "
        + pulgadas + " pulgadas, " + centimetros + " centímetros y " + metros +
        " metros.");
    }
}