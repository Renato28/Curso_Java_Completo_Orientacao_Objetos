package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];


        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n" , sum);

        double media = sum / vect.length;
        System.out.printf("MEDIA = %.2f%n" , media);

        sc.close();
    }
}
