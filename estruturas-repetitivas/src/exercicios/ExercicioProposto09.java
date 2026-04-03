package exercicios;

import java.util.Scanner;

public class ExercicioProposto09 {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
