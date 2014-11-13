package _02ejemplos;

public class _06Incremento {
    public static void main(String args[]){
        int num = 5;
        num++;
        System.out.println(num);
        
        ++num;
        System.out.println(num);
        
        num = num + 1;
        System.out.println(num);
        
        System.out.println("-------------");
        
        num = 5;
        System.out.println(num++);
        //este comando imprime primero en pantalla y luego realiza el incremento
        
        num = 5;
        System.out.println(++num);
        //este comando realiza primero el incremento y luego imprime en pantalla
    }
}
