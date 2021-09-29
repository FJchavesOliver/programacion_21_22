package U1.T5;

import java.util.Scanner;

public class ej5_4 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("ESCRIBA UN NUMERO QUE USTED QUIERA PARA VER SI ES PAR O IMPAR");
        short num1 = teclado.nextShort();
        if (num1 % 2 == 0){
            System.out.println("EL NUMERO ES PAR");
        }
        else{
            System.out.println("EL NUMERO ES IMPAR");
        }
        System.out.println("ESCRIBA UN NUMERO QUE USTED QUIERA PARA VER SI ES PAR O IMPAR");
        short num2 = teclado.nextShort();
        if (num2 % 2 == 0){
            System.out.println("EL NUMERO ES PAR");
        }
        else{
            System.out.println("EL NUMERO ES IMPAR");
        }
        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("LOS DOS SON PARES");
        }
        else if (num1 % 2 == 0 || num2 % 2 == 0){
            System.out.println("ALGUNOS DE LOS DOS SON PARES");
        }
        else {
            System.out.println("NINGUNO ES PAR");
        }
    }

}
