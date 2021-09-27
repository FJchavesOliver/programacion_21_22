package U1.T2;

import java.util.Scanner;

public class ej2_5 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Introduzca los grados Centrigrados : ");
        int num1 = teclado.nextInt();
        System.out.println("Paso de grados centrigrados a farenheit : " +num1 * 9/37);
    }

}
