package U1.T2;

import java.util.Scanner;

public class ej2_4 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Longitud en millas: ");
        int num1 = teclado.nextInt();
        System.out.println("La solucion de este calculo seria : "+num1 * 1609);
    }
}
