package _02ejemplos;
/**
 * Según lo visto, un String, al no ser uno de los 8 tipos primitivos
 * debería pasarse por referencia los métodos.
 * Sin embargo los cambios hechos en el parámetro real no afectan al
 * parámetro formal porque los Strings son invariables.
 * @author Hikaru
 */
public class _20PasoParametroString {
    public static void main(String args[]){
        String saludo = "Hola";
        completarSaludo(saludo);
        
        System.out.println(saludo);
        
        //La forma adecuada de conseguirlo sería la siguiente
        saludo = completarSaludo2(saludo);

    }
    
    public static void completarSaludo (String saludo){
        saludo = saludo + " Pepe";
    }
    
    public static void completarSaludo2 (String saludo1){
        return saludo + " Pepe";
    }
}
