package U1.T5;

import java.util.Scanner;

public class ej5_6 {
    public static void main(String[] args) {
        final double gravedad = 9.8;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INTRODUZCA EL TIEMPO =");
        long tiempo = teclado.nextLong();

        if(tiempo <= 0){
            System.out.println("TIEMPO INCORRECTO");
        }
        else {
            System.out.println("LA VELOCIDAD ES " +(gravedad+tiempo));
        }
    }
}
