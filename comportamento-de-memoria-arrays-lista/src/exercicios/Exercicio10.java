package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = entrada.nextInt();
        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno: ");
            entrada.nextLine();
            nomes[i] = entrada.nextLine();
            nota1[i] = entrada.nextDouble();
            nota2[i] = entrada.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            double media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

    }
}
