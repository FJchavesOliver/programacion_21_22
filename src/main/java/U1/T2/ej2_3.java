package U1.T2;

import java.util.Scanner;

public class ej2_3 {
    public static void main(String[] args) {
//int num1, num2;
        Scanner teclado =new Scanner(System.in);
        System.out.println("introduzca el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("introduzca el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.println("la division de los dos numeros es: " + num1 / num2 );
    }
}
