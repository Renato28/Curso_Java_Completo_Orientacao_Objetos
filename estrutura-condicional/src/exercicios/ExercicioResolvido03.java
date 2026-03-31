package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03 {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        } else if (b < c ) {
            System.out.println("MENOR = " + b);
        } else {
            System.out.println("MENOR = " + c);
        }

        entrada.close();
    }
}
