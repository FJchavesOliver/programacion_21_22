package U1.T5;

import java.util.Scanner;

public class ej5_2 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("ESCRIBA EL NUMERO 12 =");
        short num1 = teclado.nextShort();
        if (num1 == 12){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
}
}
