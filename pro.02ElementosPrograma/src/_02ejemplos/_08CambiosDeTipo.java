package _02ejemplos;

public class _08CambiosDeTipo {
    public static void main(String args[]){
        
        //Mismo tipo en parte izquierda y parte derecha de la asignación
        int a = 8;
        int b = a+1;
        long c = 5l;
        double d = 8.54;
        float e = 8.54;
        
        //Tipos compatibles: Conversión de tipo implícita
        long f = 5; //El 5 (int) se convierte a long antes de guardarlo en f
        double g = e;
        g = a;
        g = b;
        g = c;
        
        //Tipos incompatibles
        int h = 5.2;
        long i = 5.2;
        
        //Algunas "raras", porque el número no cabe en el formato que lo soporta
        short j = 2;
        byte k = 2;
        byte m = 700;
        
        //Cambio de tipo explícito: "Casting"
        int sumaEdades = 16;
        int numPersonas = 3;
        double media = sumaEdades / (double) numPersonas;
        
        //Cambio de tipo explícito con pérdida de información
        double cantidad = 5.2342
        int cantidadEntera = (int) cantidad; // cantidadEntera = 5; (acción de truncar)
    }
}
