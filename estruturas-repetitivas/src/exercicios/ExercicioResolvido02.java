package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();
        int soma = 0;
        int contador = 0;

        while (idade >= 0) {
            soma = soma + idade;
            contador = contador + 1;
            idade =  entrada.nextInt();
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("Media: %.2f%n", media);
        }

        entrada.close();
    }
}
