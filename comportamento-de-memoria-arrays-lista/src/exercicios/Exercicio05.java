package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = (int) sc.nextDouble();
        }

        double maior = vect[0];
        int posMaior = 0;

        System.out.println("MAIOR = ");
        for (int i = n - 1; i >= 0; i--) {
            if (vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);
    }
}
