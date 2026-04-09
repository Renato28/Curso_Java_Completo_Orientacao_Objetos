package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = entrada.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = entrada.nextInt();
        }

        int soma = 0;
        int qtdePares = 0;
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                soma += vect[i];
                qtdePares++;
            }
        }

        if (qtdePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) soma / qtdePares;
            System.out.printf("MEDIA DOS PARES: %.2f", media);
        }
    }
}
