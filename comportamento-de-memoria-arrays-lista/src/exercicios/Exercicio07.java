package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n =  entrada.nextInt();
        double[] vect = new double[n];

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = entrada.nextDouble();
            soma += vect[i];
        }

        double media = soma / vect.length;
        System.out.printf("MEDIA DO VETOR: %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }
    }
}
