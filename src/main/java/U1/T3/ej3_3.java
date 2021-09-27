package U1.T3;

import java.util.Scanner;

public class ej3_3 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("INTRODUZCA EL PRIMER NUMERO: ");
        double num1 = teclado.nextDouble();
        System.out.println("INTRODUZCA EL PRIMER NUMERO");
        double num2 = teclado.nextDouble();
        System.out.println("LA DIVISION DE ESTO DOS NUMEROS ES "+ ( num1/num2));
    }
}
