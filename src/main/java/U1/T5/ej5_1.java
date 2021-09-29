package U1.T5;

import java.util.Scanner;

public class ej5_1 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("ESCRIBA UN NUMERO ENTERO=");
        short num1 = teclado.nextShort();
        if (num1 >= 0){
            System.out.println("POSITIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    }
}
