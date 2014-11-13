package _02ejemplos;

public class _07ParticularidadesFor {
    public static void main(String args[]){
        
        //La variable se puede declarar fuera o dentro
        //Si se declara dentro será local al bucle
        
        int num;
        for(num=1;num<=5;num++){
            System.out.println(num++);
        }
        System.out.println(num);
        
        for(int num2=1;num2<=5;num2++){
            System.out.println(num2);
        }
        //System.out.println(num2); //La variable num2 es local al for
        
        System.out.println("----------------------");
        //La INICIO y el AVANCE pueden tener más de una instrucción
        //separadas por comas
        for(int i=1, j=10; i<=j; i++,j--){
            System.out.println(i + ", " + j);
        }
        
        System.out.println("----------------------");
        //Tanto el INICIO como el AVANCE son opcionales
        //Siempre habrá que poner los ;
        int num3=1;
        for(; num3<=5 ; num3++){
            System.out.println(num3);
        }
        
        for(int num4=1; num4<=5 ;){
            System.out.println(num4);
            num4++;
        }
        
        int num5=1;
        for(;num5<=5;){
            System.out.println(num5);
            num5++;
        }
    }
}
