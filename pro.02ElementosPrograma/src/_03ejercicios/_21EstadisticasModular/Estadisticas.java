package _03ejercicios._21EstadisticasModular;

public class Estadisticas {
    /**
     * Calcula y devuelve la media de tres numeros reales que
     * recibe como parámetro
     */
    
    public static double mediaDouble(double a, double b, double c){
        return (a+b+c)/3;
    }
    
    public static double varianzaDouble (double a, double b, double c){
        return (Math.pow((((a+b+c)/3)-a),2)+Math.pow((((a+b+c)/3)-b),2)+Math.pow((((a+b+c)/3)-c),2))/3;
    }
    
    public static double desvTipica(double a, double b, double c){
        double varianza = varianzaDouble(a,b,c);
        return Math.sqrt(varianza);
    }
}
