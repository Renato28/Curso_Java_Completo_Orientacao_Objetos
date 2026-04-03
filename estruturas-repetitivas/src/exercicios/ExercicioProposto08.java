package exercicios;

import java.util.Scanner;

public class ExercicioProposto08 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        entrada.close();

    }
}
