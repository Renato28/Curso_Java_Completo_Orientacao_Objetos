package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double nota1 =  entrada.nextDouble();
        double nota2 = entrada.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }

        entrada.close();
    }
}
