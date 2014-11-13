package _02ejemplos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class _02Numeros1a100 {
    public static void main(String args[]){
        int num = 0;
        while (num <= 100) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(_02Numeros1a100.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(num);
            num++;
        }
    }
}
