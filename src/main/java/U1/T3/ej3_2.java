package U1.T3;

import java.util.Scanner;

public class ej3_2 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("INTRODUZCA EL AÑO DONDE NACIO:");
        short num1 = teclado.nextShort();
        System.out.println("La Edad de usted es : "+(2021-num1) );
    }
}
