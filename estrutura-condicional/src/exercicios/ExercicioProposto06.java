package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto06 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double valor =  entrada.nextDouble();

        if (valor < 0.0 || valor > 100.0) {
            System.out.println("Fora do Intervalo");
        }

        if (valor <= 25.0) {
            System.out.println("Intervalo (0, 25)");
        } else if (valor <= 50.0) {
            System.out.println("Intervalo (25, 50)");
        } else if (valor <= 75.0) {
            System.out.println("Intervalo (50, 75)");
        } else {
            System.out.println("Intervalo (75, 100)");
        }

        entrada.close();
    }
}
