package U1.T4;

import java.util.Scanner;

public class ej4_4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("NUMERO DECIMAL QUE QUIERESE REDONDEAR =");
        double num1 = teclado.nextDouble();
        System.out.println("REDONDEO DEL NUMERO ANTERIOR = " +Math.round(num1));
    }
}
