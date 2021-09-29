package U1.T5;

import java.util.Scanner;

public class ej5_5 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("ESCRIBA UN NUMERO =");
        long num1 = teclado.nextLong();
        System.out.println("ESCRIBA UN NUMERO =");
        long num2 = teclado.nextLong();
        System.out.println("ESCRIBA UN NUMERO =");
        long num3 = teclado.nextLong();
        if(num1>num2 && num1>num3){
            System.out.println("EL NUMERO MAYOR ES =" +num1 );
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("EL NUMERO MAYOR ES =" +num2);
        }
        else {
            System.out.println("EL NUMERO MAYOR ES =" +num3);
        }
    }

}
