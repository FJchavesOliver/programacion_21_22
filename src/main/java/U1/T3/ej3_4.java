package U1.T3;

import java.util.Scanner;

public class ej3_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Longitud en millas: ");
        float num1 = teclado.nextFloat();
        System.out.println("La solucion de este calculo seria : " + num1 * 1609);
    }
}
