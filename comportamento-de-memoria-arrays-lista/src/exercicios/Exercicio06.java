package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    static void main() {
        Scanner entrada =  new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = entrada.nextInt();
        int[] a =  new int[n];
        int[] b =  new int[n];
        int[] c =  new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = entrada.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
           c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\n ", c[i]);
        }

        entrada.close();
    }
}
