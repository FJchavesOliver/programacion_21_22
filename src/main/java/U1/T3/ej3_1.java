package U1.T3;

import java.util.Scanner;

public class ej3_1 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("INTRODUZCA EL PRIMER NUMERO: ");
        byte num1 = teclado.nextByte();
        System.out.println("INTRODUZCA EL SEGUNDO  NUMERO: ");
        byte num2 = teclado.nextByte();
        System.out.println("LA SUMA DE ESTO DOS NUMERO ES:" + (num1+num2));
    }
}
