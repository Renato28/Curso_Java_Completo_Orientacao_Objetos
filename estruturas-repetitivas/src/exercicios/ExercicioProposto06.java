package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto06 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (int i = 1; i < n; i++) {

            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
    }
}
