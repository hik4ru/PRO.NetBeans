package _03ejercicios._21EstadisticasModular;



public class _21EstadisticasModular {
    public static void main(String args[]){
        //Leemos datos
        double num1 = LecturaDatos.leerDouble("Introduce numero 1: ");
        double num2 = LecturaDatos.leerDouble("Introduce numero 2: ");
        double num3 = LecturaDatos.leerDouble("Introduce numero 3: ");
        
        //Realizamos cálculos
        double media = Estadisticas.mediaDouble(num1, num2, num3);
        double varianza = Estadisticas.varianzaDouble(num1, num2, num3);
        double desviacion = Estadisticas.desvTipica(num1, num2, num3);
        
        //Mostramos resultados 
        System.out.println("Media: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación típica: " + desviacion);
        
    }
}
