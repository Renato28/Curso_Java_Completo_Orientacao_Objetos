package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = entrada.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + " pessoa: ");
            altura[i] = entrada.nextDouble();
            System.out.print("Genero da " + (i + 1) + " pessoa: ");
            genero[i] = entrada.next().charAt(0);
        }

        double menor = altura[0];
        int posMenor = 0;
        for (int i = 0; i < n; i++) {
            if (altura[i] < menor) {
                menor = altura[i];
                posMenor = i;
            }
        }

        double soma = 0.0;
        int qtdeMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                soma += altura[i];
                qtdeMulheres++;
            }
        }

        double media =  soma / qtdeMulheres;

        int qtdeHomens = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                qtdeHomens++;
            }
        }

        double maior = altura[0];
        int posMaior = 0;
        for (int i = 0; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
                posMaior = i;
            }
        }

        System.out.printf("Menor altura: %s\n", altura[posMenor]);
        System.out.printf("Maior altura: %s\n", altura[posMaior]);
        System.out.printf("Media das alturas das mulheres: %.2f\n", media);
        System.out.println("Numero de homens = " + qtdeHomens);

    }
}
