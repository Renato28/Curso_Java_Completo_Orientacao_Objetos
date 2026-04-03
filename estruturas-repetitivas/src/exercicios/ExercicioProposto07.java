package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto07 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (int i = 1; i < n; i++) {
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            if (y == 0) {
                System.out.println("Impossivel calcular");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }

        entrada.close();
    }
}
